/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.documentation;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("Given, When, Then...")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class GivenWhenThenSpec {
  /**
   * If you have multiple **Givens**, **Whens** or **Thens** you can
   * use **And** or **But** to concatenate them:
   * @filter('''|.isSuccessful)
   * @lang(feature)
   */
  @Test
  @Named("And, But")
  @Order(1)
  public void _andBut() throws Exception {
    FeatureExecutor.isSuccessful("\r\n\t\t  Feature: And & But\r\n\t\t  Scenario: Multiple Givens\r\n\t\t    Given one thing\r\n\t\t      And another thing\r\n\t\t      And yet another thing\r\n\t\t    When I trigger something\r\n\t\t    Then happens something\r\n\t\t      But not more\r\n\t\t");
  }
}
