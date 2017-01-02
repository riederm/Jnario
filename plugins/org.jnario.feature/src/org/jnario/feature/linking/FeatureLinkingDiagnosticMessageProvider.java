package org.jnario.feature.linking;

import org.eclipse.xtext.diagnostics.DiagnosticMessage;
import org.eclipse.xtext.xbase.annotations.validation.UnresolvedAnnotationTypeAwareMessageProvider;
import org.jnario.feature.feature.StepReference;


public class FeatureLinkingDiagnosticMessageProvider extends UnresolvedAnnotationTypeAwareMessageProvider {
	
	@Override
	public DiagnosticMessage getUnresolvedProxyMessage(ILinkingDiagnosticContext context) {
		if(context.getContext() instanceof StepReference){
			return null;
		}
		return super.getUnresolvedProxyMessage(context);
	}
}
