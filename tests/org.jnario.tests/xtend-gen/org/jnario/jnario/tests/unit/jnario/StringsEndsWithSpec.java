/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.tests.unit.jnario;

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
  @Named("assert \\\"hello\\\".endsWith[\\\"lo\\\"]")
  @Order(1)
  public void _assertHelloEndsWithLo() throws Exception {
    boolean _endsWith = "hello".endsWith("lo");
    Assert.assertTrue("\nExpected \"hello\".endsWith(\"lo\") but"
     + "\n     \"hello\".endsWith(\"lo\") is " + new org.hamcrest.StringDescription().appendValue(_endsWith).toString() + "\n", _endsWith);
    
  }
  
  @Test
  @Named("assert !\\\"hello\\\".endsWith[\\\"he\\\"]")
  @Order(2)
  public void _assertHelloEndsWithHe() throws Exception {
    boolean _endsWith = "hello".endsWith("he");
    boolean _not = (!_endsWith);
    Assert.assertTrue("\nExpected !\"hello\".endsWith(\"he\") but"
     + "\n     \"hello\".endsWith(\"he\") is " + new org.hamcrest.StringDescription().appendValue(_endsWith).toString() + "\n", _not);
    
  }
  
  @Test
  @Named("assert !\\\"short\\\".endsWith[\\\"longer\\\"]")
  @Order(3)
  public void _assertShortEndsWithLonger() throws Exception {
    boolean _endsWith = "short".endsWith("longer");
    boolean _not = (!_endsWith);
    Assert.assertTrue("\nExpected !\"short\".endsWith(\"longer\") but"
     + "\n     \"short\".endsWith(\"longer\") is " + new org.hamcrest.StringDescription().appendValue(_endsWith).toString() + "\n", _not);
    
  }
}
