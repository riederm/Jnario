/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.ui.highlighting;

import com.google.common.collect.Lists;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.List;
import java.util.Queue;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.ide.editor.syntaxcoloring.HighlightingStyles;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.TextRegion;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.ide.highlighting.XbaseHighlightingCalculator;
import org.eclipse.xtext.xbase.ide.highlighting.XbaseHighlightingStyles;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.RichString;
import org.jnario.RichStringLiteral;
import org.jnario.Should;
import org.jnario.richstring.AbstractRichStringPartAcceptor;
import org.jnario.richstring.DefaultIndentationHandler;
import org.jnario.richstring.RichStringProcessor;
import org.jnario.ui.highlighting.XtendHighlightingStyles;

@SuppressWarnings("restriction")
public class JnarioHighlightingCalculator extends XbaseHighlightingCalculator {
  protected static class RichStringHighlighter extends AbstractRichStringPartAcceptor.ForLoopOnce {
    private int currentOffset = (-1);
    
    private RichStringLiteral recent = null;
    
    private final IHighlightedPositionAcceptor acceptor;
    
    private Queue<ITextRegion> pendingRegions = Lists.<ITextRegion>newLinkedList();
    
    @Extension
    private JnarioHighlightingCalculator calculator;
    
    public RichStringHighlighter(final IHighlightedPositionAcceptor acceptor, final JnarioHighlightingCalculator c) {
      this.acceptor = acceptor;
      this.calculator = c;
    }
    
    @Override
    public void announceNextLiteral(final RichStringLiteral object) {
      this.resetCurrentOffset(object);
    }
    
    @Override
    public void acceptSemanticText(final CharSequence text, final RichStringLiteral origin) {
      this.resetCurrentOffset(origin);
      int _currentOffset = this.currentOffset;
      int _length = text.length();
      this.currentOffset = (_currentOffset + _length);
    }
    
    protected void resetCurrentOffset(final RichStringLiteral origin) {
      if (((origin != null) && (origin != this.recent))) {
        INode recentNode = null;
        if (((this.recent != null) && (this.currentOffset != (-1)))) {
          List<INode> featureNodes = NodeModelUtils.findNodesForFeature(this.recent, 
            XbasePackage.Literals.XSTRING_LITERAL__VALUE);
          int _size = featureNodes.size();
          boolean _tripleEquals = (_size == 1);
          if (_tripleEquals) {
            recentNode = featureNodes.get(0);
            int closingQuoteLength = 0;
            boolean _endsWith = recentNode.getText().endsWith("\'\'\'");
            if (_endsWith) {
              closingQuoteLength = 3;
            } else {
              boolean _endsWith_1 = recentNode.getText().endsWith("\'\'");
              if (_endsWith_1) {
                closingQuoteLength = 2;
              } else {
                if ((recentNode.getText().endsWith("\'") || recentNode.getText().endsWith("«"))) {
                  closingQuoteLength = 1;
                }
              }
            }
            int _totalEndOffset = recentNode.getTotalEndOffset();
            int expectedOffset = (_totalEndOffset - closingQuoteLength);
            if ((expectedOffset != this.currentOffset)) {
              TextRegion _textRegion = new TextRegion(this.currentOffset, (expectedOffset - this.currentOffset));
              this.pendingRegions.add(_textRegion);
            }
          }
        }
        List<INode> featureNodes_1 = NodeModelUtils.findNodesForFeature(origin, 
          XbasePackage.Literals.XSTRING_LITERAL__VALUE);
        int _size_1 = featureNodes_1.size();
        boolean _tripleEquals_1 = (_size_1 == 1);
        if (_tripleEquals_1) {
          INode node = featureNodes_1.get(0);
          this.currentOffset = node.getOffset();
          char _charAt = node.getText().charAt(0);
          char _charValue = Character.valueOf('\'').charValue();
          boolean _tripleEquals_2 = (_charAt == _charValue);
          if (_tripleEquals_2) {
            this.acceptor.addPosition(this.currentOffset, 3, XtendHighlightingStyles.INSIGNIFICANT_TEMPLATE_TEXT);
            this.highlightClosingQuotes(node);
            int _currentOffset = this.currentOffset;
            this.currentOffset = (_currentOffset + 3);
          } else {
            boolean _startsWith = node.getText().startsWith("««");
            if (_startsWith) {
              String nodeText = node.getText();
              int lineFeed = nodeText.indexOf(Character.valueOf('\n').charValue());
              int length = lineFeed;
              int carriageReturn = nodeText.indexOf(Character.valueOf('\r').charValue());
              if ((carriageReturn != (-1))) {
                if ((length == (-1))) {
                  length = carriageReturn;
                } else {
                  length = Math.min(carriageReturn, length);
                }
              }
              int start = node.getTotalOffset();
              if ((length == (-1))) {
                length = node.getTotalLength();
              }
              if (((recentNode != null) && (recentNode.getTotalEndOffset() == start))) {
                start = (start - 1);
                length = (length + 1);
              }
              this.acceptor.addPosition(start, length, HighlightingStyles.COMMENT_ID);
              this.highlightClosingQuotes(node);
              this.currentOffset = ((start + length) + 1);
              if ((lineFeed == (carriageReturn + 1))) {
                this.currentOffset++;
              }
            } else {
              this.highlightClosingQuotes(node);
              int _currentOffset_1 = this.currentOffset;
              this.currentOffset = (_currentOffset_1 + 1);
            }
          }
        }
        this.recent = origin;
      }
    }
    
