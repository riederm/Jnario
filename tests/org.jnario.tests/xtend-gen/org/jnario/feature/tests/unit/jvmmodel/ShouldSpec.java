package org.jnario.feature.tests.unit.jvmmodel;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(FeatureTestCreator.class)
@Named("Should")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ShouldSpec {
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("Shows correct failure message in reused steps")
  @Order(1)
  public void _showsCorrectFailureMessageInReusedSteps() throws Exception {
    this._behaviorExecutor.executesSuccessfully("package demo\r\n\r\nFeature: Failure messages when reusing steps\r\n\r\n\tScenario: name\r\n\t\r\n\t\tGiven a step\r\n\t\t\ttry{\r\n\t\t\t\t1 + 1 => 3\r\n\t\t\t}catch(AssertionError e){\r\n\t\t\t\te.message should contain \"1 + 1 => 3\"\r\n\t\t\t}\r\n\t\t\t\r\n\tScenario: name 2\t\t\r\n\t\tGiven a step\r\n\t\t\r\n");
  }
}
