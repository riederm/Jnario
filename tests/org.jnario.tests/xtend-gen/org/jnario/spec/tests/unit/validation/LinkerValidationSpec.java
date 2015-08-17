package org.jnario.spec.tests.unit.validation;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.junit4.util.ParseHelper;
import org.eclipse.xtext.junit4.validation.ValidationTestHelper;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(SpecTestCreator.class)
@Named("Linker validation")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class LinkerValidationSpec {
  @Extension
  @Inject
  ParseHelper<EObject> parseHelper;
  
  @Extension
  @Inject
  ValidationTestHelper validationTestHelper;
  
  @Test
  @Named("No validation errors")
  @Order(1)
  public void _noValidationErrors() throws Exception {
    EObject _parse = this.parseHelper.parse("\r\n      package bootstrap\r\n\r\n      describe \"something\"{\r\n        fact \"x\" {\r\n          1 should not be 2\r\n        }\r\n      }\r\n    ");
    List<Issue> _validate = this.validationTestHelper.validate(_parse);
    this.assertNoIssues(_validate);
  }
  
  @Test
  @Named("Unknown variable")
  @Order(2)
  public void _unknownVariable() throws Exception {
    EObject _parse = this.parseHelper.parse("\r\n      package bootstrap\r\n\r\n      describe \"something\"{\r\n        fact \"x\" {\r\n          println(abc)\r\n        }\r\n      }\r\n    ");
    List<Issue> _validate = this.validationTestHelper.validate(_parse);
    this.assertIssues(_validate, 
      "The method or field abc is undefined");
  }
  
  @Test
  @Named("Unknown variable within should_be_0")
  @Order(3)
  public void _unknownVariableWithinShouldBe0() throws Exception {
    EObject _parse = this.parseHelper.parse("\r\n      package bootstrap\r\n\r\n      describe \"something\"{\r\n        fact \"x\" {\r\n          abc should be 0\r\n        }\r\n      }\r\n    ");
    List<Issue> _validate = this.validationTestHelper.validate(_parse);
    this.assertIssues(_validate, 
      "The method or field abc is undefined");
  }
  
  @Test
  @Named("Unknown variable within should_be_null [Bug -137]")
  @Order(4)
  public void _unknownVariableWithinShouldBeNullBug137() throws Exception {
    EObject _parse = this.parseHelper.parse("\r\n      package bootstrap\r\n\r\n      describe \"something\"{\r\n        fact \"x\" {\r\n          abc should be null\r\n        }\r\n      }\r\n    ");
    List<Issue> _validate = this.validationTestHelper.validate(_parse);
    this.assertIssues(_validate, 
      "The method or field abc is undefined");
  }
  
  @Test
  @Named("Unknown variable within => null")
  @Order(5)
  public void _unknownVariableWithinNull() throws Exception {
    EObject _parse = this.parseHelper.parse("\r\n      package bootstrap\r\n\r\n      describe \"something\"{\r\n        fact \"x\" {\r\n          abc => null\r\n        }\r\n      }\r\n    ");
    List<Issue> _validate = this.validationTestHelper.validate(_parse);
    this.assertIssues(_validate, 
      "The method or field abc is undefined");
  }
  
  @Test
  @Named("Method call with should be null")
  @Order(6)
  public void _methodCallWithShouldBeNull() throws Exception {
    EObject _parse = this.parseHelper.parse("\r\n      package bootstrap\r\n\r\n      describe \"something\"{\r\n        fact \"x\" {\r\n          string => null\r\n        }\r\n        def getString() {\"\"}\r\n      }\r\n    ");
    List<Issue> _validate = this.validationTestHelper.validate(_parse);
    this.assertNoIssues(_validate);
  }
  
  @Test
  @Named("Null variable with should be null")
  @Order(7)
  public void _nullVariableWithShouldBeNull() throws Exception {
    EObject _parse = this.parseHelper.parse("\r\n      package bootstrap\r\n\r\n      describe \"something\"{\r\n        fact \"x\" {\r\n          val withoutType = null\r\n          withoutType => null\r\n        }\r\n      }\r\n    ");
    List<Issue> _validate = this.validationTestHelper.validate(_parse);
    this.assertNoIssues(_validate);
  }
  
  public boolean assertNoIssues(final List<Issue> issues) {
    int _size = issues.size();
    Assert.assertTrue("\nExpected issues.size => 0 but"
     + "\n     issues.size is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_size)).toString()
     + "\n     issues is " + new org.hamcrest.StringDescription().appendValue(issues).toString() + "\n", Should.<Integer>operator_doubleArrow(Integer.valueOf(_size), Integer.valueOf(0)));
    
    return Should.<Integer>operator_doubleArrow(Integer.valueOf(_size), Integer.valueOf(0));
  }
  
  public void assertIssues(final List<Issue> issues, final String... parts) {
    final StringBuilder sb = new StringBuilder();
    final Function1<Issue, Boolean> _function = new Function1<Issue, Boolean>() {
      @Override
      public Boolean apply(final Issue it) {
        final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
          @Override
          public Boolean apply(final String part) {
            String _message = it.getMessage();
            return Boolean.valueOf(_message.contains(part));
          }
        };
        boolean _exists = IterableExtensions.<String>exists(((Iterable<String>)Conversions.doWrapArray(parts)), _function);
        return Boolean.valueOf((!_exists));
      }
    };
    Iterable<Issue> _filter = IterableExtensions.<Issue>filter(issues, _function);
    for (final Issue issue : _filter) {
      {
        sb.append("- unmatched actual issue: ");
        sb.append(issue);
        String _property = System.getProperty("line.separator");
        sb.append(_property);
      }
    }
    final Function1<String, Boolean> _function_1 = new Function1<String, Boolean>() {
      @Override
      public Boolean apply(final String part) {
        final Function1<Issue, Boolean> _function = new Function1<Issue, Boolean>() {
          @Override
          public Boolean apply(final Issue it) {
            String _message = it.getMessage();
            return Boolean.valueOf(_message.contains(part));
          }
        };
        boolean _exists = IterableExtensions.<Issue>exists(issues, _function);
        return Boolean.valueOf((!_exists));
      }
    };
    Iterable<String> _filter_1 = IterableExtensions.<String>filter(((Iterable<String>)Conversions.doWrapArray(parts)), _function_1);
    for (final String part : _filter_1) {
      {
        sb.append("- unmatched expected issue part: ");
        sb.append(part);
        String _property = System.getProperty("line.separator");
        sb.append(_property);
      }
    }
    int _length = sb.length();
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      String _string = sb.toString();
      String _plus = ("\r\n\t\t\tIssue mismatch\r\n\t\t\t" + _string);
      String _plus_1 = (_plus + "\r\n\t\t");
      org.junit.Assert.fail(_plus_1);
    }
  }
}
