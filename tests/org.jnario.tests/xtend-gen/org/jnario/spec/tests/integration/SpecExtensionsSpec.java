/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.integration;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
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
  @org.jnario.runner.Extension
  @Inject
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("Example:")
  @Order(1)
  public void _example() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import org.jnario.spec.tests.integration.ExtensionExample");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe \"Extension\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("extension static ExtensionExample = new ExtensionExample()");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("context \"Nested Spec\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("fact println(\"test 3\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact println(\"test 1\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact println(\"test 2\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("before Class");
    _builder_1.newLine();
    _builder_1.append("before");
    _builder_1.newLine();
    _builder_1.append("test 3");
    _builder_1.newLine();
    _builder_1.append("after");
    _builder_1.newLine();
    _builder_1.append("before");
    _builder_1.newLine();
    _builder_1.append("test 1");
    _builder_1.newLine();
    _builder_1.append("after");
    _builder_1.newLine();
    _builder_1.append("before");
    _builder_1.newLine();
    _builder_1.append("test 2");
    _builder_1.newLine();
    _builder_1.append("after");
    _builder_1.newLine();
    _builder_1.append("after Class");
    _builder_1.newLine();
    this.prints(_builder.toString(), _builder_1.toString());
  }
  
  public void prints(@Extension final CharSequence spec, @Extension final String expected) {
    final ConsoleRecorder recording = ConsoleRecorder.start();
    this._behaviorExecutor.executesSuccessfully(spec);
    final String actual = recording.stop();
    String _replace = expected.replace("\r", "");
    String _replace_1 = actual.replace("\r", "");
    Assert.assertEquals(_replace, _replace_1);
  }
}
