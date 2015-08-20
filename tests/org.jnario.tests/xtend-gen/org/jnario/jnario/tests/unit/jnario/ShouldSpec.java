/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.tests.unit.jnario;

import com.google.inject.Inject;
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
  @Inject
  public ModelStore _modelStore;
  
  @Extension
  @Inject
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("\\\'isNot\\\' is false if for \\\'1 should be 1")
  @Order(1)
  public void _isNotIsFalseIfFor1ShouldBe1() throws Exception {
    this._modelStore.parseSpec("package bootstrap\r\ndescribe \"Should\"{\r\n\tfact 1 should be 1\r\n}\r\n");
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
    this._modelStore.parseSpec("package bootstrap\r\ndescribe \"Should\"{\r\n\tfact 1 should not be 1\r\n}\r\n");
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
    this._behaviorExecutor.executesSuccessfully("describe \"Test\"{\r\n\tfact assert list(null, \"\").filter [ it != null && it.length > 2 ].empty\r\n}\r\n");
  }
  
  @Test
  @Named("throw checks expected exception")
  @Order(4)
  public void _throwChecksExpectedException() throws Exception {
    this._behaviorExecutor.executesSuccessfully("import java.util.*\r\ndescribe \"Test\"{\r\n\tfact new Stack().pop throws EmptyStackException\r\n}\r\n");
  }
  
  @Test
  @Named("throw checks fails if no exception is thrown")
  @Order(5)
  public void _throwChecksFailsIfNoExceptionIsThrown() throws Exception {
    this._behaviorExecutor.executionFails("describe \"Test\"{\r\n\tfact \"\" throws Exception\r\n}\r\n");
  }
  
  @Test
  @Named("throw checks fails if exception with different type is thrown")
  @Order(6)
  public void _throwChecksFailsIfExceptionWithDifferentTypeIsThrown() throws Exception {
    this._behaviorExecutor.executionFails("import java.util.*\r\ndescribe \"Test\"{\r\n\tfact new Stack().pop throws NoSuchElementException\r\n}\r\n");
  }
  
  @Test
  @Named("compares arrays")
  @Order(7)
  public void _comparesArrays() throws Exception {
    this._behaviorExecutor.executesSuccessfully("describe \"Test\"{\r\n\tfact list(\"red\").toArray => list(\"red\").toArray\r\n}\r\n");
  }
  
  @Test
  @Named("infers throws type")
  @Order(8)
  public void _infersThrowsType() throws Exception {
    this._behaviorExecutor.executesSuccessfully("import java.util.*\r\ndescribe \"Test\"{\r\n\tfact new Stack<String>().pop should throw EmptyStackException\r\n\tfact new Stack<String>().pop throws EmptyStackException\r\n}\r\n");
  }
  
  @Test
  @Named("should safely matches null values")
  @Order(9)
  public void _shouldSafelyMatchesNullValues() throws Exception {
    this._behaviorExecutor.executesSuccessfully("describe \"Test\"{\r\n\tfact \"hello\" should not be null\r\n}\r\n");
  }
  
  @Test
  @Named("=> safely matches null values")
  @Order(10)
  public void _safelyMatchesNullValues() throws Exception {
    this._behaviorExecutor.executesSuccessfully("describe \"Test\"{\r\n\tfact null => null\r\n}\r\n");
  }
}
