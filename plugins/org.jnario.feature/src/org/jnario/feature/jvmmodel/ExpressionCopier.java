package org.jnario.feature.jvmmodel;

import java.util.ArrayList;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil.Copier;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.XFeatureCall;
import org.eclipse.xtext.xbase.XMemberFeatureCall;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociator;
import org.jnario.JnarioField;
import org.jnario.util.SourceAdapter;

import com.google.inject.Inject;

@SuppressWarnings("serial")
public class ExpressionCopier{
	
	private class Implementation extends Copier{
		public Implementation() {
			super(true);
		}
		
		@Override
		public EObject copy(EObject source) {
			if (source == null) {
				return null;
			}

			EObject target = super.copy(source);
			//modelAssociator.associate(source, target);
			source.eResource().getContents().add(target);
			modelAssociator.removeAllAssociation(target);
//			Set<EObject> jvmElements = jvmModelAssociations.getJvmElements(target);
//			for (EObject eObject : new ArrayList<EObject>(jvmElements)) {
//				modelAssociator.removeAllAssociation(eObject);
//			}
			
			if (source instanceof XAbstractFeatureCall) {
				XAbstractFeatureCall sourceFeatureCall = (XAbstractFeatureCall) source;
				XAbstractFeatureCall targetFeatureCall = (XAbstractFeatureCall) target;
				targetFeatureCall.setFeature(sourceFeatureCall.getFeature());
				targetFeatureCall.setImplicitFirstArgument((XExpression) copy(sourceFeatureCall.getImplicitFirstArgument()));
				targetFeatureCall.setImplicitReceiver((XExpression) copy(sourceFeatureCall.getImplicitReceiver()));
			}
			if (source instanceof XMemberFeatureCall) {
				XMemberFeatureCall sourceFeatureCall = (XMemberFeatureCall) source;
				XMemberFeatureCall targetFeatureCall = (XMemberFeatureCall) target;
				targetFeatureCall.setExplicitOperationCall(sourceFeatureCall.isExplicitOperationCall());
				targetFeatureCall.setExplicitStatic(sourceFeatureCall.isExplicitStatic());
				targetFeatureCall.setTypeLiteral(sourceFeatureCall.isTypeLiteral());
				targetFeatureCall.setStaticWithDeclaringType(sourceFeatureCall.isStaticWithDeclaringType());
			}
			if (source instanceof XFeatureCall) {
				XFeatureCall sourceFeatureCall = (XFeatureCall) source;
				XFeatureCall targetFeatureCall = (XFeatureCall) target;
				targetFeatureCall.setExplicitOperationCall(sourceFeatureCall.isExplicitOperationCall());
				targetFeatureCall.setTypeLiteral(sourceFeatureCall.isTypeLiteral());
			}
			if(source instanceof XExpression || source instanceof JnarioField){
				SourceAdapter.adapt(target, source);
			}
			return target;
		}
	}

	@Inject IJvmModelAssociator modelAssociator;
	@Inject IJvmModelAssociations jvmModelAssociations;
	
	public <T extends EObject> T cloneWithProxies(T original) {
		if (original == null)
			return original;
		
		Implementation copier = new Implementation();
		@SuppressWarnings("unchecked")
		T copy = (T) copier.copy(original);
		copier.copyReferences();
		return copy;
	}
	
}
