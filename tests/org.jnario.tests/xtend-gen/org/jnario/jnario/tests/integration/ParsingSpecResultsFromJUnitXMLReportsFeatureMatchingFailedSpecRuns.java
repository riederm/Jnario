package org.jnario.jnario.tests.integration;

import com.google.common.base.Objects;
import com.google.common.collect.Iterators;
import com.google.inject.Inject;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.Executable;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.jnario.tests.integration.ParsingSpecResultsFromJUnitXMLReportsFeature;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.JnarioIteratorExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.report.Failed;
import org.jnario.report.HashBasedSpec2ResultMapping;
import org.jnario.report.Passed;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecResultParser;
import org.jnario.runner.CreateWith;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.spec.ExampleGroup;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Matching failed Spec runs")
@CreateWith(SpecTestCreator.class)
@SuppressWarnings("all")
public class ParsingSpecResultsFromJUnitXMLReportsFeatureMatchingFailedSpecRuns extends ParsingSpecResultsFromJUnitXMLReportsFeature {
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public ModelStore _modelStore;
  
  @Inject
  HashBasedSpec2ResultMapping spec2ResultMapping;
  
  @Inject
  SpecResultParser resultParser;
  
  Executable specification;
  
  @Test
  @Order(0)
  @Named("Given a specification")
  public void _givenASpecification() {
    final StepArguments args = new StepArguments("package example\n\ndescribe \"Adding values\"{\n\tfact \"4 + 3 is 8\"{\n\t\t4 + 3 => 8\n\t}\n}\n");
    this.specification = JnarioIteratorExtensions.<ExampleGroup>first(Iterators.<ExampleGroup>filter(this._modelStore.parseSpec(JnarioIterableExtensions.<String>first(args)).getAllContents(), ExampleGroup.class));
  }
  
  @Test
  @Order(1)
  @Named("And a test result xml file")
  public void _andATestResultXmlFile() {
    final StepArguments args = new StepArguments("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\n<testsuite failures=\"1\" time=\"0.017\" errors=\"0\" skipped=\"0\" tests=\"1\" name=\"example.AddingValuesSpec\">\n  <properties>\n    <property name=\"java.runtime.name\" value=\"Java(TM) SE Runtime Environment\"/>\n  </properties>\n  <testcase time=\"0.017\" classname=\"example.AddingValuesSpec\" name=\"4 + 3 is 8\">\n    <failure message=\"\nExpected 4 + 3 =&gt; 8 but\n     4 + 3 is &lt;7&gt;\n\" type=\"java.lang.AssertionError\">java.lang.AssertionError: \nExpected 4 + 3 =&gt; 8 but\n     4 + 3 is &lt;7&gt;\n\tat org.junit.Assert.fail(Assert.java:93)\n\tat org.junit.Assert.assertTrue(Assert.java:43)\n\tat example.AddingValuesSpec.__43Is8(AddingValuesSpec.java:22)\n</failure>\n  </testcase>\n</testsuite>\t\n");
    String _trim = JnarioIterableExtensions.<String>first(args).trim();
    StringInputStream _stringInputStream = new StringInputStream(_trim);
    this.resultParser.parse(_stringInputStream, this.spec2ResultMapping);
  }
  
  @Test
  @Order(2)
  @Named("Then the spec execution \\\"failed\\\"")
  public void _thenTheSpecExecutionFailed() {
    final StepArguments args = new StepArguments("failed");
    final SpecExecution result = this.spec2ResultMapping.getResult(this.specification);
    String _first = JnarioIterableExtensions.<String>first(args);
    boolean _equals = Objects.equal(_first, "passed");
    if (_equals) {
      Should.operator_doubleArrow(result, Passed.class);
    } else {
      Should.operator_doubleArrow(result, Failed.class);
    }
  }
}
