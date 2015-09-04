package org.jnario.spec.tests.integration;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * You can define xtend helper classes in your specs.
 */
@CreateWith(SpecTestCreator.class)
@Named("Defining Xtend classes in your specs")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class DefiningXtendClassesInYourSpecsSpec {
  @Extension
  @Inject
  public BehaviorExecutor _behaviorExecutor;
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("either before...")
  @Order(1)
  public void _eitherBefore() throws Exception {
    this._behaviorExecutor.executesSuccessfully("@Data class Greeter{\n  String name\n  def sayHello(){\n    \"Hello \" + name\n  }\n}\n\ndescribe \"Saying Hello\"{\n  fact new Greeter(\"Sebastian\").sayHello => \"Hello Sebastian\"\n}  \t\n");
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("...or after your specs")
  @Order(2)
  public void _orAfterYourSpecs() throws Exception {
    this._behaviorExecutor.executesSuccessfully("describe \"Saying Hello\"{\n  fact new Greeter(\"Sebastian\").sayHello => \"Hello Sebastian\"\n}  \t\n\n@Data class Greeter{\n  String name\n  def sayHello(){\n    \"Hello \" + name\n  }\n}\n");
  }
}
