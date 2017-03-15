package org.jnario.spec.tests.integration;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
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
  @org.jnario.runner.Extension
  @Inject
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("Extend annotation defines the super class")
  @Order(1)
  public void _extendAnnotationDefinesTheSuperClass() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import org.jnario.runner.Extends");
    _builder.newLine();
    _builder.append("import junit.framework.TestCase");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Extends(typeof(TestCase)) ");
    _builder.newLine();
    _builder.append("describe \"A spec\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact typeof(ASpecSpec).superclass => typeof(TestCase)");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder.toString());
  }
}
