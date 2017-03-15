/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.unit;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.suite.naming.SuiteQualifiedNameProvider;
import org.jnario.suite.suite.Suite;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(SuiteTestCreator.class)
@Named("SuiteQualifiedNameProvider")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SuiteQualifiedNameProviderSpec {
  @Subject
  public SuiteQualifiedNameProvider subject;
  
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public ModelStore _modelStore;
  
  @Test
  @Named("removes suite prefix")
  @Order(1)
  public void _removesSuitePrefix() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#My Suite");
    this._modelStore.parseSuite(_builder.toString());
    String _qualifiedName = this.qualifiedName();
    Assert.assertTrue("\nExpected qualifiedName => \"My Suite\" but"
     + "\n     qualifiedName is " + new org.hamcrest.StringDescription().appendValue(_qualifiedName).toString() + "\n", Should.<String>operator_doubleArrow(_qualifiedName, "My Suite"));
    
  }
  
  @Test
  @Named("removes suite trailing text")
  @Order(2)
  public void _removesSuiteTrailingText() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#My Suite");
    _builder.newLine();
    _builder.append("with description");
    this._modelStore.parseSuite(_builder.toString());
    String _qualifiedName = this.qualifiedName();
    Assert.assertTrue("\nExpected qualifiedName => \"My Suite\" but"
     + "\n     qualifiedName is " + new org.hamcrest.StringDescription().appendValue(_qualifiedName).toString() + "\n", Should.<String>operator_doubleArrow(_qualifiedName, "My Suite"));
    
  }
  
  @Test
  @Named("add suite package")
  @Order(3)
  public void _addSuitePackage() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.append("#My Suite");
    this._modelStore.parseSuite(_builder.toString());
    String _qualifiedName = this.qualifiedName();
    Assert.assertTrue("\nExpected qualifiedName => \"test.My Suite\" but"
     + "\n     qualifiedName is " + new org.hamcrest.StringDescription().appendValue(_qualifiedName).toString() + "\n", Should.<String>operator_doubleArrow(_qualifiedName, "test.My Suite"));
    
  }
  
  @Test
  @Named("handles empty packages")
  @Order(4)
  public void _handlesEmptyPackages() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#My Suite");
    this._modelStore.parseSuite(_builder.toString());
    String _qualifiedName = this.qualifiedName();
    Assert.assertTrue("\nExpected qualifiedName => \"My Suite\" but"
     + "\n     qualifiedName is " + new org.hamcrest.StringDescription().appendValue(_qualifiedName).toString() + "\n", Should.<String>operator_doubleArrow(_qualifiedName, "My Suite"));
    
  }
  
  @Test
  @Named("handles empty suites")
  @Order(5)
  public void _handlesEmptySuites() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("#");
    _builder.newLine();
    this._modelStore.parseSuite(_builder.toString());
    String _qualifiedName = this.qualifiedName();
    Assert.assertNull("\nExpected qualifiedName should be null\n     but is " + new org.hamcrest.StringDescription().appendValue(_qualifiedName).toString() + "\n", _qualifiedName);
    
  }
  
  public String qualifiedName() {
    Suite _firstSuite = this._modelStore.firstSuite();
    QualifiedName _fullyQualifiedName = this.subject.getFullyQualifiedName(_firstSuite);
    String _string = null;
    if (_fullyQualifiedName!=null) {
      _string=_fullyQualifiedName.toString();
    }
    return _string;
  }
}
