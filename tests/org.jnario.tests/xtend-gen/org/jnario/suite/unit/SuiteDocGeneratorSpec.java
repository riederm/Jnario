/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.unit;

import com.google.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.InMemoryFileSystemAccess;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.jnario.doc.HtmlFile;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.suite.doc.SuiteDocGenerator;
import org.jnario.suite.suite.SuiteFile;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(SuiteTestCreator.class)
@Named("SuiteDocGenerator")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SuiteDocGeneratorSpec {
  @Subject
  public SuiteDocGenerator subject;
  
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public ModelStore _modelStore;
  
  @Inject
  InMemoryFileSystemAccess fsa;
  
  @Before
  public void before() throws Exception {
    this._modelStore.parseSpec("package test\r\ndescribe \"Red\"{\r\n}\r\ndescribe \"Blue\"{\r\n}\r\ndescribe \"Green\"{\r\n}\r\ndescribe \"Grey\"{\r\n}\r\n");
  }
  
  @Test
  @Named("Generates suite doc with resolved specs")
  @Order(1)
  public void _generatesSuiteDocWithResolvedSpecs() throws Exception {
    final String actual = this.generateDoc("package test\r\n\r\n#Heading\r\nHeading description.\r\n- \"Red\"\r\n- \"Blue\": with a description\r\n##Subheading\r\nSubheading description with **markdown**.\r\n- \\.*G.*\\\r\n");
    final String expected = "<p>Heading description.</p>\r\n<ul>\r\n\t<li><a class=\"specref pending\" href=\"../test/RedSpec.html\">Red</a> <strong class=\"icon pending\">~</strong></li>\r\n\t<li><a class=\"specref pending\" href=\"../test/BlueSpec.html\">Blue</a> <strong class=\"icon pending\">~</strong>: with a description</li>\r\n</ul>\r\n<span id=\"Subheading\" class=\"suite pending\"><h2>Subheading</h2></span>\r\n<p>Subheading description with <strong>markdown</strong>.</p>\r\n<ul>\r\n\t<li><a class=\"specref pending\" href=\"../test/GreenSpec.html\">Green</a> <strong class=\"icon pending\">~</strong></li>\r\n\t<li><a class=\"specref pending\" href=\"../test/GreySpec.html\">Grey</a> <strong class=\"icon pending\">~</strong></li>\r\n</ul>\r\n".toString();
    String _replace = expected.replace("\r", "");
    String _trim = _replace.trim();
    String _replace_1 = actual.replace("\r", "");
    String _trim_1 = _replace_1.trim();
    Assert.assertEquals(_trim, _trim_1);
  }
  
  public String generateDoc(@Extension final CharSequence input) {
    String _xblockexpression = null;
    {
      final Resource resource = this._modelStore.parseSuite(input);
      EList<EObject> _contents = resource.getContents();
      EObject _head = IterableExtensions.<EObject>head(_contents);
      HtmlFile _createHtmlFile = this.subject.createHtmlFile(((SuiteFile) _head));
      CharSequence _content = _createHtmlFile.getContent();
      _xblockexpression = _content.toString();
    }
    return _xblockexpression;
  }
}
