/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.scoping;

import com.google.common.collect.ImmutableMap;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVoid;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.jnario.scoping.JnarioResourceDescriptionStrategy;
import org.jnario.spec.spec.ExampleGroup;

@SuppressWarnings("all")
public class SpecResourceDescriptionStrategy extends JnarioResourceDescriptionStrategy {
  public final static String ROOT_SPEC = "root";
  
  public final static String TRUE = "1";
  
  public final static String FALSE = "0";
  
  public final static String EXAMPLE_TYPE = "type";
  
  @Override
  public void createUserData(final EObject eObject, final ImmutableMap.Builder<String, String> userData) {
    super.createUserData(eObject, userData);
    if ((eObject instanceof ExampleGroup)) {
      final ExampleGroup exampleGroup = ((ExampleGroup) eObject);
      userData.put(SpecResourceDescriptionStrategy.ROOT_SPEC, String.valueOf(this.isRoot(exampleGroup)));
      JvmTypeReference _targetType = exampleGroup.getTargetType();
      boolean _tripleNotEquals = (_targetType != null);
      if (_tripleNotEquals) {
        final JvmTypeReference targetType = exampleGroup.getTargetType();
        JvmType _type = targetType.getType();
        boolean _not = (!(_type instanceof JvmVoid));
        if (_not) {
          userData.put(SpecResourceDescriptionStrategy.EXAMPLE_TYPE, exampleGroup.getTargetType().getSimpleName());
        }
      }
    }
  }
  
  public String isRoot(final ExampleGroup exampleGroup) {
    String _xifexpression = null;
    EObject _eContainer = exampleGroup.eContainer();
    boolean _not = (!(_eContainer instanceof ExampleGroup));
    if (_not) {
      _xifexpression = SpecResourceDescriptionStrategy.TRUE;
    } else {
      _xifexpression = SpecResourceDescriptionStrategy.FALSE;
    }
    return _xifexpression;
  }
  
  public static String getTypeName(final IEObjectDescription specDescription) {
    return specDescription.getUserData(SpecResourceDescriptionStrategy.EXAMPLE_TYPE);
  }
}
