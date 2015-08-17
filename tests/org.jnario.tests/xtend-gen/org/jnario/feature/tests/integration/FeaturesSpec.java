/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.tests.integration;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.hamcrest.Matcher;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ResultMatchers;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

@CreateWith(FeatureTestCreator.class)
@Named("Features")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class FeaturesSpec {
  @Extension
  @Inject
  BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("support anonymous class declaration")
  @Order(1)
  public void _supportAnonymousClassDeclaration() throws Exception {
    final String spec = "\r\npackage bootstrap\r\n\r\nimport java.util.HashMap\r\n\r\nFeature: Test\r\nSomething\r\n\r\nScenario: Something\r\n    When a\r\n    val test = new HashMap(){\r\n      \r\n    override get(Object key) {\r\n      \"Hello World\"\r\n    }\r\n    \r\n  }\r\n  test.get(null) => \"Hello World\"\r\nScenario: Something Els\r\n    Given an empty string\r\n    When a\r\n \r\n\t\t";
    Result _execute = this._behaviorExecutor.execute(spec);
    Matcher<Result> _isSuccessful = ResultMatchers.isSuccessful();
    Assert.<Result>assertThat(_execute, _isSuccessful);
  }
}
