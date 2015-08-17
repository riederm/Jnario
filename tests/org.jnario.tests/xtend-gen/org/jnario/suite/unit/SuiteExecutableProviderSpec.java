package org.jnario.suite.unit;

import com.google.inject.Inject;
import java.util.List;
import java.util.Set;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.Executable;
import org.jnario.Specification;
import org.jnario.feature.feature.Feature;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.suite.jvmmodel.SuiteExecutableProvider;
import org.jnario.suite.suite.Suite;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(SuiteTestCreator.class)
@Named("SuiteExecutableProvider")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SuiteExecutableProviderSpec {
  @Subject
  public SuiteExecutableProvider subject;
  
  @Extension
  @Inject
  ModelStore m;
  
  @Before
  public void before() throws Exception {
    this.m.parseSpec("\r\n\t\t\tpackage demo\r\n\t\t\tdescribe \"My Spec\"{\r\n\t\t\t\t// this should be filtered\r\n\t\t\t\tdescribe \"My Internal Spec\"{\r\n\t\t\t\t\t\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t\tdescribe String{\r\n\t\t\t\t\r\n\t\t\t}\r\n\t\t");
    this.m.parseScenario("\r\n\t\t\tpackage demo\r\n\t\t\tFeature: My Feature\r\n\t\t\tScenario My Scenario\r\n\t\t\t\tGiven nothing\r\n\t\t\t\tThen nothing\r\n\t\t");
  }
  
  @Test
  @Named("returns contained suites")
  @Order(1)
  public void _returnsContainedSuites() throws Exception {
    this.m.parseSuite("\r\n\t\t\tpackage demo\r\n\t\t\timport demo.*\r\n\t\t\t#My Suite\r\n\t\t\t\r\n\t\t\t##Child 1\r\n\t\t\t##Child 2\r\n\t\t\t###Grandchild\r\n\t\t");
    Suite _suite = this.m.suite("My Suite");
    List<Executable> _executables = this.subject.getExecutables(_suite);
    Suite _suite_1 = this.m.suite("Child 1");
    Suite _suite_2 = this.m.suite("Child 2");
    List<Suite> _list = JnarioCollectionLiterals.<Suite>list(_suite_1, _suite_2);
    Assert.assertTrue("\nExpected subject.getExecutables(suite(\"My Suite\")) => list(suite(\"Child 1\"), suite(\"Child 2\")) but"
     + "\n     subject.getExecutables(suite(\"My Suite\")) is " + new org.hamcrest.StringDescription().appendValue(_executables).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
     + "\n     suite(\"My Suite\") is " + new org.hamcrest.StringDescription().appendValue(_suite).toString()
     + "\n     list(suite(\"Child 1\"), suite(\"Child 2\")) is " + new org.hamcrest.StringDescription().appendValue(_list).toString()
     + "\n     suite(\"Child 1\") is " + new org.hamcrest.StringDescription().appendValue(_suite_1).toString()
     + "\n     suite(\"Child 2\") is " + new org.hamcrest.StringDescription().appendValue(_suite_2).toString() + "\n", Should.<List<? extends Executable>>operator_doubleArrow(_executables, _list));
    
  }
  
  @Test
  @Named("returns resolved specs via link")
  @Order(2)
  public void _returnsResolvedSpecsViaLink() throws Exception {
    this.m.parseSuite("\r\n\t\t\tpackage demo\r\n\t\t\timport demo.*\r\n\t\t\t#My Suite\r\n\t\t\t\r\n\t\t\t- \"My Spec\"\r\n\t\t\t- \"My Feature\"\r\n\t\t");
    Suite _suite = this.m.suite("My Suite");
    List<Executable> _executables = this.subject.getExecutables(_suite);
    Set<Executable> _set = IterableExtensions.<Executable>toSet(_executables);
    ExampleGroup _exampleGroup = this.m.exampleGroup("My Spec");
    Feature _feature = this.m.feature();
    Set<Specification> _set_1 = JnarioCollectionLiterals.<Specification>set(_exampleGroup, _feature);
    Assert.assertTrue("\nExpected subject.getExecutables(suite(\"My Suite\")).toSet => set(exampleGroup(\"My Spec\"), feature()) but"
     + "\n     subject.getExecutables(suite(\"My Suite\")).toSet is " + new org.hamcrest.StringDescription().appendValue(_set).toString()
     + "\n     subject.getExecutables(suite(\"My Suite\")) is " + new org.hamcrest.StringDescription().appendValue(_executables).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
     + "\n     suite(\"My Suite\") is " + new org.hamcrest.StringDescription().appendValue(_suite).toString()
     + "\n     set(exampleGroup(\"My Spec\"), feature()) is " + new org.hamcrest.StringDescription().appendValue(_set_1).toString()
     + "\n     exampleGroup(\"My Spec\") is " + new org.hamcrest.StringDescription().appendValue(_exampleGroup).toString()
     + "\n     feature() is " + new org.hamcrest.StringDescription().appendValue(_feature).toString() + "\n", Should.<Set<? extends Executable>>operator_doubleArrow(_set, _set_1));
    
  }
  
  @Test
  @Named("returns resolved specs via regex")
  @Order(3)
  public void _returnsResolvedSpecsViaRegex() throws Exception {
    this.m.parseSuite("\r\n\t\t\tpackage demo\r\n\t\t\timport demo.*\r\n\t\t\t#My Suite\r\n\t\t\t\r\n\t\t\t- \\demo.*\\\r\n\t\t\t\r\n\t\t");
    Suite _suite = this.m.suite("My Suite");
    List<Executable> _executables = this.subject.getExecutables(_suite);
    Set<Executable> _set = IterableExtensions.<Executable>toSet(_executables);
    ExampleGroup _exampleGroup = this.m.exampleGroup("My Spec");
    ExampleGroup _exampleGroup_1 = this.m.exampleGroup("String");
    Feature _feature = this.m.feature();
    Set<Specification> _set_1 = JnarioCollectionLiterals.<Specification>set(_exampleGroup, _exampleGroup_1, _feature);
    Assert.assertTrue("\nExpected subject.getExecutables(suite(\"My Suite\")).toSet => set(exampleGroup(\"My Spec\"), exampleGroup(\"String\"), feature()) but"
     + "\n     subject.getExecutables(suite(\"My Suite\")).toSet is " + new org.hamcrest.StringDescription().appendValue(_set).toString()
     + "\n     subject.getExecutables(suite(\"My Suite\")) is " + new org.hamcrest.StringDescription().appendValue(_executables).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
     + "\n     suite(\"My Suite\") is " + new org.hamcrest.StringDescription().appendValue(_suite).toString()
     + "\n     set(exampleGroup(\"My Spec\"), exampleGroup(\"String\"), feature()) is " + new org.hamcrest.StringDescription().appendValue(_set_1).toString()
     + "\n     exampleGroup(\"My Spec\") is " + new org.hamcrest.StringDescription().appendValue(_exampleGroup).toString()
     + "\n     exampleGroup(\"String\") is " + new org.hamcrest.StringDescription().appendValue(_exampleGroup_1).toString()
     + "\n     feature() is " + new org.hamcrest.StringDescription().appendValue(_feature).toString() + "\n", Should.<Set<? extends Executable>>operator_doubleArrow(_set, _set_1));
    
  }
}
