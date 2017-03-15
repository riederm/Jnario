/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.unit.naming;

import com.google.common.base.Objects;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.feature.feature.Given;
import org.jnario.feature.tests.unit.naming.StepNameProviderSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("nameOf")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class StepNameProviderNameOfSpec extends StepNameProviderSpec {
  @Test
  @Named("returns null if the step has no name")
  @Order(1)
  public void _returnsNullIfTheStepHasNoName() throws Exception {
    Given _emptyStep = this.emptyStep();
    String _nameOf = this.subject.nameOf(_emptyStep);
    boolean _equals = Objects.equal(_nameOf, null);
    Assert.assertTrue("\nExpected subject.nameOf(emptyStep) == null but"
     + "\n     subject.nameOf(emptyStep) is " + new org.hamcrest.StringDescription().appendValue(_nameOf).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
     + "\n     emptyStep is " + new org.hamcrest.StringDescription().appendValue(_emptyStep).toString() + "\n", _equals);
    
  }
  
  @Test
  @Named("returns the name for a step with definition")
  @Order(2)
  public void _returnsTheNameForAStepWithDefinition() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Scenario: MyScenario");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given a step with an implementation");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("1 + 1 => 2");
    _builder.newLine();
    this.parseScenario(_builder.toString());
    String _stepName = this.stepName();
    Assert.assertTrue("\nExpected stepName => \"Given a step with an implementation\" but"
     + "\n     stepName is " + new org.hamcrest.StringDescription().appendValue(_stepName).toString() + "\n", Should.<String>operator_doubleArrow(_stepName, "Given a step with an implementation"));
    
  }
  
  @Test
  @Named("returns the name for a step with resolved reference")
  @Order(3)
  public void _returnsTheNameForAStepWithResolvedReference() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Scenario: MyScenario 2");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given a step with a resolved reference");
    _builder.newLine();
    _builder.append("Scenario: MyScenario 1");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given a step with a resolved reference");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"implementation\"");
    _builder.newLine();
    this.parseScenario(_builder.toString());
    String _stepName = this.stepName();
    Assert.assertTrue("\nExpected stepName => \"Given a step with a resolved reference\" but"
     + "\n     stepName is " + new org.hamcrest.StringDescription().appendValue(_stepName).toString() + "\n", Should.<String>operator_doubleArrow(_stepName, "Given a step with a resolved reference"));
    
  }
  
  @Test
  @Named("returns the name for a step with unresolved reference")
  @Order(4)
  public void _returnsTheNameForAStepWithUnresolvedReference() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Scenario: MyScenario 2");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given a step with an unresolved reference");
    _builder.newLine();
    this.parseScenario(_builder.toString());
    String _stepName = this.stepName();
    Assert.assertTrue("\nExpected stepName => \"Given a step with an unresolved reference\" but"
     + "\n     stepName is " + new org.hamcrest.StringDescription().appendValue(_stepName).toString() + "\n", Should.<String>operator_doubleArrow(_stepName, "Given a step with an unresolved reference"));
    
  }
  
  @Test
  @Named("keeps parameter values")
  @Order(5)
  public void _keepsParameterValues() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Scenario: MyScenario 2");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given a step with two values \"a\" and \"b\"");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("1 + 1 => 2");
    _builder.newLine();
    this.parseScenario(_builder.toString());
    String _stepName = this.stepName();
    Assert.assertTrue("\nExpected stepName => \'Given a step with two values \"a\" and \"b\"\' but"
     + "\n     stepName is " + new org.hamcrest.StringDescription().appendValue(_stepName).toString() + "\n", Should.<String>operator_doubleArrow(_stepName, "Given a step with two values \"a\" and \"b\""));
    
  }
}
