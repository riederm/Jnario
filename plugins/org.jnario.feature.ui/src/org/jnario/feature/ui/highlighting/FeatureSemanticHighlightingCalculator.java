/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.ui.highlighting;

import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.findNodesForFeature;
import static org.jnario.feature.ui.highlighting.FeatureHighlightingConfiguration.CODE_ID;
import static org.jnario.feature.ui.highlighting.FeatureHighlightingConfiguration.SCENARIO_ID;
import static org.jnario.util.Strings.getFirstWord;

import java.util.List;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XNumberLiteral;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.jnario.JnarioClass;
import org.jnario.JnarioField;
import org.jnario.JnarioMember;
import org.jnario.JnarioPackage;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepReference;
import org.jnario.feature.feature.util.FeatureSwitch;
import org.jnario.feature.jvmmodel.StepArgumentsProvider;
import org.jnario.ui.highlighting.JnarioHighlightingCalculator;
import org.jnario.util.Strings;

import com.google.inject.Inject;

/**
 * @author Birgit Engelmann - Initial contribution and API
 * @author Sebastian Benz
 */
public class FeatureSemanticHighlightingCalculator extends JnarioHighlightingCalculator {

	private class Implementation extends FeatureSwitch<Boolean> {

		private final IHighlightedPositionAcceptor acceptor;

		public Implementation(IHighlightedPositionAcceptor acceptor) {
			this.acceptor = acceptor;
		}
		
		
		@Override
		public Boolean caseScenario(Scenario scenario) {
			for (JnarioMember member : scenario.getMembers()) {
				if(member.eClass() == JnarioPackage.Literals.JNARIO_FIELD){
					JnarioField field = (JnarioField) member;

					// TODO NO_XTEND
					// highlightXtendField(field, acceptor);
					
//					XExpression initializer = field.getInitialValue();
//					highlightRichStrings(initializer, acceptor);
				}

// TODO NO_XTEND
//				for (XAnnotation annotation : member.getAnnotations()) {
//					highlightDeprecatedXtendAnnotationTarget(acceptor, member, annotation);
//				}
			}
			return highlightXtendClassName(scenario, SCENARIO_ID);
		}

		private Boolean highlightXtendClassName(JnarioClass object, String id) {
			List<INode> nodes = findNodesForFeature(object, JnarioPackage.Literals.JNARIO_TYPE_DECLARATION__NAME);
			for (INode node : nodes) {
				highlightNode(node, id, acceptor);
			}
			return Boolean.TRUE;
		}
		
		@Override
		public Boolean caseFeature(Feature feature) {
			List<INode> nodes = findNodesForFeature(feature, JnarioPackage.Literals.JNARIO_TYPE_DECLARATION__NAME);
			for (INode node : nodes) {
				highlightNode(node, FeatureHighlightingConfiguration.FEATURE_ID, acceptor);
			}
			// there is an xtext problem if the splitted token is the only rule present
			if(feature.getBackground() == null && feature.getScenarios().isEmpty()){
				nodes = findNodesForFeature(feature, FeaturePackage.Literals.FEATURE__DESCRIPTION);
				for (INode node : nodes) {
					highlightNode(node, FeatureHighlightingConfiguration.STEP_TEXT_ID, acceptor);
				}
			}
			return Boolean.TRUE;
		}
		
		@Override
		public Boolean caseStep(Step step) {
			String description;
			if(step != null && step.getName() != null){
				description = getFirstWord(stepReferenceName(step, JnarioPackage.Literals.JNARIO_FUNCTION__NAME));
				highlightStep(description, step, JnarioPackage.Literals.JNARIO_FUNCTION__NAME);
			}else if(step instanceof StepReference){
				StepReference ref = (StepReference) step;
				highlightFirstWordOfReference(ref, ref.getReference());
			}
			highlightIdentifiers(step);
			List<INode> nodes;
			if (step instanceof StepReference) {
				nodes = NodeModelUtils.findNodesForFeature(step, FeaturePackage.Literals.STEP_REFERENCE__REFERENCE);
			}else{
				nodes = NodeModelUtils.findNodesForFeature(step, JnarioPackage.Literals.JNARIO_FUNCTION__NAME);
			}
			INode lastChild = nodes.get(nodes.size()-1);
			String text = lastChild.getText();
			String trailingWhitespace = Strings.trailingWhitespace(text);
			acceptor.addPosition(lastChild.getOffset() + text.length() - trailingWhitespace.length(), trailingWhitespace.length(), CODE_ID);
			return Boolean.TRUE;
		}


		private void highlightStep(String string, EObject object, EAttribute attribute) {
			acceptor.addPosition(offset(object, attribute), string.length(),
					FeatureHighlightingConfiguration.STEP_ID);
		}

		private void highlightReference(String string, EObject object, EReference reference, String highlightConfig){
			acceptor.addPosition(offset(object, reference), string.length(), highlightConfig);
		}
		
