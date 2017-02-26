/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.ui.highlighting;

import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingCalculator;
import org.jnario.suite.suite.PatternReference;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuitePackage;
import org.jnario.suite.ui.highlighting.SuiteHighlightingConfiguration;
import org.jnario.util.Strings;

@SuppressWarnings("all")
public class SuiteHighlightingCalculator extends XbaseHighlightingCalculator {
  @Override
  public void searchAndHighlightElements(final XtextResource resource, final IHighlightedPositionAcceptor acceptor) {
    final Procedure1<EObject> _function = new Procedure1<EObject>() {
      @Override
      public void apply(final EObject it) {
        SuiteHighlightingCalculator.this.highlight(it, acceptor);
      }
    };
    IteratorExtensions.<EObject>forEach(resource.getAllContents(), _function);
  }
  
  protected Void _highlight(final SpecReference ref, final IHighlightedPositionAcceptor acceptor) {
    this.highlightObjectAtFeature(acceptor, ref, SuitePackage.eINSTANCE.getSpecReference_Spec(), SuiteHighlightingConfiguration.LINK_ID);
    return null;
  }
  
  protected Void _highlight(final PatternReference ref, final IHighlightedPositionAcceptor acceptor) {
    this.highlightObjectAtFeature(acceptor, ref, SuitePackage.eINSTANCE.getPatternReference_Pattern(), SuiteHighlightingConfiguration.PATTERN_ID);
    return null;
  }
  
  protected Void _highlight(final Suite suite, final IHighlightedPositionAcceptor acceptor) {
    final ICompositeNode node = NodeModelUtils.getNode(suite);
    int lineEnd = Strings.indexOfNewLine(suite.getName());
    if ((lineEnd == (-1))) {
      lineEnd = suite.getName().length();
    }
    acceptor.addPosition(node.getOffset(), lineEnd, SuiteHighlightingConfiguration.SUITE_ID);
    return null;
  }
  
  protected Void _highlight(final EObject ref, final IHighlightedPositionAcceptor acceptor) {
    return null;
  }
  
  public Void highlight(final EObject suite, final IHighlightedPositionAcceptor acceptor) {
    if (suite instanceof Suite) {
      return _highlight((Suite)suite, acceptor);
    } else if (suite instanceof PatternReference) {
      return _highlight((PatternReference)suite, acceptor);
    } else if (suite instanceof SpecReference) {
      return _highlight((SpecReference)suite, acceptor);
    } else if (suite != null) {
      return _highlight(suite, acceptor);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(suite, acceptor).toString());
    }
  }
}
