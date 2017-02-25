/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.ui.highlighting;

import com.google.common.collect.Lists
import com.google.inject.Inject
import com.google.inject.Provider
import java.util.List
import java.util.Queue
import org.eclipse.emf.common.util.TreeIterator
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.common.types.JvmFormalParameter
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor
import org.eclipse.xtext.nodemodel.INode
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.eclipse.xtext.util.CancelIndicator
import org.eclipse.xtext.util.ITextRegion
import org.eclipse.xtext.util.TextRegion
import org.eclipse.xtext.xbase.XAbstractFeatureCall
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.XbasePackage
import org.eclipse.xtext.xbase.ide.highlighting.XbaseHighlightingCalculator
import org.eclipse.xtext.xbase.ide.highlighting.XbaseHighlightingStyles
import org.jnario.RichString
import org.jnario.RichStringLiteral
import org.jnario.Should
import org.jnario.richstring.AbstractRichStringPartAcceptor
import org.jnario.richstring.DefaultIndentationHandler
import org.jnario.richstring.RichStringProcessor

import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.findNodesForFeature
import static org.jnario.ui.highlighting.XtendHighlightingStyles.*

@SuppressWarnings("restriction")
public class JnarioHighlightingCalculator extends XbaseHighlightingCalculator {

	public static val String RICH_STRING_STYLE = "richStringStyle"

	@Inject Provider<DefaultIndentationHandler> indentationHandlerProvider

	@Inject
	private RichStringProcessor processor;

	override protected highlightElement(EObject object, IHighlightedPositionAcceptor acceptor,
		CancelIndicator cancelIndicator) {
		if (object instanceof XExpression) {
			highlightRichStrings(object, acceptor)
			return false;
		}
		return super.highlightElement(object, acceptor, cancelIndicator)
	}

	def protected void highlightRichStrings(XExpression expression, IHighlightedPositionAcceptor acceptor) {
		if (expression !== null) {
			var TreeIterator<EObject> iterator = EcoreUtil2.eAll(expression)
			while (iterator.hasNext()) {
				var EObject object = iterator.next()
				if (object instanceof RichString) {
					var RichStringHighlighter highlighter = createRichStringHighlighter(acceptor)
					processor.process((object as RichString), highlighter, indentationHandlerProvider.get())
					iterator.prune()
				}
			}
		}
	}

	def protected RichStringHighlighter createRichStringHighlighter(IHighlightedPositionAcceptor acceptor) {
		return new RichStringHighlighter(acceptor, this)
	}

	protected override void computeFeatureCallHighlighting(XAbstractFeatureCall featureCall,
		IHighlightedPositionAcceptor acceptor) {
		if (featureCall instanceof Should) {
			val should = featureCall as Should;
			val nodes = findNodesForFeature(should, XbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE);
			if (nodes.isEmpty()) {
				return;
			}
			for (INode node : nodes) {
				highlightNode(acceptor, node, EXTENSION_METHOD_INVOCATION);
			}
		} else {
			super.computeFeatureCallHighlighting(featureCall, acceptor);
		}
	}

//	protected def void highlightRichString(RichString rs, IHighlightedPositionAcceptor acceptor) {
//		val extension analyzer = RichStringIndentationAnalyzer.analzye(rs);
//
//		val indentation = analyzer.getIndentation();
//
//		val segments = analyzer.segments.filter(IRichStringHighlightable).toList
//
//		segments.forEach [
//			val region = it.getHighlightArea(indentation.length)
//			acceptor.addPosition(region.offset, region.length, RICH_STRING_STYLE)
//		]
//	}

	protected static class RichStringHighlighter extends AbstractRichStringPartAcceptor.ForLoopOnce {
		int currentOffset = -1
		RichStringLiteral recent = null
		final IHighlightedPositionAcceptor acceptor
		Queue<ITextRegion> pendingRegions = Lists.newLinkedList()

		extension JnarioHighlightingCalculator calculator

		new(IHighlightedPositionAcceptor acceptor, JnarioHighlightingCalculator c) {
			this.acceptor = acceptor
			this.calculator = c
		}

		override void announceNextLiteral(RichStringLiteral object) {
			resetCurrentOffset(object)
		}

		override void acceptSemanticText(CharSequence text, /* @Nullable */ RichStringLiteral origin) {
			resetCurrentOffset(origin)
			currentOffset += text.length()
		}

