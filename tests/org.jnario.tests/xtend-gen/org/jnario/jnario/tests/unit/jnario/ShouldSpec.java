/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.tests.unit.jnario;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.Should;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.lib.Assert;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(SpecTestCreator.class)
@Named("Should")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ShouldSpec {
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public ModelStore _modelStore;
  
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("\\\'isNot\\\' is false if for \\\'1 should be 1")
  @Order(1)
  public void _isNotIsFalseIfFor1ShouldBe1() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.append("describe \"Should\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact 1 should be 1");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._modelStore.parseSpec(_builder.toString());
    Query _query = this._modelStore.query();
    Should _first = _query.<Should>first(Should.class);
    boolean _isNot = _first.isNot();
    boolean _not = (!_isNot);
    Assert.assertTrue("\nExpected !query.first(typeof(Should)).isNot but"
     + "\n     query.first(typeof(Should)).isNot is " + new org.hamcrest.StringDescription().appendValue(_isNot).toString()
     + "\n     query.first(typeof(Should)) is " + new org.hamcrest.StringDescription().appendValue(_first).toString()
     + "\n     query is " + new org.hamcrest.StringDescription().appendValue(_query).toString() + "\n", _not);
    
  }
  
  @Test
  @Named("\\\'isNot\\\' is true if for \\\'1 should not be 1")
  @Order(2)
  public void _isNotIsTrueIfFor1ShouldNotBe1() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package bootstrap");
    _builder.newLine();
    _builder.append("describe \"Should\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact 1 should not be 1");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._modelStore.parseSpec(_builder.toString());
    Query _query = this._modelStore.query();
    Should _first = _query.<Should>first(Should.class);
    boolean _isNot = _first.isNot();
    Assert.assertTrue("\nExpected query.first(typeof(Should)).isNot but"
     + "\n     query.first(typeof(Should)) is " + new org.hamcrest.StringDescription().appendValue(_first).toString()
     + "\n     query is " + new org.hamcrest.StringDescription().appendValue(_query).toString() + "\n", _isNot);
    
  }
  
  @Test
  @Named("short circuit invocation works in closures within assertions")
  @Order(3)
  public void _shortCircuitInvocationWorksInClosuresWithinAssertions() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Test\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact assert list(null, \"\").filter [ it != null && it.length > 2 ].empty");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder.toString());
  }
  
  @Test
  @Named("throw checks expected exception")
  @Order(4)
  public void _throwChecksExpectedException() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.append("describe \"Test\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact new Stack().pop throws EmptyStackException");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder.toString());
  }
  
  @Test
  @Named("throw checks fails if no exception is thrown")
  @Order(5)
  public void _throwChecksFailsIfNoExceptionIsThrown() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Test\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"\" throws Exception");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executionFails(_builder.toString());
  }
  
  @Test
  @Named("throw checks fails if exception with different type is thrown")
  @Order(6)
  public void _throwChecksFailsIfExceptionWithDifferentTypeIsThrown() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.append("describe \"Test\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact new Stack().pop throws NoSuchElementException");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executionFails(_builder.toString());
  }
  
  @Test
  @Named("compares arrays")
  @Order(7)
  public void _comparesArrays() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Test\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact list(\"red\").toArray => list(\"red\").toArray");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder.toString());
  }
  
  @Test
  @Named("infers throws type")
  @Order(8)
  public void _infersThrowsType() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import java.util.*");
    _builder.newLine();
    _builder.append("describe \"Test\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact new Stack<String>().pop should throw EmptyStackException");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact new Stack<String>().pop throws EmptyStackException");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder.toString());
  }
  
  @Test
  @Named("should safely matches null values")
  @Order(9)
  public void _shouldSafelyMatchesNullValues() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Test\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"hello\" should not be null");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder.toString());
  }
  
  @Test
  @Named("=> safely matches null values")
  @Order(10)
  public void _safelyMatchesNullValues() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Test\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact null => null");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder.toString());
  }
}
