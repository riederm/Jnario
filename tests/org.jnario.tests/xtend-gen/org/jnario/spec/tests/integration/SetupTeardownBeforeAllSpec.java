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

@Named("BeforeAll")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SetupTeardownBeforeAllSpec extends SetupTeardownSpec {
  @Test
  @Named("Executes before all tests")
  @Order(1)
  public void _executesBeforeAllTests() throws Exception {
    this.prints("describe \"BeforeAll\"{\r\n\tbefore all{\r\n\t\tprintln(\"before all\")\r\n\t}\r\n\tfact println(\"fact 1\")\r\n\tfact println(\"fact 2\")\r\n}\r\n", 
      "before all\r\nfact 1\r\nfact 2\r\n");
  }
}