		def protected void resetCurrentOffset( /* @Nullable */ RichStringLiteral origin) {
			if (origin !== null && origin !== recent) {
				var INode recentNode = null
				if (recent !== null && currentOffset !== -1) {
					var List<INode> featureNodes = NodeModelUtils.findNodesForFeature(recent,
						XbasePackage.Literals.XSTRING_LITERAL__VALUE)
					if (featureNodes.size() === 1) {
						recentNode = featureNodes.get(0)
						var int closingQuoteLength = 0
						if (recentNode.getText().endsWith("'''")) {
							closingQuoteLength = 3
						} else if (recentNode.getText().endsWith("''")) {
							closingQuoteLength = 2
						} else if (recentNode.getText().endsWith("'") || recentNode.getText().endsWith("\u00AB")) {
							closingQuoteLength = 1
						}
						var int expectedOffset = recentNode.getTotalEndOffset() - closingQuoteLength
						if (expectedOffset !== currentOffset) {
							pendingRegions.add(new TextRegion(currentOffset, expectedOffset - currentOffset))
						}
					}
				}
				var List<INode> featureNodes = NodeModelUtils.findNodesForFeature(origin,
					XbasePackage.Literals.XSTRING_LITERAL__VALUE)
				if (featureNodes.size() === 1) {
					var INode node = featureNodes.get(0)
					currentOffset = node.getOffset()
					if (node.getText().charAt(0) === Character.valueOf('\'').charValue) {
						acceptor.addPosition(currentOffset, 3, INSIGNIFICANT_TEMPLATE_TEXT)
						highlightClosingQuotes(node)
						currentOffset += 3
					} else if (node.getText().startsWith("\u00AB\u00AB")) {
						var String nodeText = node.getText()
						var int lineFeed = nodeText.indexOf(Character.valueOf('\n').charValue)
						var int length = lineFeed
						var int carriageReturn = nodeText.indexOf(Character.valueOf('\r').charValue)
						if (carriageReturn !== -1) {
							if (length === -1) {
								length = carriageReturn
							} else {
								length = Math.min(carriageReturn, length)
							}
						}
						var int start = node.getTotalOffset()
						if (length === -1) {
							length = node.getTotalLength()
						}
						if (recentNode !== null && recentNode.getTotalEndOffset() === start) {
							start = start - 1
							length = length + 1
						}
						acceptor.addPosition(start, length, HighlightingStyles.COMMENT_ID)
						highlightClosingQuotes(node)
						currentOffset = start + length + 1
						if(lineFeed === carriageReturn + 1) currentOffset++
					} else {
						highlightClosingQuotes(node)
						currentOffset += 1
					}
				}
				recent = origin
			}
		}

		def protected void highlightClosingQuotes(INode node) {
			var int length = 0
			if (node.getText().endsWith("'''")) {
				length = 3
			} else if (node.getText().endsWith("''")) {
				length = 2
			} else if (node.getText().endsWith("'")) {
				length = 1
			}
			if (length !== 0) {
				acceptor.addPosition(currentOffset + node.getLength() - length, length, INSIGNIFICANT_TEMPLATE_TEXT)
			}
		}

		override void acceptTemplateText(CharSequence text, /* @Nullable */ RichStringLiteral origin) {
			resetCurrentOffset(origin)
			if (text.length() > 0) {
				var int length = text.length()
				while (!pendingRegions.isEmpty()) {
					var ITextRegion pending = pendingRegions.poll()
					length -= pending.getLength()
					acceptor.addPosition(pending.getOffset(), pending.getLength(), INSIGNIFICANT_TEMPLATE_TEXT)
				}
				if (length !== 0) {
					acceptor.addPosition(currentOffset, length, INSIGNIFICANT_TEMPLATE_TEXT)
					currentOffset += length
				}
			}
		}

		override void acceptSemanticLineBreak(int charCount, RichStringLiteral origin, boolean controlStructureSeen) {
			resetCurrentOffset(origin)
			if (controlStructureSeen)
				acceptor.addPosition(currentOffset, charCount, POTENTIAL_LINE_BREAK)
			else
				acceptor.addPosition(currentOffset, charCount, SEMANTIC_LINE_BREAK)
			currentOffset += charCount
		}

		override void acceptTemplateLineBreak(int charCount, RichStringLiteral origin) {
			resetCurrentOffset(origin)
			acceptor.addPosition(currentOffset, charCount, INSIGNIFICANT_TEMPLATE_TEXT)
			currentOffset += charCount
		}

		override void acceptIfCondition(XExpression condition) {
			highlightRichStrings(condition, acceptor)
		}

		override void acceptElseIfCondition(XExpression condition) {
			highlightRichStrings(condition, acceptor)
		}

		override void acceptForLoop(JvmFormalParameter parameter, /* @Nullable */ XExpression expression) {
			highlightRichStrings(expression, acceptor)
			super.acceptForLoop(parameter, expression)
		}

		override void acceptExpression(XExpression expression, CharSequence indentation) {
			highlightRichStrings(expression, acceptor)
		}
	}

}


interface XtendHighlightingStyles extends XbaseHighlightingStyles {
	String RICH_TEXT_ID = "xtend.richText"
	String RICH_TEXT_DELIMITER_ID = "xtend.richText.delimiter"
	String INSIGNIFICANT_TEMPLATE_TEXT = "xtend.insignificant.template.text"
	String POTENTIAL_LINE_BREAK = "xtend.potential.line.break"
	String SEMANTIC_LINE_BREAK = "xtend.template.line.break"
	String ACTIVE_ANNOTATION = "xtend.active.annotation"
	String SINGLE_LINE_COMMENT = "xtend.single.line.comment"
	String MULTI_LINE_COMMENT = "xtend.multi.line.comment"
}
