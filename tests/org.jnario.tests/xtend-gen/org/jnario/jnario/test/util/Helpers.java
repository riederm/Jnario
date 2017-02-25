/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.test.util;

import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Assert;

@SuppressWarnings("all")
public class Helpers {
  public static void is(final String actual, final CharSequence expected) {
    Assert.assertEquals(expected.toString().replaceAll("\r", ""), actual.replaceAll("\r", ""));
  }
  
  public static String errorMessage(final Procedure1<Boolean> proc) {
    try {
      proc.apply(null);
      throw new AssertionError("expected AssertionError");
    } catch (final Throwable _t) {
      if (_t instanceof AssertionError) {
        final AssertionError e = (AssertionError)_t;
        return e.getMessage().trim();
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
