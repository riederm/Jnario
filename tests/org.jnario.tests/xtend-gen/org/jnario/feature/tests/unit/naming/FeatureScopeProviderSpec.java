package org.jnario.feature.tests.unit.naming;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.feature.feature.FeaturePackage;
import org.jnario.feature.feature.StepReference;
import org.jnario.feature.tests.unit.naming.FeatureScopeProviderStepReferenceSpec;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ScopeTestExtension;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains(FeatureScopeProviderStepReferenceSpec.class)
@CreateWith(FeatureTestCreator.class)
@Named("FeatureScopeProvider")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureScopeProviderSpec {
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public ScopeTestExtension e;
  
  public Set<String> targetOperationScope() {
    Set<String> _xblockexpression = null;
    {
      final EObject source = this.e.first(StepReference.class);
      _xblockexpression = this.e.scope(source, FeaturePackage.eINSTANCE.getStepReference_Reference());
    }
    return _xblockexpression;
  }
}
