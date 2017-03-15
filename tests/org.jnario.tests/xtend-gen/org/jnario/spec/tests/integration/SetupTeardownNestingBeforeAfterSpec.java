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

@Named("Nesting before & after")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SetupTeardownNestingBeforeAfterSpec extends SetupTeardownSpec {
  @Test
  @Named("Before and after in parent are executed for childs")
  @Order(1)
  public void _beforeAndAfterInParentAreExecutedForChilds() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Setup & Teardown\"{ ");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("before all println(\"Spec: before all\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("before println(\"Spec: before\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact println(\"Spec: fact 1\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact println(\"Spec: fact 2\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("context \"Context1\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("before all println(\"Context1: before all\")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("before println(\"Context1: before\")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("fact println(\"Context1: fact 1.1\")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("fact println(\"Context1: fact 1.2\")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("after println(\"Context1: after\")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("after all println(\"Context1: after all\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("context \"Nested Spec 2\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("before all println(\"Context2: before all\")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("before println(\"Context2: before\")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("fact println(\"Context2: fact 2.1\")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("fact println(\"Context2: fact 2.2\")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("after println(\"Context2: after\")");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("after all println(\"Context2: after all\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("after println(\"Spec: after\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("after all println(\"Spec: after all\")");
    _builder.newLine();
    _builder.append("}  ");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("Spec: before all");
    _builder_1.newLine();
    _builder_1.append("Context1: before all");
    _builder_1.newLine();
    _builder_1.append("Spec: before");
    _builder_1.newLine();
    _builder_1.append("Context1: before");
    _builder_1.newLine();
    _builder_1.append("Context1: fact 1.1");
    _builder_1.newLine();
    _builder_1.append("Context1: after");
    _builder_1.newLine();
    _builder_1.append("Spec: after");
    _builder_1.newLine();
    _builder_1.append("Spec: before");
    _builder_1.newLine();
    _builder_1.append("Context1: before");
    _builder_1.newLine();
    _builder_1.append("Context1: fact 1.2");
    _builder_1.newLine();
    _builder_1.append("Context1: after");
    _builder_1.newLine();
    _builder_1.append("Spec: after");
    _builder_1.newLine();
    _builder_1.append("Context1: after all");
    _builder_1.newLine();
    _builder_1.append("Context2: before all");
    _builder_1.newLine();
    _builder_1.append("Spec: before");
    _builder_1.newLine();
    _builder_1.append("Context2: before");
    _builder_1.newLine();
    _builder_1.append("Context2: fact 2.1");
    _builder_1.newLine();
    _builder_1.append("Context2: after");
    _builder_1.newLine();
    _builder_1.append("Spec: after");
    _builder_1.newLine();
    _builder_1.append("Spec: before");
    _builder_1.newLine();
    _builder_1.append("Context2: before");
    _builder_1.newLine();
    _builder_1.append("Context2: fact 2.2");
    _builder_1.newLine();
    _builder_1.append("Context2: after");
    _builder_1.newLine();
    _builder_1.append("Spec: after");
    _builder_1.newLine();
    _builder_1.append("Context2: after all");
    _builder_1.newLine();
    _builder_1.append("Spec: before");
    _builder_1.newLine();
    _builder_1.append("Spec: fact 1");
    _builder_1.newLine();
    _builder_1.append("Spec: after");
    _builder_1.newLine();
    _builder_1.append("Spec: before");
    _builder_1.newLine();
    _builder_1.append("Spec: fact 2");
    _builder_1.newLine();
    _builder_1.append("Spec: after");
    _builder_1.newLine();
    _builder_1.append("Spec: after all");
    _builder_1.newLine();
    this.prints(_builder.toString(), _builder_1.toString());
  }
}
