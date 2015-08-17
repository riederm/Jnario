/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.feature.documentation;

import org.jnario.feature.documentation.IntroducingJnarioFeaturesSpec;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * There are two different views available for features - one displaying everything
 * including steps and their definition (code), the other one only displaying
 * the steps and definition of arguments.
 * To expand or collapse the definition of the steps use the feature button
 * that you can find in the main button bar while being in a feature file.
 */
@Named("Views")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class IntroducingJnarioFeaturesViewsSpec extends IntroducingJnarioFeaturesSpec {
  /**
   * @filter('''|.isSuccessful)
   * @lang(feature)
   */
  @Test
  @Named("Displaying step definitions")
  @Order(1)
  public void _displayingStepDefinitions() throws Exception {
    FeatureExecutor.isSuccessful("\r\n\t       package demo\r\n\t       import org.jnario.feature.documentation.Calculator\r\n\r\n\t       Feature: Calculator\r\n\t       \r\n\t       Background:\r\n\t         Calculator calculator\r\n\t         int result\r\n\t         Given a calculator\r\n\t           calculator = new Calculator\r\n\t       \r\n\t       Scenario: Adding two numbers\r\n\t         When adding two numbers \"5\" and \"6\". \r\n\t           result = calculator.add(args.first.toInt, args.second.toInt)\r\n\t         Then it prints \"11\"\r\n\t           result => args.first.toInt\r\n\t           \r\n\t       Scenario: Dividing two numbers\r\n\t        When entering two numbers \"10\" and \"5\" and pressing enter. \r\n\t          result = calculator.divide(args.first.toInt, args.second.toInt)\r\n\t        Then it prints \"2\"\r\n         ");
  }
  
  /**
   * @filter('''|.isSuccessful)
   * @lang(feature)
   */
  @Test
  @Named("Hiding step definitions")
  @Order(2)
  public void _hidingStepDefinitions() throws Exception {
    FeatureExecutor.isSuccessful("\r\n\t       package demo\r\n\t       import org.jnario.feature.documentation.Calculator\r\n\r\n\t       Feature: Calculator\r\n\t       \r\n\t       Background:\r\n\t         Given a calculator\r\n\t       \r\n\t       Scenario: Adding two numbers\r\n\t         When adding two numbers \"5\" and \"6\". \r\n\t         Then it prints \"11\"\r\n\t           \r\n\t       Scenario: Dividing two numbers\r\n\t        When entering two numbers \"10\" and \"5\" and pressing enter. \r\n\t        Then it prints \"2\"\r\n         ");
  }
}
