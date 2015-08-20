package org.jnario.feature.tests.unit.naming;

import java.util.Set;
import org.jnario.feature.tests.unit.naming.FeatureScopeProviderSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("StepReference")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureScopeProviderStepReferenceSpec extends FeatureScopeProviderSpec {
  @Test
  @Named("contains all implemented steps")
  @Order(1)
  public void _containsAllImplementedSteps() throws Exception {
    this.e.parseFeature("package myPackage\r\nFeature: MyFeature\r\nScenario: MyScenario\r\n\tGiven a step\r\n\t\tval x = \"\"\r\n\tAnd a step\r\n\tAnd another step\r\n");
    Set<String> _targetOperationScope = this.targetOperationScope();
    boolean _should_contain = Should.<String>should_contain(_targetOperationScope, "myPackage.a step");
    Assert.assertTrue("\nExpected targetOperationScope should contain \"myPackage.a step\" but"
     + "\n     targetOperationScope is " + new org.hamcrest.StringDescription().appendValue(_targetOperationScope).toString() + "\n", _should_contain);
    
    Set<String> _targetOperationScope_1 = this.targetOperationScope();
    Assert.assertFalse("\nExpected targetOperationScope should not contain \"myPackage.another step\" but"
     + "\n     targetOperationScope is " + new org.hamcrest.StringDescription().appendValue(_targetOperationScope_1).toString() + "\n", Should.<String>should_contain(_targetOperationScope_1, "myPackage.another step"));
    
  }
}
