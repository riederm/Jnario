/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.unit.naming;

import java.util.Arrays;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.feature.tests.unit.naming.StepNameProviderRemoveArgumentsSpecExamples;
import org.jnario.feature.tests.unit.naming.StepNameProviderSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Each;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("removeArguments")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class StepNameProviderRemoveArgumentsSpec extends StepNameProviderSpec {
  public ExampleTable<StepNameProviderRemoveArgumentsSpecExamples> _initStepNameProviderRemoveArgumentsSpecExamples() {
    return ExampleTable.create("examples", 
      Arrays.asList("step", "result"), 
      new StepNameProviderRemoveArgumentsSpecExamples(  Arrays.asList("\'Given a \"value\"\'", "\'Given a \"\"\'"), _initStepNameProviderRemoveArgumentsSpecExamplesCell0(), _initStepNameProviderRemoveArgumentsSpecExamplesCell1()),
      new StepNameProviderRemoveArgumentsSpecExamples(  Arrays.asList("\'Given a \"value\" and \"anothervalue\"\'", "\'Given a \"\" and \"\"\'"), _initStepNameProviderRemoveArgumentsSpecExamplesCell2(), _initStepNameProviderRemoveArgumentsSpecExamplesCell3())
    );
  }
  
  protected ExampleTable<StepNameProviderRemoveArgumentsSpecExamples> examples = _initStepNameProviderRemoveArgumentsSpecExamples();
  
  public String _initStepNameProviderRemoveArgumentsSpecExamplesCell0() {
    return "Given a \"value\"";
  }
  
  public String _initStepNameProviderRemoveArgumentsSpecExamplesCell1() {
    return "Given a \"\"";
  }
  
  public String _initStepNameProviderRemoveArgumentsSpecExamplesCell2() {
    return "Given a \"value\" and \"anothervalue\"";
  }
  
  public String _initStepNameProviderRemoveArgumentsSpecExamplesCell3() {
    return "Given a \"\" and \"\"";
  }
  
  @Test
  @Named("examples do pass")
  @Order(1)
  public void _examplesDoPass() throws Exception {
    final Procedure1<StepNameProviderRemoveArgumentsSpecExamples> _function = new Procedure1<StepNameProviderRemoveArgumentsSpecExamples>() {
      @Override
      public void apply(final StepNameProviderRemoveArgumentsSpecExamples it) {
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("Scenario: scenario");
        _builder.newLine();
        String _step = it.getStep();
        String _plus = (_builder.toString() + _step);
        StringConcatenation _builder_1 = new StringConcatenation();
        String _plus_1 = (_plus + _builder_1.toString());
        StepNameProviderRemoveArgumentsSpec.this.parseScenario(_plus_1);
        String _step_1 = it.getStep();
        String _removeArguments = StepNameProviderRemoveArgumentsSpec.this.subject.removeArguments(_step_1);
        String _result = it.getResult();
        Assert.assertTrue("\nExpected subject.removeArguments(step) => result but"
         + "\n     subject.removeArguments(step) is " + new org.hamcrest.StringDescription().appendValue(_removeArguments).toString()
         + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(StepNameProviderRemoveArgumentsSpec.this.subject).toString()
         + "\n     step is " + new org.hamcrest.StringDescription().appendValue(_step_1).toString()
         + "\n     result is " + new org.hamcrest.StringDescription().appendValue(_result).toString() + "\n", Should.<String>operator_doubleArrow(_removeArguments, _result));
        
      }
    };
    Each.<StepNameProviderRemoveArgumentsSpecExamples>forEach(this.examples, _function);
  }
}
