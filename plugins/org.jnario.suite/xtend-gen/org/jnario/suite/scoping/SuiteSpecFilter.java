/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.scoping;

import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.spec.scoping.SpecResourceDescriptionStrategy;
import org.jnario.spec.spec.SpecPackage;

@SuppressWarnings("all")
public class SuiteSpecFilter implements Predicate<IEObjectDescription> {
  @Extension
  private final SpecPackage _specPackage = SpecPackage.eINSTANCE;
  
  @Override
  public boolean apply(final IEObjectDescription input) {
    boolean _switchResult = false;
    EClass _eClass = input.getEClass();
    boolean _matched = false;
    EClass _exampleGroup = this._specPackage.getExampleGroup();
    if (Objects.equal(_eClass, _exampleGroup)) {
      _matched=true;
      _switchResult = this.isRoot(input);
    }
    if (!_matched) {
      _switchResult = true;
    }
    return _switchResult;
  }
  
  public boolean isRoot(final IEObjectDescription input) {
    String _userData = input.getUserData(SpecResourceDescriptionStrategy.ROOT_SPEC);
    return Objects.equal(_userData, SpecResourceDescriptionStrategy.TRUE);
  }
}
