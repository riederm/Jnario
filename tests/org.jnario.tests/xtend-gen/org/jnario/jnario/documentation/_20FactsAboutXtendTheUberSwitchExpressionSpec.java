/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.documentation;

import com.google.common.base.Objects;
import java.util.List;
import org.jnario.jnario.documentation._20FactsAboutXtendSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Xtend's switch expression is greatly improved over the one from Java.
 * There is no fall through which means only one case is
 * evaluated at most and it is not limited to certain
 * values but can be used for any object.
 */
@Named("The Uber-Switch Expression")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class _20FactsAboutXtendTheUberSwitchExpressionSpec extends _20FactsAboutXtendSpec {
  /**
   * Cases support arbitrary expressions, if they evaluate to a boolean value, it will
   * be used as result, otherwise, the evaluation result will be compared using `Object#equals(Object)`.
   */
  @Test
  @Named("Supports case expressions")
  @Order(1)
  public void _supportsCaseExpressions() throws Exception {
    final String myString = "Hello";
    String _switchResult = null;
    boolean _matched = false;
    int _length = myString.length();
    boolean _greaterThan = (_length > 5);
    if (_greaterThan) {
      _matched=true;
      _switchResult = "a long string.";
    }
    if (!_matched) {
      if (Objects.equal(myString, "some")) {
        _matched=true;
        _switchResult = "It\'s some string.";
      }
    }
    if (!_matched) {
      _switchResult = "It\'s another short string.";
    }
    Assert.assertTrue("\nExpected switch myString {\r\n        case myString.length > 5 : \"a long string.\"\r\n        case \'some\'              : \"It\'s some string.\"\r\n        default                  : \"It\'s another short string.\"\r\n      } \r\n      \r\n      =>  \"It\'s another short string.\" but"
     + "\n     switch myString {\r\n        case myString.length > 5 : \"a long string.\"\r\n        case \'some\'              : \"It\'s some string.\"\r\n        default                  : \"It\'s another short string.\"\r\n      } is " + new org.hamcrest.StringDescription().appendValue(_switchResult).toString() + "\n", Should.<String>operator_doubleArrow(_switchResult, "It\'s another short string."));
    
  }
  
  /**
   * You can also write type guards in the case statements. Note that
   * on the right-hand side of the case statement you can directly
   * access the features of the guarded type without an explicit cast;
   */
  @Test
  @Named("...and type guards [with type inference]")
  @Order(2)
  public void _andTypeGuardsWithTypeInference() throws Exception {
    List<Integer> _list = JnarioCollectionLiterals.<Integer>list(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3));
    final Object x = ((Object) _list);
    int _switchResult = (int) 0;
    boolean _matched = false;
    if (x instanceof String) {
      int _length = ((String)x).length();
      boolean _greaterThan = (_length > 0);
      if (_greaterThan) {
        _matched=true;
        _switchResult = ((String)x).length();
      }
    }
    if (!_matched) {
      if (x instanceof List) {
        _matched=true;
        _switchResult = ((List<?>)x).size();
      }
    }
    if (!_matched) {
      _switchResult = (-1);
    }
    Assert.assertTrue("\nExpected switch x {\r\n        String case x.length > 0 : x.length // length from String \r\n        List<?>                  : x.size    // size from List\r\n        default : -1\r\n      } \r\n      \r\n      => 3 but"
     + "\n     switch x {\r\n        String case x.length > 0 : x.length // length from String \r\n        List<?>                  : x.size    // size from List\r\n        default : -1\r\n      } is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_switchResult)).toString() + "\n", Should.<Integer>operator_doubleArrow(Integer.valueOf(_switchResult), Integer.valueOf(3)));
    
  }
}
