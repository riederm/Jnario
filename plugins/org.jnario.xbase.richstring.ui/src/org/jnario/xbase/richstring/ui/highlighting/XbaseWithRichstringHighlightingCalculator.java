/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.xbase.richstring.ui.highlighting;

import static org.jnario.xbase.richstring.ui.highlighting.XbaseWithRichstringHighlightingConfiguration.INSIGNIFICANT_TEMPLATE_TEXT;
import static org.jnario.xbase.richstring.ui.highlighting.XbaseWithRichstringHighlightingConfiguration.POTENTIAL_LINE_BREAK;
import static org.jnario.xbase.richstring.ui.highlighting.XbaseWithRichstringHighlightingConfiguration.SEMANTIC_LINE_BREAK;

import java.util.List;
import java.util.Queue;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.ide.highlighting.XbaseHighlightingCalculator;
import org.jnario.xbase.richstring.services.XbaseWithRichstringGrammarAccess;
import org.jnario.xbase.richstring.util.AbstractRichStringPartAcceptor;
import org.jnario.xbase.richstring.util.DefaultIndentationHandler;
import org.jnario.xbase.richstring.util.RichStringProcessor;
import org.jnario.xbase.richstring.xbasewithrichstring.RichString;
import org.jnario.xbase.richstring.xbasewithrichstring.RichStringLiteral;
import org.jnario.xbase.richstring.xbasewithrichstring.XbaseWithRichstringPackage;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Provider;

@SuppressWarnings("restriction")
public abstract class XbaseWithRichstringHighlightingCalculator extends XbaseHighlightingCalculator {
	@Inject
	private RichStringProcessor processor;
	
	@Inject
	private Provider<DefaultIndentationHandler> indentationHandlerProvider;
	
	@Inject
	private XbaseWithRichstringGrammarAccess grammarAccess;
	
	@Override
	protected boolean highlightElement(EObject object, IHighlightedPositionAcceptor acceptor,
			CancelIndicator cancelIndicator) {
		if (object.eClass().getEPackage() == XbaseWithRichstringPackage.eINSTANCE){
			operationCanceledManager.checkCanceled(cancelIndicator);
			
			switch (object.eClass().getClassifierID()) {
				case XbaseWithRichstringPackage.RICH_STRING:
					highlightRichstring(acceptor, object);
					break;
				default:
					return super.highlightElement(object, acceptor, cancelIndicator);
			}

			//????
//			highlightAnnotation((JnarioAnnotationTarget)object, acceptor);
			return false;
		}else{
			return super.highlightElement(object, acceptor, cancelIndicator);
		}
	}
	protected void highlightRichstring(IHighlightedPositionAcceptor acceptor, EObject expression) {
		if (expression != null) {
			TreeIterator<EObject> iterator = EcoreUtil2.eAll(expression);
			while (iterator.hasNext()) {
				EObject object = iterator.next();
				if (object instanceof RichString) {
					RichStringHighlighter highlighter = createRichStringHighlighter(acceptor);
					processor.process((RichString) object, highlighter, indentationHandlerProvider.get());
					iterator.prune();
				}
			}
		}
	}
	
	protected TerminalRule getRichStringTerminalRule() {
		return grammarAccess.getSTRINGRule();
	}
	
	protected RichStringHighlighter createRichStringHighlighter(IHighlightedPositionAcceptor acceptor) {
		return new RichStringHighlighter(acceptor);
	}

	protected class RichStringHighlighter extends AbstractRichStringPartAcceptor.ForLoopOnce {

		private int currentOffset = -1;
		private RichStringLiteral recent = null;
		private final IHighlightedPositionAcceptor acceptor;
		private Queue<ITextRegion> pendingRegions = Lists.newLinkedList();

		public RichStringHighlighter(IHighlightedPositionAcceptor acceptor) {
			this.acceptor = acceptor;
		}

		@Override
		public void announceNextLiteral(RichStringLiteral object) {
			resetCurrentOffset(object);
		}

		@Override
		public void acceptSemanticText(CharSequence text, /* @Nullable */ RichStringLiteral origin) {
			resetCurrentOffset(origin);
			currentOffset += text.length();
		}

