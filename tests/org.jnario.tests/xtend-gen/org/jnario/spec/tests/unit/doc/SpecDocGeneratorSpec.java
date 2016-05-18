/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.unit.doc;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import java.util.Map;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.doc.SpecDocGenerator;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(SpecTestCreator.class)
@Named("SpecDocGenerator")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SpecDocGeneratorSpec {
  @Subject
  public SpecDocGenerator subject;
  
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public ModelStore _modelStore;
  
  @Inject
  InMemoryFileSystemAccess fsa;
  
  @Test
  @Named("generates scenario title and heading")
  @Order(1)
  public void _generatesScenarioTitleAndHeading() throws Exception {
    this.generateEmptyExampleDoc();
    final String scenarioDoc = this.generatedFile("ExampleSpec.html");
    boolean _notEquals = (!Objects.equal(scenarioDoc, null));
    boolean _contains = scenarioDoc.contains("<title>Example</title>");
    boolean _and = (_notEquals && _contains);
    Assert.assertTrue("\nExpected scenarioDoc != null && \r\n\t\t\t\tscenarioDoc.contains(\"<title>Example</title>\") but"
     + "\n     scenarioDoc != null is " + new org.hamcrest.StringDescription().appendValue(_notEquals).toString()
     + "\n     scenarioDoc is " + new org.hamcrest.StringDescription().appendValue(scenarioDoc).toString()
     + "\n     scenarioDoc.contains(\"<title>Example</title>\") is " + new org.hamcrest.StringDescription().appendValue(_contains).toString() + "\n", _and);
    
    scenarioDoc.contains("<h1>Example</h1>");
  }
  
  @Test
  @Named("generates scenario documentation")
  @Order(2)
  public void _generatesScenarioDocumentation() throws Exception {
    this.generateDoc("/*\r\n * Irrelevant documentation.\r\n */\r\n \r\n/*\r\n * This is an example.\r\n */\r\ndescribe \'Example\'{\r\n\t\r\n} \r\n");
    final String scenarioDoc = this.generatedFile("ExampleSpec.html");
    boolean _contains = scenarioDoc.contains("<p>This is an example.</p>");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\"<p>This is an example.</p>\") but"
     + "\n     scenarioDoc is " + new org.hamcrest.StringDescription().appendValue(scenarioDoc).toString() + "\n", _contains);
    
    boolean _contains_1 = scenarioDoc.contains("<p>Irrelevant documentation.</p>");
    boolean _not = (!_contains_1);
    Assert.assertTrue("\nExpected !scenarioDoc.contains(\"<p>Irrelevant documentation.</p>\") but"
     + "\n     scenarioDoc.contains(\"<p>Irrelevant documentation.</p>\") is " + new org.hamcrest.StringDescription().appendValue(_contains_1).toString()
     + "\n     scenarioDoc is " + new org.hamcrest.StringDescription().appendValue(scenarioDoc).toString() + "\n", _not);
    
  }
  
  @Test
  @Named("generates example documentation")
  @Order(3)
  public void _generatesExampleDocumentation() throws Exception {
    this.generateDoc("describe \'Example\'{\r\n\t/*\r\n\t * Example documentation\r\n\t */\r\n\tfact \"should do stuff\"{\r\n\t\tvar x = 0\r\n\t\tx = x + 1\r\n\t}\r\n}");
    final String scenarioDoc = this.generatedFile("ExampleSpec.html");
    String _convertNL = this.convertNL(scenarioDoc);
    String _convertNL_1 = this.convertNL("<p id=\"should_do_stuff\" class=\"example notrun\"><strong>should do stuff</strong></p>\r\n<p>Example documentation</p>\r\n<pre class=\"prettyprint lang-spec linenums\">\r\nvar x = 0\r\nx = x + 1</pre>");
    boolean _contains = _convertNL.contains(_convertNL_1);
    Assert.assertTrue("\nExpected scenarioDoc.convertNL.contains(\'\'\'\r\n\t\t<p id=\"should_do_stuff\" class=\"example notrun\"><strong>should do stuff</strong></p>\r\n\t\t<p>Example documentation</p>\r\n\t\t<pre class=\"prettyprint lang-spec linenums\">\r\n\t\tvar x = 0\r\n\t\tx = x + 1</pre>\'\'\'.convertNL) but"
     + "\n     scenarioDoc.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     scenarioDoc is " + new org.hamcrest.StringDescription().appendValue(scenarioDoc).toString()
     + "\n     \'\'\'\r\n\t\t<p id=\"should_do_stuff\" class=\"example notrun\"><strong>should do stuff</strong></p>\r\n\t\t<p>Example documentation</p>\r\n\t\t<pre class=\"prettyprint lang-spec linenums\">\r\n\t\tvar x = 0\r\n\t\tx = x + 1</pre>\'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString() + "\n", _contains);
    
  }
  
  @Test
  @Named("supports markdown for documentation")
  @Order(4)
  public void _supportsMarkdownForDocumentation() throws Exception {
    this.generateDoc("/*\r\n * #Example Heading\r\n */\r\ndescribe \'Example\'{\r\n\t\r\n} \r\n");
    final String scenarioDoc = this.generatedFile("ExampleSpec.html");
    boolean _contains = scenarioDoc.contains("<h1>Example Heading</h1>");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\"<h1>Example Heading</h1>\") but"
     + "\n     scenarioDoc is " + new org.hamcrest.StringDescription().appendValue(scenarioDoc).toString() + "\n", _contains);
    
  }
  
  @Test
  @Named("generates table for example tables")
  @Order(5)
  public void _generatesTableForExampleTables() throws Exception {
    this.generateDoc("describe \'Example\'{\r\n\tdef myExample{\r\n\t\t| a | b |\r\n\t\t| 1 | 2 |\r\n\t}\r\n} \r\n");
    final String scenarioDoc = this.generatedFile("ExampleSpec.html");
    boolean _contains = scenarioDoc.contains("<p id=\"myExample\"><strong>MyExample</strong></p>");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\'<p id=\"myExample\"><strong>MyExample</strong></p>\') but"
     + "\n     scenarioDoc is " + new org.hamcrest.StringDescription().appendValue(scenarioDoc).toString() + "\n", _contains);
    
    boolean _contains_1 = scenarioDoc.contains("<th>a</th>");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\"<th>a</th>\") but"
     + "\n     scenarioDoc is " + new org.hamcrest.StringDescription().appendValue(scenarioDoc).toString() + "\n", _contains_1);
    
    boolean _contains_2 = scenarioDoc.contains("<th>b</th>");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\"<th>b</th>\") but"
     + "\n     scenarioDoc is " + new org.hamcrest.StringDescription().appendValue(scenarioDoc).toString() + "\n", _contains_2);
    
    boolean _contains_3 = scenarioDoc.contains("<td>1</td>");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\"<td>1</td>\") but"
     + "\n     scenarioDoc is " + new org.hamcrest.StringDescription().appendValue(scenarioDoc).toString() + "\n", _contains_3);
    
    boolean _contains_4 = scenarioDoc.contains("<td>2</td>");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\"<td>2</td>\") but"
     + "\n     scenarioDoc is " + new org.hamcrest.StringDescription().appendValue(scenarioDoc).toString() + "\n", _contains_4);
    
  }
  
  @Test
  @Named("No code block for examples without description")
  @Order(6)
  public void _noCodeBlockForExamplesWithoutDescription() throws Exception {
    this.generateDoc("describe \'Example\'{\r\n\tfact 1 + 1 => 2\r\n} \r\n");
    final String scenarioDoc = this.generatedFile("ExampleSpec.html");
    String _convertNL = this.convertNL(scenarioDoc);
    String _convertNL_1 = this.convertNL("<pre class=\"prettyprint lang-spec linenums\">\r\n1 + 1 =&gt; 2</pre>");
    Assert.assertFalse("\nExpected scenarioDoc.convertNL should not contain \'\'\'<pre class=\"prettyprint lang-spec linenums\">\r\n1 + 1 =&gt; 2</pre>\'\'\'.convertNL but"
     + "\n     scenarioDoc.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     scenarioDoc is " + new org.hamcrest.StringDescription().appendValue(scenarioDoc).toString()
     + "\n     \'\'\'<pre class=\"prettyprint lang-spec linenums\">\r\n1 + 1 =&gt; 2</pre>\'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString() + "\n", Should.<Object>should_contain(_convertNL, _convertNL_1));
    
  }
  
  @Test
  @Named("filters code based on regex in filter annotation")
  @Order(7)
  public void _filtersCodeBasedOnRegexInFilterAnnotation() throws Exception {
    this.generateDoc("describe \'Example\'{\r\n\t/*\r\n\t * @filter(bbb)\r\n\t */\r\n\tfact \"should do stuff\"{\r\n\t\t\"aaabbbaaa\"\r\n\t}\r\n} \r\n");
    final String scenarioDoc = this.generatedFile("ExampleSpec.html");
    boolean _contains = scenarioDoc.contains("aaaaaa");
    Assert.assertTrue("\nExpected scenarioDoc.contains(\'aaaaaa\') but"
     + "\n     scenarioDoc is " + new org.hamcrest.StringDescription().appendValue(scenarioDoc).toString() + "\n", _contains);
    
  }
  
  @Test
  @Named("includes failing state for examples")
  @Order(8)
  public void _includesFailingStateForExamples() throws Exception {
    this.generateDoc("describe \'Example\'{\r\n\tfact \"should do stuff\"{\r\n\t\t\"aaabbbaaa\"\r\n\t}\r\n} \r\n");
  }
  
  @Test
  @Named("supports @lang annotation")
  @Order(9)
  public void _supportsLangAnnotation() throws Exception {
    this.generateDoc("describe \'Example\'{\r\n\t/*\r\n\t * @lang(ruby)\r\n\t */\r\n\tfact \"test\" {\r\n\t\t1 + 1 => 2\r\n\t}\r\n} \r\n");
    final String scenarioDoc = this.generatedFile("ExampleSpec.html");
    String _convertNL = this.convertNL(scenarioDoc);
    String _convertNL_1 = this.convertNL("<pre class=\"prettyprint lang-ruby linenums\">\r\n1 + 1 =&gt; 2</pre>");
    Assert.assertTrue("\nExpected scenarioDoc.convertNL should contain \'\'\'<pre class=\"prettyprint lang-ruby linenums\">\r\n1 + 1 =&gt; 2</pre>\'\'\'.convertNL but"
     + "\n     scenarioDoc.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     scenarioDoc is " + new org.hamcrest.StringDescription().appendValue(scenarioDoc).toString()
     + "\n     \'\'\'<pre class=\"prettyprint lang-ruby linenums\">\r\n1 + 1 =&gt; 2</pre>\'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString() + "\n", Should.<Object>should_contain(_convertNL, _convertNL_1));
    
  }
  
  public void generateEmptyExampleDoc() {
    this.generateDoc("describe \'Example\'{\r\n\t\r\n} \r\n");
  }
  
  public void generateDoc(@Extension final CharSequence input) {
    final Resource resource = this._modelStore.parseSpec(input);
    this.subject.doGenerate(resource, this.fsa);
  }
  
  public String generatedFile(@Extension final String name) {
    Map<String, CharSequence> _textFiles = this.fsa.getTextFiles();
    CharSequence _get = _textFiles.get(("DOC_OUTPUT/" + name));
    String _string = null;
    if (_get!=null) {
      _string=_get.toString();
    }
    return _string;
  }
  
  public String convertNL(@Extension final String s) {
    return s.replace("\r", "");
  }
}
