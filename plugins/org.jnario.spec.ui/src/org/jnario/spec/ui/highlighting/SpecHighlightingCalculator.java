/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.ui.highlighting;

import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.findNodesForFeature;
import static org.eclipse.xtext.xbase.ui.highlighting.XbaseHighlightingConfiguration.EXTENSION_METHOD_INVOCATION;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.jnario.ExampleTable;
import org.jnario.JnarioField;
import org.jnario.JnarioFunction;
import org.jnario.JnarioMember;
import org.jnario.JnarioPackage;
import org.jnario.spec.services.SpecGrammarAccess;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecFile;
import org.jnario.spec.spec.SpecPackage;
import org.jnario.spec.spec.TestFunction;
import org.jnario.ui.highlighting.JnarioHighlightingCalculator;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class SpecHighlightingCalculator extends JnarioHighlightingCalculator {

	@Inject
	private SpecGrammarAccess specGrammarAccess;
	
	@Override
	protected void doProvideHighlightingFor(XtextResource resource, IHighlightedPositionAcceptor acceptor, CancelIndicator c) {
		EObject root = resource.getContents().get(0);
		if (!(root instanceof SpecFile)) {
			return;
		}
		SpecFile file = (SpecFile) root;
		for (ExampleGroup exampleGroup : Iterables.filter(file.getXtendTypes(), ExampleGroup.class)) {
			for (XAnnotation annotation : exampleGroup.getAnnotations()) {
				// TODO NO_XTEND
				// highlightDeprecatedXtendAnnotationTarget(acceptor, exampleGroup, annotation);
			}
			provideHighlightingFor(exampleGroup, acceptor);
		}
		super.doProvideHighlightingFor(resource, acceptor,c);
	}

	protected void provideHighlightingFor(ExampleGroup exampleGroup,
			IHighlightedPositionAcceptor acceptor) {
		if (exampleGroup != null) {
			for (JnarioMember member : exampleGroup.getMembers()) {
				if (JnarioPackage.Literals.JNARIO_FUNCTION.isSuperTypeOf(member.eClass())) {
					JnarioFunction function = (JnarioFunction) member;
					XExpression rootExpression = function.getExpression();
					// TODO NO_XTEND
					// highlightRichStrings(rootExpression, acceptor);
				}else if(member.eClass() == JnarioPackage.Literals.JNARIO_FIELD){
					JnarioField field = (JnarioField) member;
					// TODO NO_XTEND
					// highlightXtendField(field,acceptor);
					//XExpression initializer = field.getInitialValue();
					//highlightRichStrings(initializer, acceptor);
				}else if(member.eClass() == SpecPackage.Literals.EXAMPLE){
					Example example = (Example) member;
					// TODO NO_XTEND
					// highlightRichStrings(example.getExpression() ,acceptor);
				}else if(member.eClass() == SpecPackage.Literals.EXAMPLE_GROUP){
					ExampleGroup subExampleGroup = (ExampleGroup) member;
					provideHighlightingFor(subExampleGroup,acceptor);
				}else if(member.eClass() == JnarioPackage.Literals.EXAMPLE_TABLE){
					provideHighlightingFor((ExampleTable)member,acceptor);
				}else if(member.eClass() == SpecPackage.Literals.TEST_FUNCTION){
					TestFunction function = (TestFunction) member;
					// TODO NO_XTEND
					// highlightRichStrings(function.getExpression() ,acceptor);
				}
				for (XAnnotation annotation : member.getAnnotations()) {
					// TODO NO_XTEND
					// highlightDeprecatedXtendAnnotationTarget(acceptor, member, annotation);
				}
			}
		}
	}

	private void provideHighlightingFor(ExampleTable table, IHighlightedPositionAcceptor acceptor) {
		if(table == null){
			return;
		}
		List<INode> nodes = findNodesForFeature(table, JnarioPackage.Literals.EXAMPLE_TABLE__COLUMNS);
		if(nodes.isEmpty()){
			return;
		}
		highlighColumnNode(acceptor, nodes.get(0).getPreviousSibling());
		for (INode node : nodes) {
			highlighColumnNode(acceptor, node);
		}
	}

	private void highlighColumnNode(IHighlightedPositionAcceptor acceptor,
			INode node) {
		highlightNode(acceptor, node, EXTENSION_METHOD_INVOCATION);
	}

	
	protected TerminalRule getRichStringTerminalRule() {
		return specGrammarAccess.getSTRINGRule();
	}
	

}
