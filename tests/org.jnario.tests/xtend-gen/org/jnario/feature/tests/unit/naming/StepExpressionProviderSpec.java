/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.unit.naming;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.feature.feature.Step;
import org.jnario.feature.feature.StepReference;
import org.jnario.feature.jvmmodel.StepExpressionProvider;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.lib.Assert;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@CreateWith(FeatureTestCreator.class)
@Named("StepExpressionProvider")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class StepExpressionProviderSpec {
  @Subject
  public StepExpressionProvider subject;
  
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public ModelStore modelStore;
  
  @Test
  @Named("should return the name for a step with definition")
  @Order(1)
  public void _shouldReturnTheNameForAStepWithDefinition() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: Example");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: MyScenario");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a step with an implementation");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"the implementation\"");
    _builder.newLine();
    this.modelStore.parseScenario(_builder);
    XExpression _expression = this.step().getExpression();
    XExpression _expressionOf = this.subject.expressionOf(this.step());
    boolean _equals = Objects.equal(_expression, _expressionOf);
    Assert.assertTrue("\nExpected step.expression == subject.expressionOf(step) but"
     + "\n     step.expression is " + new org.hamcrest.StringDescription().appendValue(_expression).toString()
     + "\n     step is " + new org.hamcrest.StringDescription().appendValue(this.step()).toString()
     + "\n     subject.expressionOf(step) is " + new org.hamcrest.StringDescription().appendValue(_expressionOf).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString() + "\n", _equals);
    
  }
  
  @Test
  @Named("should copy the referenced step\\\'s implementation and set the referencing step")
  @Order(2)
  public void _shouldCopyTheReferencedStepSImplementationAndSetTheReferencingStep() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: Example");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: MyScenario 1");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a step ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: MyScenario 2");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("Given a step ");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("\"the implementation\"");
    _builder.newLine();
    this.modelStore.parseScenario(_builder);
    final XExpression expr = this.subject.expressionOf(this.step());
    boolean _notEquals = (!Objects.equal(expr, null));
    Assert.assertTrue("\nExpected expr != null but"
     + "\n     expr is " + new org.hamcrest.StringDescription().appendValue(expr).toString() + "\n", _notEquals);
    
    XExpression _expression = this.step().getExpression();
    boolean _equals = Objects.equal(_expression, expr);
    Assert.assertTrue("\nExpected step.expression == expr but"
     + "\n     step.expression is " + new org.hamcrest.StringDescription().appendValue(_expression).toString()
     + "\n     step is " + new org.hamcrest.StringDescription().appendValue(this.step()).toString()
     + "\n     expr is " + new org.hamcrest.StringDescription().appendValue(expr).toString() + "\n", _equals);
    
    Step _step = this.step();
    XExpression _expression_1 = ((StepReference) _step).getReference().getExpression();
    boolean _notEquals_1 = (!Objects.equal(_expression_1, expr));
    Assert.assertTrue("\nExpected (step as StepReference).reference.expression != expr but"
     + "\n     (step as StepReference).reference.expression is " + new org.hamcrest.StringDescription().appendValue(_expression_1).toString()
     + "\n     (step as StepReference).reference is " + new org.hamcrest.StringDescription().appendValue(((StepReference) _step).getReference()).toString()
     + "\n     step as StepReference is " + new org.hamcrest.StringDescription().appendValue(((StepReference) _step)).toString()
     + "\n     step is " + new org.hamcrest.StringDescription().appendValue(_step).toString()
     + "\n     expr is " + new org.hamcrest.StringDescription().appendValue(expr).toString() + "\n", _notEquals_1);
    
  }
  
  public Step step() {
    return Query.query(this.modelStore).<Step>first(Step.class);
  }
}
