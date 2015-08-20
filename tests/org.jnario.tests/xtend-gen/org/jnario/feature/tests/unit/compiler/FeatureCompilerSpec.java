package org.jnario.feature.tests.unit.compiler;

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
@Named("Feature Compiler")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureCompilerSpec {
  @Extension
  @Inject
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("Handles empty closures correctly")
  @Order(1)
  public void _handlesEmptyClosuresCorrectly() throws Exception {
    this._behaviorExecutor.executesSuccessfully("Feature: Empty Closures\r\n\tScenario: Defining Empty Closures\r\n\tWhen I define an empty closure\r\n\t\t[|].apply \r\n\tAnd  I define an empty closure\r\n");
  }
  
  @Test
  @Named("compiles rich strings")
  @Order(2)
  public void _compilesRichStrings() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n\t\tFeature: Rich Strings\r\n\t\t\tScenario: A\r\n\t\t\tWhen I a rich strings\r\n\t\t\t\tval x = \'world\'\r\n\t\t\t\t\'\'\'hello \u00ABx\u00BB\'\'\'.toString => \'hello world\'\r\n\t\t");
  }
}
