/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.unit.doc;

import com.google.inject.Inject;
import java.util.Collection;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.Executable;
import org.jnario.JnarioTypeDeclaration;
import org.jnario.feature.doc.FeatureDocGenerator;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.FeatureFile;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.report.Executable2ResultMapping;
import org.jnario.report.Failed;
import org.jnario.report.SpecExecution;
import org.jnario.report.SpecFailure;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(FeatureTestCreator.class)
@Named("FeatureDocGenerator")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeatureDocGeneratorSpec {
  @Subject
  public FeatureDocGenerator subject;
  
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public ModelStore _modelStore;
  
  @Inject
  InMemoryFileSystemAccess fsa;
  
  @Inject
  Executable2ResultMapping mapping;
  
  @Test
  @Named("generates scenario documentation")
  @Order(1)
  public void _generatesScenarioDocumentation() throws Exception {
    final String actual = this.generateDoc("\r\n\t\t\tpackage test\r\n\r\n\t\t\tFeature: Example Feature\r\n\t\t\t\t\r\n\t\t\t\tThis is a description.\r\n\t\t\t\t\r\n\t\t\t\tScenario: Example Scenario\r\n\t\t\t\t\r\n\t\t\t\t\tString input\r\n\t\t\t\t\r\n\t\t\t\t\tGiven a step with an argument \"something\", another \"argument\" and a multiline string:\r\n\t\t\t\t\t\'\'\'\r\n\t\t\t\t\t\timport java.util.Collections.*;\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t\tpublic class Greeter{\r\n\t\t\t\t\t\t\tpublic static void main(String args[]){\r\n\t\t\t\t\t\t\t\tList<String> list = new ArrayList<String>(); // should escape angle brackets\r\n\t\t\t\t\t\t\t\tSysten.out.println(\'Hello World\');\r\n\t\t\t\t\t\t\t}\r\n\t\t\t\t\t\t}\'\'\' \r\n\t\t\t\t\t\tinput = args.first\r\n\t\t\t\t\t\tprintln(args.last)\r\n\t\t\t\t\tWhen I do something that is pending.\r\n\t\t\t\t\t\tAnd something else that is pending\r\n\t\t\t\t\t\tBut this is implemented\r\n\t\t\t\t\t\t\t1 + 1 => 2\r\n\t\t\t\t\tThen it results in \"something else\"\r\n\t\t\t\t\t\tinput + \' else\' => args.first                                    \r\n\t\t");
    final String expected = "<p>This is a description.</p>\r\n<div><h3 class=\"scenario pending\"  id=\"Scenario_Example_Scenario\">Scenario: Example Scenario\r\n</h3>\r\n<ul>\r\n<li><span class=\"step notrun\"><p>Given a step with an argument <code>\"something\"</code>, another <code>\"argument\"</code> and a multiline string:</p><pre>import java.util.Collections.*;\r\n\r\npublic class Greeter{\r\n  public static void main(String args[]){\r\n    List&lt;String&gt; list = new ArrayList&lt;String&gt;(); // should escape angle brackets\r\n    Systen.out.println(\'Hello World\');\r\n  }\r\n}</pre></span>\r\n</li>\r\n<li><span class=\"step pending\"><p>When I do something that is pending. [PENDING]</p></span>\r\n</li>\r\n<li><span class=\"step pending\"><p>And something else that is pending [PENDING]</p></span>\r\n</li>\r\n<li><span class=\"step notrun\"><p>But this is implemented</p></span>\r\n</li>\r\n<li><span class=\"step notrun\"><p>Then it results in <code>\"something else\"</code></p></span>\r\n</li>\r\n</ul>\r\n</div>\r\n".toString();
    Assert.assertEquals(expected, actual);
  }
  
  @Test
  @Named("Includes failure state in Feature")
  @Order(2)
  public void _includesFailureStateInFeature() throws Exception {
    CharSequence _generateDocWithErrors = this.generateDocWithErrors("Feature: Example\r\n\r\nScenario: A failing Scenario\r\n\r\nGiven something\r\nWhen something happens \r\nThen there is an error\r\n\r\nScenario: Another scnario\r\nGiven something\r\n\t1 + 1 => 2\r\nThen something else\r\n\t\"\"       \r\n");
    org.jnario.lib.Assert.assertTrue("\nExpected \'\'\'\r\n\t\t\tFeature: Example\r\n\t\t\t\r\n\t\t\tScenario: A failing Scenario\r\n\t\t\t\r\n\t\t\tGiven something\r\n\t\t\tWhen something happens \r\n\t\t\tThen there is an error\r\n\t\t\t\r\n\t\t\tScenario: Another scnario\r\n\t\t\tGiven something\r\n\t\t\t\t1 + 1 => 2\r\n\t\t\tThen something else\r\n\t\t\t\t\"\"       \r\n\t\t\'\'\'.generateDocWithErrors should contain \"failed\" but"
     + "\n     \'\'\'\r\n\t\t\tFeature: Example\r\n\t\t\t\r\n\t\t\tScenario: A failing Scenario\r\n\t\t\t\r\n\t\t\tGiven something\r\n\t\t\tWhen something happens \r\n\t\t\tThen there is an error\r\n\t\t\t\r\n\t\t\tScenario: Another scnario\r\n\t\t\tGiven something\r\n\t\t\t\t1 + 1 => 2\r\n\t\t\tThen something else\r\n\t\t\t\t\"\"       \r\n\t\t\'\'\'.generateDocWithErrors is " + new org.hamcrest.StringDescription().appendValue(_generateDocWithErrors).toString() + "\n", Should.<Object>should_contain(_generateDocWithErrors, "failed"));
    
  }
  
  final String message = "Expected result => args.first.toInt but      \r\n \t\tresult is <122>     \r\n \t\targs.first.toInt is <120>       \r\n \t\targs.first is \"120\"     \r\n \t\targs is <[120]>\r\n";
  
  public Executable2ResultMapping mappingWithFailures() {
    final Executable2ResultMapping _function = new Executable2ResultMapping() {
      @Override
      public SpecExecution getResult(final Executable it) {
        String _string = FeatureDocGeneratorSpec.this.message.toString();
        String _string_1 = "java.lang.StringIndexOutOfBoundsException: String index out of range: -1\r\n\tat java.lang.String.substring(String.java:1937)\r\n\tat java.lang.String.substring(String.java:1904)\r\n\tat org.jnario.feature.doc.FeatureDocGenerator$1.apply(FeatureDocGenerator.java:44)\r\n\tat org.jnario.feature.doc.FeatureDocGenerator$1.apply(FeatureDocGenerator.java:1)\r\n\tat org.jnario.doc.HtmlFile.newHtmlFile(HtmlFile.java:21)\r\n\tat org.jnario.feature.doc.FeatureDocGenerator.createHtmlFile(FeatureDocGenerator.java:57)\r\n\tat org.jnario.doc.AbstractDocGenerator$2$1.apply(AbstractDocGenerator.java:88)\r\n".toString();
        SpecFailure _specFailure = new SpecFailure(_string, "Exception", _string_1);
        return Failed.failingSpec("org.jnario.Class", "This Feature", 0.3, _specFailure);
      }
    };
    return this.mapping = _function;
  }
  
  public CharSequence generateDocWithErrors(@Extension final CharSequence input) {
    CharSequence _xblockexpression = null;
    {
      final Resource resource = this._modelStore.parseScenario(input);
      Executable2ResultMapping _mappingWithFailures = this.mappingWithFailures();
      this.subject.doGenerate(resource, this.fsa, _mappingWithFailures);
      Map<String, CharSequence> _files = this.fsa.getFiles();
      Collection<CharSequence> _values = _files.values();
      _xblockexpression = JnarioIterableExtensions.<CharSequence>first(_values);
    }
    return _xblockexpression;
  }
  
  public String generateDoc(@Extension final CharSequence input) {
    final Resource resource = this._modelStore.parseScenario(input);
    EList<EObject> _contents = resource.getContents();
    EObject _head = IterableExtensions.<EObject>head(_contents);
    final FeatureFile featureFile = ((FeatureFile) _head);
    EList<JnarioTypeDeclaration> _xtendTypes = featureFile.getXtendTypes();
    JnarioTypeDeclaration _head_1 = IterableExtensions.<JnarioTypeDeclaration>head(_xtendTypes);
    CharSequence _generateContent = this.subject.generateContent(((Feature) _head_1));
    return _generateContent.toString();
  }
}
