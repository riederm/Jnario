/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.unit;

import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.ScopeTestExtension;
import org.jnario.jnario.test.util.SuiteTestCreator;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.suite.suite.SpecReference;
import org.jnario.suite.suite.SuitePackage;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(SuiteTestCreator.class)
@Named("SuiteScopeProvider")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SuiteScopeProviderSpec {
  @Extension
  ScopeTestExtension _scopeTestExtension;
  
  @Extension
  SuitePackage _suitePackage = SuitePackage.eINSTANCE;
  
  @Before
  public void before() throws Exception {
    this._scopeTestExtension.parseSuite("\r\n\t\t\tpackage test\r\n\t\t\t\r\n\t\t\t#MySuite\r\n\t\t\t\r\n\t\t\t- \"My Spec Reference\"\t\r\n\t\t\r\n\t\t");
  }
  
  @Before
  public void before2() throws Exception {
    this._scopeTestExtension.parseSpec("\r\n\t\t\tpackage test\r\n\t\t\t\r\n\t\t\tdescribe \"RootSpec\"{\r\n\t\t\t\t\r\n\t\t\t\tdescribe \"SubSpec 1\"{\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t\tdescribe \"SubSpec 2\"{\r\n\t\t\t\t}\r\n\t\t\t\t\r\n\t\t\t}\r\n\t\t");
  }
  
  @Test
  @Named("spec references are only root specs")
  @Order(1)
  public void _specReferencesAreOnlyRootSpecs() throws Exception {
    Set<String> _specScope = this.specScope();
    boolean _should_contain = Should.<String>should_contain(_specScope, "RootSpec");
    Assert.assertTrue("\nExpected specScope should contain \"RootSpec\" but"
     + "\n     specScope is " + new org.hamcrest.StringDescription().appendValue(_specScope).toString() + "\n", _should_contain);
    
    Set<String> _specScope_1 = this.specScope();
    Assert.assertFalse("\nExpected specScope should not contain  \"SubSpec 1\" but"
     + "\n     specScope is " + new org.hamcrest.StringDescription().appendValue(_specScope_1).toString() + "\n", Should.<String>should_contain(_specScope_1, "SubSpec 1"));
    
  }
  
  public Set<String> specScope() {
    EObject _first = this._scopeTestExtension.first(SpecReference.class);
    EReference _specReference_Spec = this._suitePackage.getSpecReference_Spec();
    return this._scopeTestExtension.scope(_first, _specReference_Spec);
  }
}
