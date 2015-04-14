/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.integration;

import com.google.common.base.Objects;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.jnario.test.util.Helpers;
import org.jnario.lib.Assert;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.integration.AssertionSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Assertions in Jnario are selfexplainable. This means, when failing, they try to
 * provide as as much information as possible. In that case, they
 * print the exact expression that has failed together with the actual value
 * of all subexpressions.
 */
@Named("No more debugging...")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class AssertionNoMoreDebuggingSpec extends AssertionSpec {
  /**
   * For example, it will print the value of all referenced variables.
   */
  @Test
  @Named("Variable Access")
  @Order(1)
  public void _variableAccess() throws Exception {
    final boolean y = false;
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
      @Override
      public void apply(final Boolean it) {
        Assert.assertTrue("\nExpected y but"
         + "\n     y is " + new org.hamcrest.StringDescription().appendValue(y).toString() + "\n", y);
        
      }
    };
    String _errorMessage = Helpers.errorMessage(_function);
    Helpers.is(_errorMessage, 
      "\r\n\t\t\tExpected y but\r\n\t\t\t     y is <false>");
  }
  
  /**
   * Literal values obviously won't be printed.
   */
  @Test
  @Named("Filters literals")
  @Order(2)
  public void _filtersLiterals() throws Exception {
    final int x = 0;
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
      @Override
      public void apply(final Boolean it) {
        Assert.assertTrue("\nExpected x == 42 but"
         + "\n     x is " + new org.hamcrest.StringDescription().appendValue(x).toString() + "\n", (x == 42));
        
      }
    };
    String _errorMessage = Helpers.errorMessage(_function);
    Helpers.is(_errorMessage, "\r\n\t\t\t  Expected x == 42 but\r\n\t\t\t       x is <0>");
  }
  
  /**
   * Here is another example .
   */
  @Test
  @Named("Not Equals")
  @Order(3)
  public void _notEquals() throws Exception {
    final int x = 42;
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
      @Override
      public void apply(final Boolean it) {
        Assert.assertTrue("\nExpected !(x == 42) but"
         + "\n     x == 42 is " + new org.hamcrest.StringDescription().appendValue((x == 42)).toString()
         + "\n     x is " + new org.hamcrest.StringDescription().appendValue(x).toString() + "\n", (!(x == 42)));
        
      }
    };
    String _errorMessage = Helpers.errorMessage(_function);
    Helpers.is(_errorMessage, "\r\n\t\t\t  Expected !(x == 42) but\r\n\t\t\t       x == 42 is <true>\r\n\t\t\t       x is <42>");
  }
  
  /**
   * The result of a function call will be printed as well.
   */
  @Test
  @Named("Function Calls")
  @Order(4)
  public void _functionCalls() throws Exception {
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
      @Override
      public void apply(final Boolean it) {
        String _greet = AssertionNoMoreDebuggingSpec.this.greet("World");
        boolean _equals = Objects.equal(_greet, "Hello World!");
        Assert.assertTrue("\nExpected greet(\"World\") == \"Hello World!\" but"
         + "\n     greet(\"World\") is " + new org.hamcrest.StringDescription().appendValue(_greet).toString() + "\n", _equals);
        
      }
    };
    String _errorMessage = Helpers.errorMessage(_function);
    Helpers.is(_errorMessage, "\r\n\t\t\t  Expected greet(\"World\") == \"Hello World!\" but\r\n\t\t\t       greet(\"World\") is \"Hello World\"");
  }
  
  /**
   * The result of each feature call will be printed.
   */
  @Test
  @Named("Feature Calls")
  @Order(5)
  public void _featureCalls() throws Exception {
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
      @Override
      public void apply(final Boolean it) {
        String _upperCase = "Hello".toUpperCase();
        String _lowerCase = _upperCase.toLowerCase();
        boolean _equals = Objects.equal(_lowerCase, "HELLO");
        Assert.assertTrue("\nExpected \"Hello\".toUpperCase.toLowerCase == \"HELLO\" but"
         + "\n     \"Hello\".toUpperCase.toLowerCase is " + new org.hamcrest.StringDescription().appendValue(_lowerCase).toString()
         + "\n     \"Hello\".toUpperCase is " + new org.hamcrest.StringDescription().appendValue(_upperCase).toString() + "\n", _equals);
        
      }
    };
    String _errorMessage = Helpers.errorMessage(_function);
    Helpers.is(_errorMessage, "\r\n\t\t\t  Expected \"Hello\".toUpperCase.toLowerCase == \"HELLO\" but\r\n\t\t\t       \"Hello\".toUpperCase.toLowerCase is \"hello\"\r\n\t\t\t       \"Hello\".toUpperCase is \"HELLO\"");
  }
  
  /**
   * This example involves two expressions with `&&`.
   */
  @Test
  @Named("And expressions")
  @Order(6)
  public void _andExpressions() throws Exception {
    final int x = 0;
    final int y = 1;
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
      @Override
      public void apply(final Boolean it) {
        Assert.assertTrue("\nExpected x == 1 && y == 0 but"
         + "\n     x == 1 is " + new org.hamcrest.StringDescription().appendValue((x == 1)).toString()
         + "\n     x is " + new org.hamcrest.StringDescription().appendValue(x).toString()
         + "\n     y == 0 is " + new org.hamcrest.StringDescription().appendValue((y == 0)).toString()
         + "\n     y is " + new org.hamcrest.StringDescription().appendValue(y).toString() + "\n", ((x == 1) && (y == 0)));
        
      }
    };
    String _errorMessage = Helpers.errorMessage(_function);
    Helpers.is(_errorMessage, "\r\n\t\t\t  Expected x == 1 && y == 0 but\r\n\t\t\t       x == 1 is <false>\r\n\t\t\t       x is <0>\r\n\t\t\t       y == 0 is <false>\r\n\t\t\t       y is <1>");
  }
  
  /**
   * If the same variable is accessed multiple times it will be printed only once.
   */
  @Test
  @Named("Removes duplicate feature calls")
  @Order(7)
  public void _removesDuplicateFeatureCalls() throws Exception {
    final int x = 0;
    final Procedure1<Boolean> _function = new Procedure1<Boolean>() {
      @Override
      public void apply(final Boolean it) {
        Assert.assertTrue("\nExpected x > 0 && x < 10 but"
         + "\n     x > 0 is " + new org.hamcrest.StringDescription().appendValue((x > 0)).toString()
         + "\n     x is " + new org.hamcrest.StringDescription().appendValue(x).toString()
         + "\n     x < 10 is " + new org.hamcrest.StringDescription().appendValue((x < 10)).toString() + "\n", ((x > 0) && (x < 10)));
        
      }
    };
    String _errorMessage = Helpers.errorMessage(_function);
    Helpers.is(_errorMessage, "\r\n\t\t\t  Expected x > 0 && x < 10 but\r\n\t\t\t       x > 0 is <false>\r\n\t\t\t       x is <0>\r\n\t\t\t       x < 10 is <true>");
  }
  
  /**
   * fact "Block expressions"{
   * errorMessage[assert {val x = "hello"; x} == ""].is('''''')
   * }
   */
  public String greet(final String name) {
    return ("Hello " + name);
  }
}
