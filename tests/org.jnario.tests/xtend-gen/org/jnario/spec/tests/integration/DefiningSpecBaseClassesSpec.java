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

@CreateWith(SpecTestCreator.class)
@Named("Defining Spec base classes")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class DefiningSpecBaseClassesSpec {
  @Extension
  @Inject
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("Extend annotation defines the super class")
  @Order(1)
  public void _extendAnnotationDefinesTheSuperClass() throws Exception {
    this._behaviorExecutor.executesSuccessfully("import org.jnario.runner.Extends\r\nimport junit.framework.TestCase\r\n\r\n@Extends(typeof(TestCase)) \r\ndescribe \"A spec\"{\r\n\tfact typeof(ASpecSpec).superclass => typeof(TestCase)\r\n}\r\n");
  }
}
