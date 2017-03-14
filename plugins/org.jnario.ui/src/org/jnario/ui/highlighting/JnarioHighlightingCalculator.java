/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.ui.highlighting;

import static org.eclipse.xtext.nodemodel.util.NodeModelUtils.findNodesForFeature;

import java.util.List;

import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.ide.editor.syntaxcoloring.IHighlightedPositionAcceptor;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XbasePackage;
import org.eclipse.xtext.xbase.ide.highlighting.XbaseHighlightingCalculator;
import org.jnario.Should;
import org.jnario.xbase.richstring.ui.highlighting.XbaseWithRichstringHighlightingCalculator;

public abstract class JnarioHighlightingCalculator extends XbaseWithRichstringHighlightingCalculator {
	
	@Override
	protected void computeFeatureCallHighlighting(
			XAbstractFeatureCall featureCall,
			IHighlightedPositionAcceptor acceptor) {
		if (featureCall instanceof Should) {
			Should should = (Should) featureCall;
			List<INode> nodes = findNodesForFeature(should, XbasePackage.Literals.XABSTRACT_FEATURE_CALL__FEATURE);
			if(nodes.isEmpty()){
				return;
			}
			for (INode node : nodes) {
				highlightNode(acceptor, node, EXTENSION_METHOD_INVOCATION);
			}
		}else{
			super.computeFeatureCallHighlighting(featureCall, acceptor);
		}
	}

	@Override
	protected void highlightSpecialIdentifiers(ILeafNode node,
			IHighlightedPositionAcceptor acceptor, TerminalRule idRule) {
		super.highlightSpecialIdentifiers(node, acceptor, idRule);
		
//		EObject element = node.getGrammarElement();
//		EObject rule = getRichStringTerminalRule();
//		if (element == rule || (element instanceof RuleCall && ((RuleCall) element).getRule() == rule)) {
//			if (!node.getText().startsWith("'''")) {
//				return;
//			}
//			List<TextRegion> regionList = jnarioRichStringProcessor.process(node.getText());
//			if (regionList != null) {
//				for (TextRegion textRegion : regionList) {
//					acceptor.addPosition(node.getOffset() + textRegion.getOffset(), textRegion.getLength(), RICH_TEXT_ID);
//				}
//			}
//		}
	}
}
