/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.integration;

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
    this.prints("\r\n\t\t\t\tdescribe \"Setup & Teardown\"{ \r\n\t\t\t\t\tbefore all println(\"Spec: before all\")\r\n\t\t\t\t\tbefore println(\"Spec: before\")\r\n\t\t\t\t\tfact println(\"Spec: fact 1\")\r\n\t\t\t\t\tfact println(\"Spec: fact 2\")\r\n\t\t\t\t\tcontext \"Context1\"{\r\n\t\t\t\t\t\tbefore all println(\"Context1: before all\")\r\n\t\t\t\t\t\tbefore println(\"Context1: before\")\r\n\t\t\t\t\t\tfact println(\"Context1: fact 1.1\")\r\n\t\t\t\t\t\tfact println(\"Context1: fact 1.2\")\r\n\t\t\t\t\t\tafter println(\"Context1: after\")\r\n\t\t\t\t\t\tafter all println(\"Context1: after all\")\r\n\t\t\t\t\t}\r\n\t\t\t\t\tcontext \"Nested Spec 2\"{\r\n\t\t\t\t\t\tbefore all println(\"Context2: before all\")\r\n\t\t\t\t\t\tbefore println(\"Context2: before\")\r\n\t\t\t\t\t\tfact println(\"Context2: fact 2.1\")\r\n\t\t\t\t\t\tfact println(\"Context2: fact 2.2\")\r\n\t\t\t\t\t\tafter println(\"Context2: after\")\r\n\t\t\t\t\t\tafter all println(\"Context2: after all\")\r\n\t\t\t\t\t}\r\n\t\t\t\t\tafter println(\"Spec: after\")\r\n\t\t\t\t\tafter all println(\"Spec: after all\")\r\n\t\t\t\t}  \r\n\t \t\t", "\r\n\t\t\t\t\tSpec: before all\r\n\t\t\t\t\tContext1: before all\r\n\t\t\t\t\tSpec: before\r\n\t\t\t\t\tContext1: before\r\n\t\t\t\t\tContext1: fact 1.1\r\n\t\t\t\t\tContext1: after\r\n\t\t\t\t\tSpec: after\r\n\t\t\t\t\tSpec: before\r\n\t\t\t\t\tContext1: before\r\n\t\t\t\t\tContext1: fact 1.2\r\n\t\t\t\t\tContext1: after\r\n\t\t\t\t\tSpec: after\r\n\t\t\t\t\tContext1: after all\r\n\t\t\t\t\tContext2: before all\r\n\t\t\t\t\tSpec: before\r\n\t\t\t\t\tContext2: before\r\n\t\t\t\t\tContext2: fact 2.1\r\n\t\t\t\t\tContext2: after\r\n\t\t\t\t\tSpec: after\r\n\t\t\t\t\tSpec: before\r\n\t\t\t\t\tContext2: before\r\n\t\t\t\t\tContext2: fact 2.2\r\n\t\t\t\t\tContext2: after\r\n\t\t\t\t\tSpec: after\r\n\t\t\t\t\tContext2: after all\r\n\t\t\t\t\tSpec: before\r\n\t\t\t\t\tSpec: fact 1\r\n\t\t\t\t\tSpec: after\r\n\t\t\t\t\tSpec: before\r\n\t\t\t\t\tSpec: fact 2\r\n\t\t\t\t\tSpec: after\r\n\t\t\t\t\tSpec: after all\r\n\t \t\t");
  }
}
