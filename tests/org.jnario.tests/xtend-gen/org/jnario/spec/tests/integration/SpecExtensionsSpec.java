/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.integration;

import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.ConsoleRecorder;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Extensions can be used to share common setup and tear down behavior across different specifications.
 * For example, given a normal java class with some JUnit setup and tear down methods:
 * 
 * <pre class="prettify">
 * public class ExtensionExample {
 *   @BeforeClass
 *   public static void beforeClass(){
 *     System.out.println("before Class");
 *   }
 * 
 *   @Before
 *   public void before(){
 *     System.out.println("before");
 *   }
 * 
 *   @AfterClass
 *   public static void afterClass(){
 *     System.out.println("after Class");
 *   }
 * 
 *   @After
 *   public void after(){
 *     System.out.println("after");
 *   }
 * }
 * </pre>
 * 
 * When you declare an instance of this class
 * as an extension field in your spec, all the setup
 * and tear down methods will be executed before/after
 * each fact/spec, respectively:
 */
@CreateWith(SpecTestCreator.class)
@Named("Spec Extensions")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class SpecExtensionsSpec {
  @Extension
  BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("Example:")
  @Order(1)
  public void _example() throws Exception {
    this.prints("\r\n\t\t\timport org.jnario.spec.tests.integration.ExtensionExample\r\n\r\n\t\t\tdescribe \"Extension\"{\r\n\t\t\t\textension static ExtensionExample = new ExtensionExample()\r\n\r\n\t\t\t\tcontext \"Nested Spec\"{\r\n\t\t\t\t\tfact println(\"test 3\")\r\n\t\t\t\t}\r\n\t\t\t\tfact println(\"test 1\")\r\n\t\t\t\tfact println(\"test 2\")\r\n\t\t\t\t\r\n\t\t\t}\r\n\t\t", "\r\n\t\t\t\tbefore Class\r\n\t\t\t\tbefore\r\n\t\t\t\ttest 3\r\n\t\t\t\tafter\r\n\t\t\t\tbefore\r\n\t\t\t\ttest 1\r\n\t\t\t\tafter\r\n\t\t\t\tbefore\r\n\t\t\t\ttest 2\r\n\t\t\t\tafter\r\n\t\t\t\tafter Class\r\n\t\t");
  }
  
  public void prints(final CharSequence spec, final String expected) {
    final ConsoleRecorder recording = ConsoleRecorder.start();
    this._behaviorExecutor.executesSuccessfully(spec);
    final String actual = recording.stop();
    Assert.assertEquals(expected, actual);
  }
}