		private void highlightFirstWordOfReference(Step reference, Step referencedStep){
			String description;
			if(referencedStep.getName() != null){
				description = getFirstWord(stepReferenceName(reference, FeaturePackage.Literals.STEP_REFERENCE__REFERENCE));
				highlightReference(description, reference, FeaturePackage.Literals.STEP_REFERENCE__REFERENCE, FeatureHighlightingConfiguration.STEP_REFERENCE_ID);
				
			}
			else{
				// unresolved reference -> take first word until whitespace
				description = getFirstWord(stepReferenceName(reference, FeaturePackage.Literals.STEP_REFERENCE__REFERENCE));
				highlightReference(description, reference, FeaturePackage.Literals.STEP_REFERENCE__REFERENCE, FeatureHighlightingConfiguration.STEP_UNRESOLVED_REFERENCE_ID);
			}
		}
		
		private String stepReferenceName(Step step, EStructuralFeature feature){
			List<INode> nodes = NodeModelUtils.findNodesForFeature(step, feature);
			// works only if keyword exists only once in Step
			return nodes.iterator().next().getText();
		}

		private int offset(EObject content, EAttribute attribute) {
			List<INode> nodes = NodeModelUtils.findNodesForFeature(content,
					attribute);
			// works only if keyword exists only once in Step
			return nodes.iterator().next().getOffset();
		}

		private int offset(EObject content, EReference reference) {
			List<INode> nodes = NodeModelUtils.findNodesForFeature(content,
					reference);
			// works only if keyword exists only once in Step
			return nodes.iterator().next().getOffset();
		}

		private void highlightIdentifiers(Step step){
			String name;
			final int offset;
			if(step instanceof StepReference){
				name = stepReferenceName(step, FeaturePackage.Literals.STEP_REFERENCE__REFERENCE);
				offset = offset(step, FeaturePackage.Literals.STEP_REFERENCE__REFERENCE);
			}
			else{
				name = step.getName();
				offset = offset(step, JnarioPackage.Literals.JNARIO_FUNCTION__NAME);
			}
			if(name != null){
				argumentsProvider.findStepArguments(step, new StepArgumentsProvider.ArgumentAcceptor() {
					public void accept(String arg, int localOffset, int length) {
						acceptor.addPosition(offset + localOffset, length, FeatureHighlightingConfiguration.IDENTIFIERS_ID);
					}
				});
			}
		}

		
	}
	
	@Inject
	private StepArgumentsProvider argumentsProvider;


	protected EObject root(XtextResource resource) {
		return resource.getParseResult().getRootASTElement();
	}



	protected boolean noNodeModel(XtextResource resource) {
		return resource == null || resource.getParseResult() == null
				|| root(resource) == null;
	}
	
	protected void searchAndHighlightElements(XtextResource resource, IHighlightedPositionAcceptor acceptor) {
		Implementation highlighter = new Implementation(acceptor);
		
		TreeIterator<EObject> iterator = resource.getAllContents();
		while (iterator.hasNext()) {
			EObject object = iterator.next();
			ICompositeNode node = NodeModelUtils.getNode(object);
			if(node != null){
				highlighter.doSwitch(object);
				if (object instanceof XAbstractFeatureCall) {
					computeFeatureCallHighlighting((XAbstractFeatureCall) object, acceptor);
				}
//				if (object instanceof ExampleTable) {
//					highlightExampleHeader((ExampleTable) object, acceptor);
//				}
				// Handle XAnnotation in a special way because we want the @ highlighted too
				if (object instanceof XNumberLiteral) {
					highlightNumberLiterals((XNumberLiteral) object, acceptor);
				} if (object instanceof XAnnotation) {
					highlightAnnotation((XAnnotation) object, acceptor);
				} else {
					computeReferencedJvmTypeHighlighting(acceptor, object, CancelIndicator.NullImpl);
				}
			}
		}
	}
	
//	private void highlightExampleHeader(ExampleTable table, IHighlightedPositionAcceptor acceptor){
//		if(table == null){
//			return;
//		}
//		for (int i = 0; i < table.getColumns().size(); i++) {
//			XtendField element = table.getColumns().get(i);
//			INode node = NodeModelUtils.getNode(element);
//			highlightNode(node, FeatureHighlightingConfiguration.IDENTIFIERS_ID, acceptor);
//			if(table.getColumns().size() == i + 1){
//				highlightTableHeadingEnd(node.getNextSibling(), acceptor);
//			}
//		}
//	}
//
//	private void highlightTableHeadingEnd(INode node, IHighlightedPositionAcceptor acceptor) {
//		while(node instanceof LeafNode){
//			if(!((LeafNode)node).isHidden()){
//				highlightNode(node, FeatureHighlightingConfiguration.IDENTIFIERS_ID, acceptor);
//				return;
//			}
//			node = node.getNextSibling();
//		}
//	}
	
	//signature changed in version 2.10
	public void highlightNode(INode node, String id, IHighlightedPositionAcceptor acceptor) {
		super.highlightNode(acceptor, node, id);
	}

}
