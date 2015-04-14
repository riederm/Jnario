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

@Named("Before")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SetupTeardownBeforeSpec extends SetupTeardownSpec {
  @Test
  @Named("Executes before each test")
  @Order(1)
  public void _executesBeforeEachTest() throws Exception {
    this.prints("\r\n\t\t\t\tdescribe \"Before\"{\r\n\t\t\t\t\tbefore{\r\n\t\t\t\t\t\tprintln(\"before\")\r\n\t\t\t\t\t}\r\n\t\t\t\t\tfact println(\"fact 1\")\r\n\t\t\t\t\tfact println(\"fact 2\")\r\n\t\t\t\t}\r\n\t\t\t", 
      "\r\n\t\t\t\tbefore\r\n\t\t\t\tfact 1\r\n\t\t\t\tbefore\r\n\t\t\t\tfact 2\r\n\t\t\t");
  }
}
