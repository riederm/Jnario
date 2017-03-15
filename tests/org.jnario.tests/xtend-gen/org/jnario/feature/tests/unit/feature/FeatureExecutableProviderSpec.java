package org.jnario.feature.tests.unit.feature;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.Executable;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.jvmmodel.FeatureExecutableProvider;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(FeatureTestCreator.class)
@Named("FeatureExecutableProvider")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureExecutableProviderSpec {
  @Subject
  public FeatureExecutableProvider subject;
  
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public ModelStore _modelStore;
  
  @Test
  @Named("returns background and scenarios")
  @Order(1)
  public void _returnsBackgroundAndScenarios() throws Exception {
    this._modelStore.parseScenario("\r\n\t\tFeature: My feature\r\n\t\tBackground: My Background\r\n\t\tScenario: My first Scenario\r\n\t\tScenario: My second Scenario\r\n\t\t");
    Feature _feature = this._modelStore.feature();
    List<? extends Executable> _executables = this.executables(_feature);
    Scenario _scenario = this._modelStore.scenario("Background: My Background");
    Scenario _scenario_1 = this._modelStore.scenario("Scenario: My first Scenario");
    Scenario _scenario_2 = this._modelStore.scenario("Scenario: My second Scenario");
    List<Scenario> _list = JnarioCollectionLiterals.<Scenario>list(_scenario, _scenario_1, _scenario_2);
    Assert.assertTrue("\nExpected feature().executables => list(scenario(\"Background: My Background\"), scenario(\"Scenario: My first Scenario\"), scenario(\"Scenario: My second Scenario\")) but"
     + "\n     feature().executables is " + new org.hamcrest.StringDescription().appendValue(_executables).toString()
     + "\n     feature() is " + new org.hamcrest.StringDescription().appendValue(_feature).toString()
     + "\n     list(scenario(\"Background: My Background\"), scenario(\"Scenario: My first Scenario\"), scenario(\"Scenario: My second Scenario\")) is " + new org.hamcrest.StringDescription().appendValue(_list).toString()
     + "\n     scenario(\"Background: My Background\") is " + new org.hamcrest.StringDescription().appendValue(_scenario).toString()
     + "\n     scenario(\"Scenario: My first Scenario\") is " + new org.hamcrest.StringDescription().appendValue(_scenario_1).toString()
     + "\n     scenario(\"Scenario: My second Scenario\") is " + new org.hamcrest.StringDescription().appendValue(_scenario_2).toString() + "\n", Should.<List<? extends Executable>>operator_doubleArrow(_executables, _list));
    
  }
  
  @Test
  @Named("returns steps")
  @Order(2)
  public void _returnsSteps() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: My feature");
    _builder.newLine();
    _builder.append("Scenario: My first Scenario");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given something");
    _builder.newLine();
    this._modelStore.parseScenario(_builder.toString());
    Scenario _scenario = this._modelStore.scenario("Scenario: My first Scenario");
    List<? extends Executable> _executables = this.executables(_scenario);
    Step _step = this._modelStore.step("Given something");
    List<Step> _list = JnarioCollectionLiterals.<Step>list(_step);
    Assert.assertTrue("\nExpected scenario(\"Scenario: My first Scenario\").executables => list(step(\"Given something\")) but"
     + "\n     scenario(\"Scenario: My first Scenario\").executables is " + new org.hamcrest.StringDescription().appendValue(_executables).toString()
     + "\n     scenario(\"Scenario: My first Scenario\") is " + new org.hamcrest.StringDescription().appendValue(_scenario).toString()
     + "\n     list(step(\"Given something\")) is " + new org.hamcrest.StringDescription().appendValue(_list).toString()
     + "\n     step(\"Given something\") is " + new org.hamcrest.StringDescription().appendValue(_step).toString() + "\n", Should.<List<? extends Executable>>operator_doubleArrow(_executables, _list));
    
  }
  
  @Test
  @Named("returns sub steps")
  @Order(3)
  public void _returnsSubSteps() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Feature: My feature");
    _builder.newLine();
    _builder.append("Scenario: My first Scenario");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given something");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("And something else");
    _builder.newLine();
    this._modelStore.parseScenario(_builder.toString());
    Scenario _scenario = this._modelStore.scenario("Scenario: My first Scenario");
    List<? extends Executable> _executables = this.executables(_scenario);
    Step _step = this._modelStore.step("Given something");
    Step _step_1 = this._modelStore.step("And something else");
    List<Step> _list = JnarioCollectionLiterals.<Step>list(_step, _step_1);
    Assert.assertTrue("\nExpected scenario(\"Scenario: My first Scenario\").executables => list(step(\"Given something\"), step(\"And something else\")) but"
     + "\n     scenario(\"Scenario: My first Scenario\").executables is " + new org.hamcrest.StringDescription().appendValue(_executables).toString()
     + "\n     scenario(\"Scenario: My first Scenario\") is " + new org.hamcrest.StringDescription().appendValue(_scenario).toString()
     + "\n     list(step(\"Given something\"), step(\"And something else\")) is " + new org.hamcrest.StringDescription().appendValue(_list).toString()
     + "\n     step(\"Given something\") is " + new org.hamcrest.StringDescription().appendValue(_step).toString()
     + "\n     step(\"And something else\") is " + new org.hamcrest.StringDescription().appendValue(_step_1).toString() + "\n", Should.<List<? extends Executable>>operator_doubleArrow(_executables, _list));
    
  }
  
  public List<? extends Executable> executables(@Extension final Executable spec) {
    return this.subject.getExecutables(spec);
  }
}
