package org.jnario.spec.tests.integration;

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
  BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("Extend annotation defines the super class")
  @Order(1)
  public void _extendAnnotationDefinesTheSuperClass() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n\t\timport org.jnario.runner.Extends\r\n\t\timport junit.framework.TestCase\r\n\r\n\t\t@Extends(typeof(TestCase)) \r\n\t\tdescribe \"A spec\"{\r\n\t\t\tfact typeof(ASpecSpec).superclass => typeof(TestCase)\r\n\t\t}\r\n\t\t");
  }
}