    protected void highlightClosingQuotes(final INode node) {
      int length = 0;
      boolean _endsWith = node.getText().endsWith("\'\'\'");
      if (_endsWith) {
        length = 3;
      } else {
        boolean _endsWith_1 = node.getText().endsWith("\'\'");
        if (_endsWith_1) {
          length = 2;
        } else {
          boolean _endsWith_2 = node.getText().endsWith("\'");
          if (_endsWith_2) {
            length = 1;
          }
        }
      }
      if ((length != 0)) {
        int _length = node.getLength();
        int _plus = (this.currentOffset + _length);
        int _minus = (_plus - length);
        this.acceptor.addPosition(_minus, length, XtendHighlightingStyles.INSIGNIFICANT_TEMPLATE_TEXT);
      }
    }
    
    @Override
    public void acceptTemplateText(final CharSequence text, final RichStringLiteral origin) {
      this.resetCurrentOffset(origin);
      int _length = text.length();
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        int length = text.length();
        while ((!this.pendingRegions.isEmpty())) {
          {
            ITextRegion pending = this.pendingRegions.poll();
            int _length_1 = length;
            int _length_2 = pending.getLength();
            length = (_length_1 - _length_2);
            this.acceptor.addPosition(pending.getOffset(), pending.getLength(), XtendHighlightingStyles.INSIGNIFICANT_TEMPLATE_TEXT);
          }
        }
        if ((length != 0)) {
          this.acceptor.addPosition(this.currentOffset, length, XtendHighlightingStyles.INSIGNIFICANT_TEMPLATE_TEXT);
          int _currentOffset = this.currentOffset;
          this.currentOffset = (_currentOffset + length);
        }
      }
    }
    
    @Override
    public void acceptSemanticLineBreak(final int charCount, final RichStringLiteral origin, final boolean controlStructureSeen) {
      this.resetCurrentOffset(origin);
      if (controlStructureSeen) {
        this.acceptor.addPosition(this.currentOffset, charCount, XtendHighlightingStyles.POTENTIAL_LINE_BREAK);
      } else {
        this.acceptor.addPosition(this.currentOffset, charCount, XtendHighlightingStyles.SEMANTIC_LINE_BREAK);
      }
      int _currentOffset = this.currentOffset;
      this.currentOffset = (_currentOffset + charCount);
    }
    
    @Override
    public void acceptTemplateLineBreak(final int charCount, final RichStringLiteral origin) {
      this.resetCurrentOffset(origin);
      this.acceptor.addPosition(this.currentOffset, charCount, XtendHighlightingStyles.INSIGNIFICANT_TEMPLATE_TEXT);
      int _currentOffset = this.currentOffset;
      this.currentOffset = (_currentOffset + charCount);
    }
    
    @Override
    public void acceptIfCondition(final XExpression condition) {
      this.calculator.highlightRichStrings(condition, this.acceptor);
    }
    
    @Override
    public void acceptElseIfCondition(final XExpression condition) {
      this.calculator.highlightRichStrings(condition, this.acceptor);
    }
    
    @Override
    public void acceptForLoop(final JvmFormalParameter parameter, final XExpression expression) {
      this.calculator.highlightRichStrings(expression, this.acceptor);
      super.acceptForLoop(parameter, expression);
    }
    
    @Override
    public void acceptExpression(final XExpression expression, final CharSequence indentation) {
      this.calculator.highlightRichStrings(expression, this.acceptor);
    }
  }
  
  public final static String RICH_STRING_STYLE = "richStringStyle";
  
  @Inject
  private Provider<DefaultIndentationHandler> indentationHandlerProvider;
  
  @Inject
  private RichStringProcessor processor;
  
  @Override
  protected boolean highlightElement(final EObject object, final IHighlightedPositionAcceptor acceptor, final CancelIndicator cancelIndicator) {
    if ((object instanceof XExpression)) {
      this.highlightRichStrings(((XExpression)object), acceptor);
      return false;
    }
    return super.highlightElement(object, acceptor, cancelIndicator);
  }
  
  protected void highlightRichStrings(final XExpression expression, final IHighlightedPositionAcceptor acceptor) {
    if ((expression != null)) {
      TreeIterator<EObject> iterator = EcoreUtil2.eAll(expression);
      while (iterator.hasNext()) {
        {
          EObject object = iterator.next();
          if ((object instanceof RichString)) {
            JnarioHighlightingCalculator.RichStringHighlighter highlighter = this.createRichStringHighlighter(acceptor);
            this.processor.process(((RichString) object), highlighter, this.indentationHandlerProvider.get());
            iterator.prune();
          }
        }
      }
    }
  }
  
  protected JnarioHighlightingCalculator.RichStringHighlighter createRichStringHighlighter(final IHighlightedPositionAcceptor acceptor) {
    return new JnarioHighlightingCalculator.RichStringHighlighter(acceptor, this);
  }
  
  @Override
  protected void computeFeatureCallHighlighting(final XAbstractFeatureCall featureCall, final IHighlightedPositionAcceptor acceptor) {
    if ((featureCall instanceof Should)) {
      final Should should = ((Should) featureCall);
      final List<INode> nodes = NodeModelUtils.findNodesForFeature(should, XbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE);
      boolean _isEmpty = nodes.isEmpty();
      if (_isEmpty) {
        return;
      }
      for (final INode node : nodes) {
        this.highlightNode(acceptor, node, XbaseHighlightingStyles.EXTENSION_METHOD_INVOCATION);
      }
    } else {
      super.computeFeatureCallHighlighting(featureCall, acceptor);
    }
  }
}
