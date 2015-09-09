/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.integration;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(SpecTestCreator.class)
@Named("StaticImports")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class StaticImportsSpec {
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("should resolve static imports")
  @Order(1)
  public void _shouldResolveStaticImports() throws Exception {
    this._behaviorExecutor.executesSuccessfully("package bootstrap\r\n\r\nimport static org.junit.Assert.*\r\ndescribe \"Example\" {\r\n\r\n\tfact \"should resolve static imports\"{\r\n\t\tassertTrue(true) \r\n\t} \r\n\t\t\t\r\n}\r\n");
  }
}
