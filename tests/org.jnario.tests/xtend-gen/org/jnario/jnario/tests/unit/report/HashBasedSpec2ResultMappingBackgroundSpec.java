package org.jnario.jnario.tests.unit.report;

import org.jnario.feature.feature.Background;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.tests.unit.report.HashBasedSpec2ResultMappingSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.report.Failed;
import org.jnario.report.Passed;
import org.jnario.report.SpecExecution;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(FeatureTestCreator.class)
@Named("Background")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class HashBasedSpec2ResultMappingBackgroundSpec extends HashBasedSpec2ResultMappingSpec {
  @Before
  public void before() throws Exception {
    this.m.parseScenario("\r\n\t\t\t\tpackage test \r\n\t\t\t\tFeature: My Feature\r\n\t\t\t\tBackground:\r\n\t\t\t\t\tGiven a step\r\n\t\t\t\t\t\t\"with implementation\"\r\n\t\t\t\tScenario: My Scenario\r\n\t\t\t\t\tGiven another step\r\n\t\t\t\t\t\t\"with implementation\"\r\n\t\t\t");
  }
  
  @Test
  @Named("returns **Passed** if all scenarios passed")
  @Order(1)
  public void _returnsPassedIfAllScenariosPassed() throws Exception {
    this.passedStep("Given a step");
    this.passedStep("Given another step");
    Background _background = this.background();
    SpecExecution _result = this.result(_background);
    Assert.assertTrue("\nExpected background.result => typeof(Passed) but"
     + "\n     background.result is " + new org.hamcrest.StringDescription().appendValue(_result).toString()
     + "\n     background is " + new org.hamcrest.StringDescription().appendValue(_background).toString() + "\n", Should.operator_doubleArrow(_result, Passed.class));
    
  }
  
  @Test
  @Named("returns **Failed** if one scenario failed")
  @Order(2)
  public void _returnsFailedIfOneScenarioFailed() throws Exception {
    this.failedStep("Given a step");
    Background _background = this.background();
    SpecExecution _result = this.result(_background);
    Assert.assertTrue("\nExpected background.result => typeof(Failed) but"
     + "\n     background.result is " + new org.hamcrest.StringDescription().appendValue(_result).toString()
     + "\n     background is " + new org.hamcrest.StringDescription().appendValue(_background).toString() + "\n", Should.operator_doubleArrow(_result, Failed.class));
    
  }
}
