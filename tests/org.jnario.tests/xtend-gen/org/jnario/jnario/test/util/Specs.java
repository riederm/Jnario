/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.test.util;

import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XBooleanLiteral;
import org.eclipse.xtext.xbase.XbaseFactory;
import org.jnario.jnario.test.util.Features;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecFactory;

@SuppressWarnings("all")
public class Specs {
  private final static SpecFactory factory = SpecFactory.eINSTANCE;
  
  public static Example pendingExample() {
    Example _xblockexpression = null;
    {
      final Example example = Specs.example("pending");
      example.setPending(true);
      _xblockexpression = example;
    }
    return _xblockexpression;
  }
  
  public static Example implementedExample() {
    Example _xblockexpression = null;
    {
      final Example example = Specs.example("with implementation");
      XBlockExpression _implementation = Features.implementation();
      example.setExpr(_implementation);
      _xblockexpression = example;
    }
    return _xblockexpression;
  }
  
  public static Example example(final String name) {
    Example _xblockexpression = null;
    {
      final Example example = Specs.factory.createExample();
      example.setName(name);
      example.setPending(false);
      XBooleanLiteral _createXBooleanLiteral = XbaseFactory.eINSTANCE.createXBooleanLiteral();
      example.setExpr(_createXBooleanLiteral);
      _xblockexpression = example;
    }
    return _xblockexpression;
  }
  
  public static ExampleGroup pendingExampleGroup() {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from Example to XtendMember[]");
  }
  
  public static ExampleGroup exampleGroupWith(final XtendMember... examples) {
    return Specs.exampleGroup("with examples", examples);
  }
  
  public static ExampleGroup exampleGroup(final String name, final XtendMember... examples) {
    throw new Error("Unresolved compilation problems:"
      + "\nType mismatch: cannot convert from EList<JnarioMember> to Collection<? super XtendMember>");
  }
  
  public static ExampleGroup exampleGroup(final String name) {
    ExampleGroup _xblockexpression = null;
    {
      final ExampleGroup group = Specs.factory.createExampleGroup();
      group.setName(name);
      _xblockexpression = group;
    }
    return _xblockexpression;
  }
}
