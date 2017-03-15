/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.integration;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.integration.SetupTeardownSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Before")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SetupTeardownBeforeSpec extends SetupTeardownSpec {
  @Test
  @Named("Executes before each test")
  @Order(1)
  public void _executesBeforeEachTest() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Before\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("before{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("println(\"before\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact println(\"fact 1\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact println(\"fact 2\")");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("before");
    _builder_1.newLine();
    _builder_1.append("fact 1");
    _builder_1.newLine();
    _builder_1.append("before");
    _builder_1.newLine();
    _builder_1.append("fact 2");
    _builder_1.newLine();
    this.prints(_builder.toString(), _builder_1.toString());
  }
}
