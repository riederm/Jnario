/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.unit.validation;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.feature.feature.Step;
import org.jnario.feature.tests.unit.validation.FeatureJavaValidatorSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Steps must have descriptions")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureJavaValidatorStepsMustHaveDescriptionsSpec extends FeatureJavaValidatorSpec {
  @Test
  @Named("\\\'\\\'\\\' Feature: A feature Scenario: A scenario Given When Then \\\'\\\'\\\'.allOf[typeof[Step]][assertErrorContains[\\\"description\\\"]]")
  @Order(1)
  public void _featureAFeatureScenarioAScenarioGivenWhenThenAllOfTypeofStepAssertErrorContainsDescription() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: A feature");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Scenario: A scenario");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("Given ");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("When ");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.append("Then ");
    _builder.newLine();
    _builder.append("\t \t");
    _builder.newLine();
    final Procedure1<AssertableDiagnostics> _function = new Procedure1<AssertableDiagnostics>() {
      @Override
      public void apply(final AssertableDiagnostics it) {
        it.assertErrorContains("description");
      }
    };
    this.allOf(_builder.toString(), Step.class, _function);
  }
}
