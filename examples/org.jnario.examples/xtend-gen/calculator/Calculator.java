/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package calculator;

import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class Calculator {
  public int add(final String a, final String b) {
    Integer _valueOf = Integer.valueOf(a);
    Integer _valueOf_1 = Integer.valueOf(b);
    return this.add((_valueOf).intValue(), (_valueOf_1).intValue());
  }
  
  public int add(final int a, final int b) {
    return (a + b);
  }
  
  public int divide(final int a, final int b) {
    return (a / b);
  }
  
  public int substract(final int a, final int b) {
    return (a - b);
  }
  
  @Override
  public String toString() {
    String _xblockexpression = null;
    {
      final int x = 3;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("before");
      _builder.append(3, "");
      _builder.append("after");
      final String y = _builder.toString();
      _xblockexpression = "Calculator";
    }
    return _xblockexpression;
  }
}
