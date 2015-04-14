/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.integration;

import org.eclipse.xtext.xbase.lib.Extension;
import org.hamcrest.Matcher;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.ResultMatchers;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

@CreateWith(SpecTestCreator.class)
@Named("Specs")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SpecsSpec {
  @Extension
  BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("support anonymous class declaration")
  @Order(1)
  public void _supportAnonymousClassDeclaration() throws Exception {
    final String spec = "\r\n\t\t\tpackage bootstrap\r\n\t\t\t\r\n\t\t\timport java.util.HashMap\r\n\r\n      describe \'Anonymous classes\' {\r\n        fact {\r\n          val test = new HashMap(){\r\n      \r\n              override get(Object key) {\r\n                \"Hello World\"\r\n              }\r\n              \r\n            }\r\n            test.get(null) => \"Hello World\"\r\n        }\r\n      }\r\n\t\t";
    Result _execute = this._behaviorExecutor.execute(spec);
    Matcher<Result> _isSuccessful = ResultMatchers.isSuccessful();
    Assert.<Result>assertThat(_execute, _isSuccessful);
  }
}