		protected void resetCurrentOffset(/* @Nullable */ RichStringLiteral origin) {
			if (origin != null && origin != recent) {
				INode recentNode = null;
				if (recent != null && currentOffset != -1) {
					List<INode> featureNodes = NodeModelUtils.findNodesForFeature(recent,
							XbasePackage.Literals.XSTRING_LITERAL__VALUE);
					if (featureNodes.size() == 1) {
						recentNode = featureNodes.get(0);
						int closingQuoteLength = 0;
						if (recentNode.getText().endsWith("'''")) {
							closingQuoteLength = 3;
						} else if (recentNode.getText().endsWith("''")) {
							closingQuoteLength = 2;
						} else if (recentNode.getText().endsWith("'") || recentNode.getText().endsWith("\u00AB")) {
							closingQuoteLength = 1;
						}
						int expectedOffset = recentNode.getTotalEndOffset() - closingQuoteLength;
						if (expectedOffset != currentOffset) {
							pendingRegions.add(new TextRegion(currentOffset, expectedOffset - currentOffset));
						}
					}
				}
				List<INode> featureNodes = NodeModelUtils.findNodesForFeature(origin,
						XbasePackage.Literals.XSTRING_LITERAL__VALUE);
				if (featureNodes.size() == 1) {
					INode node = featureNodes.get(0);
					currentOffset = node.getOffset();
					if (node.getText().charAt(0) == '\'') {
						acceptor.addPosition(currentOffset, 3, INSIGNIFICANT_TEMPLATE_TEXT);
						highlightClosingQuotes(node);
						currentOffset += 3;
					} else if (node.getText().startsWith("\u00AB\u00AB")) {
						String nodeText = node.getText();
						int lineFeed = nodeText.indexOf('\n');
						int length = lineFeed; 
						int carriageReturn = nodeText.indexOf('\r');
						if (carriageReturn != -1) {
							if (length == -1) {
								length = carriageReturn;
							} else {
								length = Math.min(carriageReturn, length);
							}
						}
						int start = node.getTotalOffset();
						if (length == -1) {
							length = node.getTotalLength();
						}
						if (recentNode != null && recentNode.getTotalEndOffset() == start) {
							start = start - 1;
							length = length + 1;
						}
						acceptor.addPosition(start, length, HighlightingStyles.COMMENT_ID);
						highlightClosingQuotes(node);
						currentOffset = start + length + 1;
						if (lineFeed == carriageReturn + 1)
							currentOffset++;
					} else {
						highlightClosingQuotes(node);
						currentOffset += 1;
					}
				}
				recent = origin;
			}
		}

		protected void highlightClosingQuotes(INode node) {
			int length = 0;
			if (node.getText().endsWith("'''")) {
				length = 3;
			} else if (node.getText().endsWith("''")) {
				length = 2;
			} else if (node.getText().endsWith("'")) {
				length = 1;
			}
			if (length != 0) {
				acceptor.addPosition(currentOffset + node.getLength() - length, length,
						INSIGNIFICANT_TEMPLATE_TEXT);
			}
		}

		@Override
		public void acceptTemplateText(CharSequence text, /* @Nullable */ RichStringLiteral origin) {
			resetCurrentOffset(origin);
			if (text.length() > 0) {
				int length = text.length();
				while (!pendingRegions.isEmpty()) {
					ITextRegion pending = pendingRegions.poll();
					length -= pending.getLength();
					acceptor.addPosition(pending.getOffset(), pending.getLength(),
							INSIGNIFICANT_TEMPLATE_TEXT);
				}
				if (length != 0) {
					acceptor.addPosition(currentOffset, length, INSIGNIFICANT_TEMPLATE_TEXT);
					currentOffset += length;
				}
			}
		}

		@Override
		public void acceptSemanticLineBreak(int charCount, RichStringLiteral origin, boolean controlStructureSeen) {
			resetCurrentOffset(origin);
			if (controlStructureSeen)
				acceptor.addPosition(currentOffset, charCount, POTENTIAL_LINE_BREAK);
			else
				acceptor.addPosition(currentOffset, charCount, SEMANTIC_LINE_BREAK);
			currentOffset += charCount;
		}

		@Override
		public void acceptTemplateLineBreak(int charCount, RichStringLiteral origin) {
			resetCurrentOffset(origin);
			acceptor.addPosition(currentOffset, charCount, INSIGNIFICANT_TEMPLATE_TEXT);
			currentOffset += charCount;
		}

		
		@Override
		public void acceptExpression(XExpression expression, CharSequence indentation) {
			highlightRichstring(acceptor, expression);
		}
	}
	
}
