/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.unit;

import com.google.inject.Inject;
import java.util.List;
import java.util.Set;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.jnario.Specification;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Specs;
import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.jnario.test.util.Suites;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.Contains;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.suite.jvmmodel.SpecResolver;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.unit.SpecResolverEvaluatesRegularExpressionsSpec;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@Contains(SpecResolverEvaluatesRegularExpressionsSpec.class)
@CreateWith(SuiteTestCreator.class)
@Named("SpecResolver")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SpecResolverSpec {
  @Subject
  public SpecResolver subject;
  
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public ModelStore m;
  
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public SuiteClassNameProvider _suiteClassNameProvider;
  
  @Before
  public void before() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.append("describe \"My Spec\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("// this should be filtered");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("describe \"My Internal Spec\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.append("describe String{");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.m.parseSpec(_builder.toString());
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("package demo");
    _builder_1.newLine();
    _builder_1.append("Feature: My Feature");
    _builder_1.newLine();
    _builder_1.append("Scenario My Scenario");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Given nothing");
    _builder_1.newLine();
    _builder_1.append("\t");
    _builder_1.append("Then nothing");
    _builder_1.newLine();
    this.m.parseScenario(_builder_1.toString());
  }
  
  @Test
  @Named("resolves referenced specs")
  @Order(1)
  public void _resolvesReferencedSpecs() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package demo");
    _builder.newLine();
    _builder.append("import demo.*");
    _builder.newLine();
    _builder.append("#My Suite");
    _builder.newLine();
    _builder.newLine();
    _builder.append("- \"My Spec\"");
    _builder.newLine();
    _builder.append("- \"My Feature\"");
    _builder.newLine();
    this.m.parseSuite(_builder.toString());
    Suite _firstSuite = this.m.firstSuite();
    List<String> _resolvedSpecs = this.resolvedSpecs(_firstSuite);
    Set<String> _set = IterableExtensions.<String>toSet(_resolvedSpecs);
    Set<String> _set_1 = JnarioCollectionLiterals.<String>set("MySpecSpec", "MyFeatureFeature");
    Assert.assertTrue("\nExpected resolvedSpecs(firstSuite).toSet => set(\"MySpecSpec\", \"MyFeatureFeature\") but"
     + "\n     resolvedSpecs(firstSuite).toSet is " + new org.hamcrest.StringDescription().appendValue(_set).toString()
     + "\n     resolvedSpecs(firstSuite) is " + new org.hamcrest.StringDescription().appendValue(_resolvedSpecs).toString()
     + "\n     firstSuite is " + new org.hamcrest.StringDescription().appendValue(_firstSuite).toString()
     + "\n     set(\"MySpecSpec\", \"MyFeatureFeature\") is " + new org.hamcrest.StringDescription().appendValue(_set_1).toString() + "\n", Should.<Set<String>>operator_doubleArrow(_set, _set_1));
    
  }
  
  @Test
  @Named("ignores specs without name")
  @Order(2)
  public void _ignoresSpecsWithoutName() throws Exception {
    final ExampleGroup specWithoutName = Specs.exampleGroup(null);
    SpecReference _specReference = Suites.specReference(specWithoutName);
    final Suite suite = Suites.suiteWith("A Suite", _specReference);
    List<Specification> _resolveSpecs = this.subject.resolveSpecs(suite);
    List<ExampleGroup> _list = JnarioCollectionLiterals.<ExampleGroup>list(specWithoutName);
    Assert.assertTrue("\nExpected subject.resolveSpecs(suite) => list(specWithoutName) but"
     + "\n     subject.resolveSpecs(suite) is " + new org.hamcrest.StringDescription().appendValue(_resolveSpecs).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
     + "\n     suite is " + new org.hamcrest.StringDescription().appendValue(suite).toString()
     + "\n     list(specWithoutName) is " + new org.hamcrest.StringDescription().appendValue(_list).toString()
     + "\n     specWithoutName is " + new org.hamcrest.StringDescription().appendValue(specWithoutName).toString() + "\n", Should.<List<? extends Specification>>operator_doubleArrow(_resolveSpecs, _list));
    
  }
  
  public List<String> resolvedSpecs(@Extension final Suite suite) {
    List<Specification> _resolveSpecs = this.subject.resolveSpecs(suite);
    final Function1<Specification, String> _function = new Function1<Specification, String>() {
      @Override
      public String apply(final Specification it) {
        return SpecResolverSpec.this._suiteClassNameProvider.toJavaClassName(it);
      }
    };
    List<String> _map = ListExtensions.<Specification, String>map(_resolveSpecs, _function);
    return IterableExtensions.<String>toList(_map);
  }
}
