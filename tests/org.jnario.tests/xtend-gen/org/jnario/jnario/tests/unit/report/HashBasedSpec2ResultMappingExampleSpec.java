package org.jnario.jnario.tests.unit.report;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.tests.unit.report.HashBasedSpec2ResultMappingSpec;
import org.jnario.lib.Assert;
import org.jnario.report.Passed;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.spec.Example;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Example")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class HashBasedSpec2ResultMappingExampleSpec extends HashBasedSpec2ResultMappingSpec {
  final Passed aResult = Passed.passingSpec("example.SomethingSpec", "a fact", HashBasedSpec2ResultMappingSpec.anyExecutionTime);
  
  final Passed aResultWithDifferentClassName = Passed.passingSpec("example.DifferentSpec", "a fact", HashBasedSpec2ResultMappingSpec.anyExecutionTime);
  
  final Passed aResultWithDifferentName = Passed.passingSpec("example.SomethingSpec", "another fact", HashBasedSpec2ResultMappingSpec.anyExecutionTime);
  
  @Test
  @Named("matches if classname and name are equal")
  @Order(1)
  public void _matchesIfClassnameAndNameAreEqual() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package example");
    _builder.newLine();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"a fact\"{\"\"}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.m.parseSpec(_builder.toString());
    this.subject.accept(this.aResult);
    Example _example = this.example();
    boolean _should_match = this.should_match(_example, this.aResult);
    Assert.assertTrue("\nExpected example should match aResult but"
     + "\n     example is " + new org.hamcrest.StringDescription().appendValue(_example).toString()
     + "\n     aResult is " + new org.hamcrest.StringDescription().appendValue(this.aResult).toString() + "\n", _should_match);
    
    Example _example_1 = this.example();
    boolean _should_match_1 = this.should_match(_example_1, this.aResultWithDifferentClassName);
    Assert.assertFalse("\nExpected example should not match aResultWithDifferentClassName but"
     + "\n     example is " + new org.hamcrest.StringDescription().appendValue(_example_1).toString()
     + "\n     aResultWithDifferentClassName is " + new org.hamcrest.StringDescription().appendValue(this.aResultWithDifferentClassName).toString() + "\n", _should_match_1);
    
    Example _example_2 = this.example();
    Assert.assertFalse("\nExpected example should not match aResultWithDifferentName but"
     + "\n     example is " + new org.hamcrest.StringDescription().appendValue(_example_2).toString()
     + "\n     aResultWithDifferentName is " + new org.hamcrest.StringDescription().appendValue(this.aResultWithDifferentName).toString() + "\n", this.should_match(_example_2, this.aResultWithDifferentName));
    
  }
  
  @Test
  @Named("includes pending state when matching")
  @Order(2)
  public void _includesPendingStateWhenMatching() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package example");
    _builder.newLine();
    _builder.append("describe \"Something\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"a fact\"");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.m.parseSpec(_builder.toString());
    final Passed pendingResult = Passed.passingSpec("example.SomethingSpec", "a fact [PENDING]", HashBasedSpec2ResultMappingSpec.anyExecutionTime);
    this.subject.accept(pendingResult);
    Example _example = this.example();
    Assert.assertTrue("\nExpected example should match pendingResult but"
     + "\n     example is " + new org.hamcrest.StringDescription().appendValue(_example).toString()
     + "\n     pendingResult is " + new org.hamcrest.StringDescription().appendValue(pendingResult).toString() + "\n", this.should_match(_example, pendingResult));
    
  }
}
