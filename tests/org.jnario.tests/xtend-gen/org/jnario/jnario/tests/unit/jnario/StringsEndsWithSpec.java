/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.tests.unit.jnario;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.tests.unit.jnario.StringsSpec;
import org.jnario.lib.Assert;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("endsWith")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class StringsEndsWithSpec extends StringsSpec {
  @Test
  @Named("assert \\\'\\\'\\\'hello\\\'\\\'\\\'.endsWith[\\\'\\\'\\\'lo\\\'\\\'\\\']")
  @Order(1)
  public void _assertHelloEndsWithLo() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("hello");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("lo");
    boolean _endsWith = _builder.toString().endsWith(_builder_1.toString());
    Assert.assertTrue("\nExpected \'\'\'hello\'\'\'.endsWith(\'\'\'lo\'\'\') but"
     + "\n     \'\'\'hello\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     \'\'\'lo\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder_1.toString()).toString() + "\n", _endsWith);
    
  }
  
  @Test
  @Named("assert !\\\'\\\'\\\'hello\\\'\\\'\\\'.endsWith[\\\'\\\'\\\'he\\\'\\\'\\\']")
  @Order(2)
  public void _assertHelloEndsWithHe() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("hello");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("he");
    boolean _endsWith = _builder.toString().endsWith(_builder_1.toString());
    boolean _not = (!_endsWith);
    Assert.assertTrue("\nExpected !\'\'\'hello\'\'\'.endsWith(\'\'\'he\'\'\') but"
     + "\n     \'\'\'hello\'\'\'.endsWith(\'\'\'he\'\'\') is " + new org.hamcrest.StringDescription().appendValue(_endsWith).toString()
     + "\n     \'\'\'hello\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     \'\'\'he\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder_1.toString()).toString() + "\n", _not);
    
  }
  
  @Test
  @Named("assert !\\\'\\\'\\\'short\\\'\\\'\\\'.endsWith[\\\'\\\'\\\'longer\\\'\\\'\\\']")
  @Order(3)
  public void _assertShortEndsWithLonger() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("short");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("longer");
    boolean _endsWith = _builder.toString().endsWith(_builder_1.toString());
    boolean _not = (!_endsWith);
    Assert.assertTrue("\nExpected !\'\'\'short\'\'\'.endsWith(\'\'\'longer\'\'\') but"
     + "\n     \'\'\'short\'\'\'.endsWith(\'\'\'longer\'\'\') is " + new org.hamcrest.StringDescription().appendValue(_endsWith).toString()
     + "\n     \'\'\'short\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     \'\'\'longer\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder_1.toString()).toString() + "\n", _not);
    
  }
}
