package org.jnario.jnario.tests.unit.report;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.eclipse.xtext.util.StringInputStream;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.jnario.jnario.test.util.Strings;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.report.Failed;
import org.jnario.report.Passed;
import org.jnario.report.Pending;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecExecutionAcceptor;
import org.jnario.report.SpecFailure;
import org.jnario.report.SpecResultParser;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("SpecResultParser")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SpecResultParserSpec {
  @Subject
  public SpecResultParser subject;
  
  final static String CLASSNAME = "demo.CalculatorSpec";
  
  final static String NAME = "adding values";
  
  final static double EXECUTION_TIME = 0.01;
  
  final static String FAILURE_MESSAGE = Strings.platformIndependent("a message\r\nwithnewline");
  
  final static String FAILURE_TYPE = "java.lang.AssertionError";
  
  final static String STACKTRACE = Strings.platformIndependent("\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\nat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:39)\r\nat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:27)\r\nat java.lang.reflect.Constructor.newInstance(Constructor.java:513)\r\n    \t\t\t\t");
  
  final static String XML_STACKTRACE = ((SpecResultParserSpec.FAILURE_MESSAGE + "\n") + SpecResultParserSpec.STACKTRACE);
  
  @Test
  @Named("parses successfull specs from xml")
  @Order(1)
  public void _parsesSuccessfullSpecsFromXml() throws Exception {
    String _xml = this.toXml((((((("<testcase time=\"" + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME)) + "\" classname=\"") + SpecResultParserSpec.CLASSNAME) + "\" name=\"") + SpecResultParserSpec.NAME) + "\"/>\r\n\t\t"));
    Passed _passingSpec = this.passingSpec();
    this.parse(_xml, _passingSpec);
  }
  
  @Test
  @Named("parses specs with failure from xml")
  @Order(2)
  public void _parsesSpecsWithFailureFromXml() throws Exception {
    String _xml = this.toXml((((((((((((("<testcase time=\"" + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME)) + "\" classname=\"") + SpecResultParserSpec.CLASSNAME) + "\" name=\"") + SpecResultParserSpec.NAME) + "\">\r\n\t\t   <failure message=\"") + SpecResultParserSpec.FAILURE_MESSAGE) + "\" type=\"") + SpecResultParserSpec.FAILURE_TYPE) + "\">") + SpecResultParserSpec.XML_STACKTRACE) + "</failure>\r\n\t\t   </testcase>\r\n\t\t"));
    Failed _failingSpec = this.failingSpec();
    this.parse(_xml, _failingSpec);
  }
  
  @Test
  @Named("parses specs with error from xml")
  @Order(3)
  public void _parsesSpecsWithErrorFromXml() throws Exception {
    String _xml = this.toXml((((((((((((("<testcase time=\"" + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME)) + "\" classname=\"") + SpecResultParserSpec.CLASSNAME) + "\" name=\"") + SpecResultParserSpec.NAME) + "\">\r\n\t\t   <error message=\"") + SpecResultParserSpec.FAILURE_MESSAGE) + "\" type=\"") + SpecResultParserSpec.FAILURE_TYPE) + "\">") + SpecResultParserSpec.XML_STACKTRACE) + "</error>\r\n\t\t   </testcase>\r\n\t\t"));
    Failed _failingSpec = this.failingSpec();
    this.parse(_xml, _failingSpec);
  }
  
  @Test
  @Named("parses multiple spec results")
  @Order(4)
  public void _parsesMultipleSpecResults() throws Exception {
    String _xml = this.toXml((((((((((((((((((("<testcase time=\"" + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME)) + "\" classname=\"") + SpecResultParserSpec.CLASSNAME) + "\" name=\"") + SpecResultParserSpec.NAME) + "\"/>\r\n\t\t   <testcase time=\"") + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME)) + "\" classname=\"") + SpecResultParserSpec.CLASSNAME) + "\" name=\"") + SpecResultParserSpec.NAME) + "\">\r\n\t\t   <error message=\"") + SpecResultParserSpec.FAILURE_MESSAGE) + "\" type=\"") + SpecResultParserSpec.FAILURE_TYPE) + "\">") + SpecResultParserSpec.XML_STACKTRACE) + "</error>\r\n\t\t   </testcase>\r\n\t\t"));
    Passed _passingSpec = this.passingSpec();
    Failed _failingSpec = this.failingSpec();
    this.parse(_xml, _passingSpec, _failingSpec);
  }
  
  @Test
  @Named("created pending results")
  @Order(5)
  public void _createdPendingResults() throws Exception {
    String _xml = this.toXml((((((("<testcase time=\"" + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME)) + "\" classname=\"") + SpecResultParserSpec.CLASSNAME) + "\" name=\"") + SpecResultParserSpec.NAME) + "\">\r\n\t\t    <skipped/>\r\n\t\t   </testcase>\r\n\t\t"));
    Pending _pendingSpec = this.pendingSpec();
    this.parse(_xml, _pendingSpec);
  }
  
  @Test
  @Named("decodes escaped strings")
  @Order(6)
  public void _decodesEscapedStrings() throws Exception {
    String _xml = this.toXml((((("<testcase time=\"" + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME)) + "\" classname=\"") + SpecResultParserSpec.CLASSNAME) + "\" name=\"When I entered \\&quot;50\\&quot; and \\&quot;70\\&quot;\"/>\r\n\t\t"));
    Passed _passed = new Passed(SpecResultParserSpec.CLASSNAME, "When I entered \"50\" and \"70\"", SpecResultParserSpec.EXECUTION_TIME);
    this.parse(_xml, _passed);
  }
  
  @Test
  @Named("removes \\\',\\\' from escaped strings")
  @Order(7)
  public void _removesFromEscapedStrings() throws Exception {
    String _xml = this.toXml((((("<testcase time=\"" + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME)) + "\" classname=\"") + SpecResultParserSpec.CLASSNAME) + "\" name=\"cell[-1\\u002C 1].plus[cell[3\\u002C4]] =&gt; cell[2\\u002C5]\"/>\r\n\t\t"));
    Passed _passed = new Passed(SpecResultParserSpec.CLASSNAME, "cell[-1, 1].plus[cell[3,4]] => cell[2,5]", SpecResultParserSpec.EXECUTION_TIME);
    this.parse(_xml, _passed);
  }
  
  @Test
  @Named("supports encoding")
  @Order(8)
  public void _supportsEncoding() throws Exception {
    String _xml = this.toXml((((("<testcase time=\"" + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME)) + "\" classname=\"") + SpecResultParserSpec.CLASSNAME) + "\" name=\"L\\u00D6sung\"/>\r\n\t\t"));
    Passed _passed = new Passed(SpecResultParserSpec.CLASSNAME, "L\u00D6sung", SpecResultParserSpec.EXECUTION_TIME);
    this.parse(_xml, _passed);
  }
  
  @Test
  @Named("supports escaped chars")
  @Order(9)
  public void _supportsEscapedChars() throws Exception {
    String _xml = this.toXml((((("<testcase time=\"" + Double.valueOf(SpecResultParserSpec.EXECUTION_TIME)) + "\" classname=\"") + SpecResultParserSpec.CLASSNAME) + "\" name=\"\\&quot;http:\\/\\/www.google.de\\&quot;\"/>\r\n\t\t"));
    Passed _passed = new Passed(SpecResultParserSpec.CLASSNAME, "\"http://www.google.de\"", SpecResultParserSpec.EXECUTION_TIME);
    this.parse(_xml, _passed);
  }
  
  public Passed passingSpec() {
    return new Passed(SpecResultParserSpec.CLASSNAME, SpecResultParserSpec.NAME, SpecResultParserSpec.EXECUTION_TIME);
  }
  
  public Pending pendingSpec() {
    return new Pending(SpecResultParserSpec.CLASSNAME, SpecResultParserSpec.NAME, SpecResultParserSpec.EXECUTION_TIME);
  }
  
  public Failed failingSpec() {
    SpecFailure _specFailure = new SpecFailure(SpecResultParserSpec.FAILURE_MESSAGE, "java.lang.AssertionError", SpecResultParserSpec.STACKTRACE);
    ArrayList<SpecFailure> _newArrayList = CollectionLiterals.<SpecFailure>newArrayList(_specFailure);
    return new Failed(SpecResultParserSpec.CLASSNAME, SpecResultParserSpec.NAME, SpecResultParserSpec.EXECUTION_TIME, _newArrayList);
  }
  
  public String toXml(final CharSequence content) {
    return (("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>\r\n<testsuite failures=\"1\" time=\"0.017\" errors=\"0\" skipped=\"0\" tests=\"1\" name=\"example.AddingValuesSpec\">\r\n" + content) + "</testsuite>\t\r\n");
  }
  
  public void parse(final CharSequence content, final SpecExecution... expected) {
    final Iterator<SpecExecution> i = ((List<SpecExecution>)Conversions.doWrapArray(expected)).iterator();
    String _string = content.toString();
    StringInputStream _stringInputStream = new StringInputStream(_string);
    final SpecExecutionAcceptor _function = new SpecExecutionAcceptor() {
      @Override
      public void accept(final SpecExecution it) {
        boolean _hasNext = i.hasNext();
        boolean _doubleArrow = Should.<Boolean>operator_doubleArrow(Boolean.valueOf(_hasNext), true);
        Assert.assertTrue("\nExpected i.hasNext => true but"
         + "\n     i.hasNext is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_hasNext)).toString()
         + "\n     i is " + new org.hamcrest.StringDescription().appendValue(i).toString() + "\n", _doubleArrow);
        
        SpecExecution _next = i.next();
        String _string = _next.toString();
        String _string_1 = it.toString();
        org.junit.Assert.assertEquals(_string, _string_1);
      }
    };
    this.subject.parse(_stringInputStream, _function);
  }
}
