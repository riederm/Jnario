/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.unit;

import junit.framework.Assert;
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
  ModelStore _modelStore;
  
  InMemoryFileSystemAccess fsa;
  
  @Before
  public void before() throws Exception {
    this._modelStore.parseSpec("\r\n\t\tpackage test\r\n\t\tdescribe \"Red\"{\r\n\t\t}\r\n\t\tdescribe \"Blue\"{\r\n\t\t}\r\n\t\tdescribe \"Green\"{\r\n\t\t}\r\n\t\tdescribe \"Grey\"{\r\n\t\t}\r\n\t\t");
  }
  
  @Test
  @Named("Generates suite doc with resolved specs")
  @Order(1)
  public void _generatesSuiteDocWithResolvedSpecs() throws Exception {
    final String actual = this.generateDoc("\r\n\t\t\tpackage test\r\n\t\t\t\r\n\t\t\t#Heading\r\n\t\t\tHeading description.\r\n\t\t\t- \"Red\"\r\n\t\t\t- \"Blue\": with a description\r\n\t\t\t##Subheading\r\n\t\t\tSubheading description with **markdown**.\r\n\t\t\t- \\.*G.*\\\r\n\t\t");
    final String expected = "\r\n\t\t<p>Heading description.</p>\r\n\t\t<ul>\r\n\t\t\t<li><a class=\"specref pending\" href=\"../test/RedSpec.html\">Red</a> <strong class=\"icon pending\">~</strong></li>\r\n\t\t\t<li><a class=\"specref pending\" href=\"../test/BlueSpec.html\">Blue</a> <strong class=\"icon pending\">~</strong>: with a description</li>\r\n\t\t</ul>\r\n\t\t<span id=\"Subheading\" class=\"suite pending\"><h2>Subheading</h2></span>\r\n\t\t<p>Subheading description with <strong>markdown</strong>.</p>\r\n\t\t<ul>\r\n\t\t\t<li><a class=\"specref pending\" href=\"../test/GreenSpec.html\">Green</a> <strong class=\"icon pending\">~</strong></li>\r\n\t\t\t<li><a class=\"specref pending\" href=\"../test/GreySpec.html\">Grey</a> <strong class=\"icon pending\">~</strong></li>\r\n\t\t</ul>\r\n\t\t".toString();
    Assert.assertEquals(expected, actual);
  }
  
  public String generateDoc(final CharSequence input) {
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
