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
    this.prints("describe \"Setup & Teardown\"{ \r\n\tbefore all println(\"Spec: before all\")\r\n\tbefore println(\"Spec: before\")\r\n\tfact println(\"Spec: fact 1\")\r\n\tfact println(\"Spec: fact 2\")\r\n\tcontext \"Context1\"{\r\n\t\tbefore all println(\"Context1: before all\")\r\n\t\tbefore println(\"Context1: before\")\r\n\t\tfact println(\"Context1: fact 1.1\")\r\n\t\tfact println(\"Context1: fact 1.2\")\r\n\t\tafter println(\"Context1: after\")\r\n\t\tafter all println(\"Context1: after all\")\r\n\t}\r\n\tcontext \"Nested Spec 2\"{\r\n\t\tbefore all println(\"Context2: before all\")\r\n\t\tbefore println(\"Context2: before\")\r\n\t\tfact println(\"Context2: fact 2.1\")\r\n\t\tfact println(\"Context2: fact 2.2\")\r\n\t\tafter println(\"Context2: after\")\r\n\t\tafter all println(\"Context2: after all\")\r\n\t}\r\n\tafter println(\"Spec: after\")\r\n\tafter all println(\"Spec: after all\")\r\n}  \r\n", "Spec: before all\r\nContext1: before all\r\nSpec: before\r\nContext1: before\r\nContext1: fact 1.1\r\nContext1: after\r\nSpec: after\r\nSpec: before\r\nContext1: before\r\nContext1: fact 1.2\r\nContext1: after\r\nSpec: after\r\nContext1: after all\r\nContext2: before all\r\nSpec: before\r\nContext2: before\r\nContext2: fact 2.1\r\nContext2: after\r\nSpec: after\r\nSpec: before\r\nContext2: before\r\nContext2: fact 2.2\r\nContext2: after\r\nSpec: after\r\nContext2: after all\r\nSpec: before\r\nSpec: fact 1\r\nSpec: after\r\nSpec: before\r\nSpec: fact 2\r\nSpec: after\r\nSpec: after all\r\n");
  }
}
