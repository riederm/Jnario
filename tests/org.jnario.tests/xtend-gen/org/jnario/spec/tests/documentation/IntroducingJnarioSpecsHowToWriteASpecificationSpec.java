/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.documentation;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.tests.documentation.IntroducingJnarioSpecsSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * First of all you need a running installation of Jnario. If you haven't installed
 * Jnario yet, follow the [install guide](../../jnario/documentation/InstallingJnarioSpec.html).
 * To get started create a new specification using the spec wizard
 * (**File** -> **New** -> **Other** -> **Jnario** -> **Spec**).
 * 
 * <p align="center"><img src="/img/tutorial/spec_wizard.png" alt="New Spec Wizard"/></p>
 * 
 * <span class="label label-info">Tip</span> If the editor shows a validation error,
 * because of the missing jnario libraries, add them
 * to the classpath using the quickfix (CMD/Ctrl + 1).
 * 
 * In Jnario we *describe facts* about our program. Here are two simple facts about a stack:
 * 
 * <pre class="prettyprint lang-spec">
 * describe "A Stack"{
 *   fact "initial size is 0"
 *   fact "increases its size when pushing an element"
 * }
 * </pre>
 * 
 * To execute this specification, right click
 * in the editor and select **Run As** -> **JUnit Test**.
 * The specification will
 * pass, but the facts in our specification will be marked as _PENDING_ as they are not implemented yet.
 * 
 * <pre class="prettyprint lang-none">A Stack
 *   - initial size is 0 [PENDING]
 *   - increases its size when pushing an element [PENDING]
 * </pre>
 * 
 * In the background, Jnario automatically translates the stack specification into a JUnit test case `AStackSpec.java`
 * in the `xtend-gen` folder.
 */
@Named("How to write a Specification")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class IntroducingJnarioSpecsHowToWriteASpecificationSpec extends IntroducingJnarioSpecsSpec {
  @Extension
  @Inject
  BehaviorExecutor _behaviorExecutor;
  
  /**
   * The next step is to enrich our facts with the required logic to
   * check whether our stack behaves as specified. Checks are implemented by adding
   * a block expression to your facts.
   * We use `=>` to describe the expected result of an expression. For
   * example, `new Stack.size => 0` will fail if the size is not `0`.
   * If we execute our specification we will see that all specifications
   * pass and that they are not marked as _PENDING_ anymore. You can also mark *facts* explicitly as
   * pending using the **pending** keyword:
   * 
   * <pre class="prettyprint lang-spec">
   *   pending fact assert 1 != 2
   * </pre>
   * 
   * <span class="label label-info">Info</span> Declaring and importing other packages works similar
   * to Xtend (static imports work as well).
   * 
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("Checking your facts")
  @Order(1)
  public void _checkingYourFacts() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n\t      package demo\r\n\t      \r\n\t      import java.util.Stack\r\n\t      \r\n\t      describe \"A Stack\"{\r\n\t        fact \"initial size is 0\" {\r\n\t          new Stack().size => 0\r\n\t        }\r\n\t        fact \"increases its size when pushing an element\"{\r\n\t          val subject = new Stack<String>\r\n\t          subject.push(\"A String\")\r\n\t          subject.size => 1\r\n\t        }\r\n\t      }\r\n\t      ");
  }
  
  /**
   * Looking at our first fact:
   * 
   * <pre class="prettyprint lang-spec">
   * describe "A Stack"{
   *   fact "initial size is 0" {
   *    new Stack().size => 0
   *  }
   *  // ...
   * }
   * </pre>
   * 
   * we see that the string description looks pretty similar to the actual code.
   * We can make this even more obvious by replacing `new Stack().size => 0`
   * with `new Stack().size should be 0`, using the more descriptive `should be`
   * assertion instead of `=>`. In Jnario you can avoid such redundancies between code
   * and description by leaving the description out. The code becomes
   * the actual description:
   * 
   * <pre class="prettyprint lang-none">A Stack
   *   - new Stack().size should be 0
   *   - increases its size when pushing an element</pre>
   * 
   * <span class="label label-important">Important</span> Facts without description
   * can only have a single statement. If you need more statements, you should
   * add a description.
   * 
   * Here is the updated version of our specification:
   * 
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("Less boilerplate")
  @Order(2)
  public void _lessBoilerplate() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n\t\t\t\tpackage demo\r\n\t\t\t\t\r\n\t\t\t\timport java.util.Stack\r\n\t\t\t\t\r\n\t\t\t\tdescribe \"A Stack\"{\r\n\t\t\t\t  fact new Stack().size should be 0\r\n\t\t\t\t  fact \"increases its size when pushing an element\"{\r\n\t\t\t\t    val subject = new Stack<String>\r\n\t\t\t\t    subject.push(\"A String\")\r\n\t\t\t\t    subject.size => 1\r\n\t\t\t\t  }\r\n\t\t\t\t}\r\n\t\t      ");
  }
  
  /**
   * In the previous specification we have a little redundancy:
   * the creation of the Stack. We can get rid of it by creating
   * a field for the Stack. Declaring fields works exactly as in
   * [Xtend](http://www.eclipse.org/xtend/documentation/index.html#fields).
   * 
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("Using Fields")
  @Order(3)
  public void _usingFields() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n\t\t      package demo\r\n\t\t      \r\n\t\t      import java.util.Stack\r\n\t\t      \r\n\t\t      describe \"A Stack\"{\r\n\t\t        Stack<String> subject = new Stack<String>\r\n\t\t        fact \"initially empty\" {\r\n\t\t          subject.size => 0\r\n\t\t        }\r\n\t\t        fact \"increases its size when pushing an element\"{\r\n\t\t          subject.push(\"A String\")\r\n\t\t          subject.size => 1\r\n\t\t        }\r\n\t\t      }\r\n\t\t      ");
  }
  
  /**
   * In our example we specify the behavior
   * of a single class, which is actually a common use case. In Jnario you can
   * directly reference the specified class in the _describe_ clause:
   * 
   * <pre class="prettyprint lang-spec">
   * package demo
   * 
   * import java.util.Stack
   * 
   * describe Stack{
   *   ...
   * }
   * </pre>
   * This way you achieve a strong link between specification
   * and its target that works even if the target class is renamed.
   * Jnario will also implicitly create a field called `subject` of
   * the target type ([more...](/org/jnario/spec/tests/integration/ImplicitSubjectSpec.html)). Therefore we can get rid of the subject field in
   * our stack specification.
   * 
   * <span class="label label-important">Important</span> The implicit subject works
   * only if the target class has a default constructor without any arguments, but it
   * is also possible to use Guice or other frameworks to automatically create
   * the subjects ([more...](/org/jnario/spec/tests/integration/SpecInstantiationSpec.html)).
   * 
   * 
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("Implicit Subjects")
  @Order(4)
  public void _implicitSubjects() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n\t\t      package demo\r\n\t\t      \r\n\t\t      import java.util.Stack\r\n\t\t      \r\n\t\t      describe Stack{\r\n\t\t        fact subject.size should be 0\r\n\t\t        fact \"increases its size when pushing an element\"{\r\n\t\t          subject.push(\"A String\")\r\n\t\t          subject.size => 1\r\n\t\t        }\r\n\t\t      }\r\n\t\t      ");
  }
  
  /**
   * Sometimes a class behaves differently in different contexts.
   * For example, the behavior when calling pop on a stack depends on whether
   * the stack is empty or not. You can define
   * contexts within Jnario specs to further structure your facts:
   * 
   * <pre class="prettyprint lang-none">
   * Stack
   *   when empty
   *     - subject.size => 0
   *     - subject.pop throws EmptyStackException
   *   with elements
   *     - pop decreases size
   *     - pop removes last element"
   * </pre>
   * 
   * In this example we also use the `throws` statement in
   * `subject.pop throws EmptyStackException`. It fails
   * if the previous statement does not throw an instance of the
   * specified exception.
   * 
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("Defining Contexts")
  @Order(5)
  public void _definingContexts() throws Exception {
    this._behaviorExecutor.executesSuccessfully(" \r\n\t\t\tpackage demo\r\n\t\t\t\t      \r\n\t\t\timport java.util.Stack\r\n\t\t\timport java.util.EmptyStackException\r\n\t\t\t\r\n\t\t\tdescribe Stack{\r\n\t\t\t  context \"when empty\"{\r\n\t\t\t    fact subject.size => 0\r\n\t\t\t    fact subject.pop throws EmptyStackException\r\n\t\t\t  }\r\n\t\t\t  context \"with elements\"{\r\n\t\t\t    before subject.add(\"an element\")\r\n\t\t\t    fact \"pop decreases size\"{\r\n\t\t\t      subject.pop\r\n\t\t\t      subject.size => 0\r\n\t\t\t    }\t\r\n\t\t\t    fact \"pop removes last element\"{\r\n\t\t\t      subject.pop => \"an element\"\r\n\t\t\t    }\t\t\r\n\t\t\t  }\r\n\t\t\t}\r\n\t      ");
  }
  
  /**
   * You can structure your example data in tables. The
   * type of each column will be automatically inferred from
   * all column values. A cell in a table can have an arbitrary
   * non-void expression as a value. You can perform assertions
   * on tables using the `forEach` extension method:
   * 
   * <pre class="prettyprint lang-spec">
   * describe "Addition" {
   *   def additions{
   *     | a | b | sum |
   *     | 0 | 0 |  0  |
   *     | 1 | 2 |  3  |
   *     | 4 | 5 |  9  |
   *  }
   *  fact additions.forEach[a + b should be sum]
   * }
   * </pre>
   * 
   * The `forEach` extension method expects a closure as argument.
   * Within the closure you can directly access all values in a row
   * by their column name. The great thing about example tables is that
   * they will give you detailed error messages when one of the
   * assertions fails ([more...](/org/jnario/spec/tests/integration/SpecsExampleTablesSpec.html)):
   * 
   * <pre class="prettyprint lang-none">
   * java.lang.AssertionError: additions failed
   * 
   *         | a     | b     | sum     |
   *         | 0     | 0     | 0       | OK
   *         | 1     | 2     | 4       | FAILED     (1)
   *         | 4     | 5     | 9       | OK
   * 
   * (1) Expected a + b should be sum but
   *          a + b is 3
   *          a is 1
   *          b is 2
   *          sum is 4
   * </pre>
   * 
   * @filter(.*)
   */
  @Test
  @Named("Example Tables")
  @Order(6)
  public void _exampleTables() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n\t\t\tpackage demo \r\n\t\t\t\r\n\t\t\tdescribe \"Addition\" {\r\n\t\t\t  def additions{\r\n\t\t\t    | a | b | sum |\r\n\t\t\t    | 0 | 0 |  0  |\r\n\t\t\t    | 1 | 2 |  3  |\r\n\t\t\t    | 4 | 5 |  9  |\r\n\t\t\t  }\r\n\t\t\t  fact additions.forEach[a + b should be sum]\r\n\t\t\t}\r\n\t\t\t");
  }
  
  /**
   * Jnario can generate html documents from your specifications. The documentation will
   * be generated automatically when you create a folder `doc-gen` in the project root.
   * You can further extend the documentation by enriching your specification with
   * Javadoc like comments. You can even use [Markdown Syntax](http//daringfireball.net/projects/markdown/)
   * to format your specifications.
   * 
   * <p align="center"><a href="/img/tutorial/doc_stack_example.png"><img src="/img/tutorial/doc_stack_example_small.png" alt="Generated documentation for the stack specification"/></a></p>
   * 
   * This tutorial has actually been generated from a [specification](https://github.com/sebastianbenz/Jnario/blob/master/org.jnario.tests/src/org/jnario/spec/tests/documentation/SpecTutorial.spec).
   * 
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("Generating Documentation")
  @Order(7)
  public void _generatingDocumentation() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n\t\t\tpackage demo\r\n\t\t\t\t\t\t\t      \r\n\t\t\timport java.util.Stack\r\n\t\t\timport java.util.EmptyStackException\r\n\t\t\t\r\n\t\t\t/*\r\n\t\t\t * In computer science, a **stack** is a last in, first out \r\n\t\t\t * (LIFO) abstract data type and linear data structure. A \r\n\t\t\t * stack can have any abstract data type as an element, \r\n\t\t\t * but is characterized by two fundamental operations, \r\n\t\t\t * called push and pop. \r\n\t\t\t * (source [Wikipedia](http://en.wikipedia.org/wiki/Stack)).\r\n\t\t\t */\r\n\t\t\tdescribe Stack{\r\n\t\t\t  context \"when empty\"{\r\n\t\t\t    fact subject.size => 0\r\n\t\t\t    fact subject.pop throws EmptyStackException\r\n\t\t\t  }\r\n\t\t\t  /*\r\n\t\t\t   * A stack with a single element: \"an element\".\r\n\t\t\t   */\r\n\t\t\t  context \"with elements\"{\r\n\t\t\t    before subject.add(\"an element\")\r\n\t\t\t    fact \"pop decreases size\"{\r\n\t\t\t      subject.pop\r\n\t\t\t      subject.size => 0\r\n\t\t\t    }\t\r\n\t\t\t    fact \"pop removes last element\"{\r\n\t\t\t      subject.pop => \"an element\"\r\n\t\t\t    }\t\t\r\n\t\t\t  }\r\n\t\t\t} \r\n\t      ");
  }
  
  /**
   * Setting up a fixture or tearing it down works similar to JUnit,
   * but the syntax is less verbose. The following specification will print:
   * 
   * <pre class="prettyprint lang-none">
   * 	before all
   * 	before
   * 	do stuff
   * 	after
   * 	before
   * 	do more stuff
   * 	after
   * 	after all
   * </pre>
   * 
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("Setup & Teardown")
  @Order(8)
  public void _setupTeardown() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n\t\t\t    describe \"Setup & Teardown\" {\r\n\t\t\t      before all{\r\n\t\t\t        println(\"before all\")\r\n\t\t\t      }  \r\n\t\t\t      before{\r\n\t\t\t        println(\"before\")\r\n\t\t\t      }\r\n\t\t\t      fact \"should do stuff\" {\r\n\t\t\t        println(\"do stuff\")\r\n\t\t\t      }\r\n\t\t\t      fact \"should do more stuff\" {\r\n\t\t\t        println(\"do more stuff\")\r\n\t\t\t      }\r\n\t\t\t      after{\r\n\t\t\t        println(\"after\")\r\n\t\t\t      }\r\n\t\t\t      after all{\r\n\t\t\t        println(\"after all\")\r\n\t\t\t      }\r\n\t\t\t    }  \r\n\t\t\t");
  }
  
  /**
   * When you have to perform the same setup and tear down operations
   * for different specs you can use spec extensions.
   * For example, we need to open and close a database connection before and
   * after each test case. With Jnario you can encapsulate these operations
   * into a separate class and use the normal JUnit @before and @after annotations
   * to mark the methods that should be executed before and after a spec run.
   * 
   * 	package demo
   * 
   * 	import org.junit.Before
   * 	import org.junit.After
   * 
   * 	class DatabaseExtension {
   * 	  @Before
   * 	  def void openDatabaseConnection(){
   * 	    println("openDatabaseConnection")
   * 	  }
   * 	  def query(String statement){
   * 	    println("query: " + statement)
   * 	  }
   * 	  @After
   * 	  def void closeDatabaseConnection(){
   * 	    println("closeDatabaseConnection")
   * 	  }
   * 	}
   * 
   * If we create an [extension field](http://www.eclipse.org/xtend/documentation/index.html#Extension_Fields)
   * for our database helper class in our spec:
   * 
   * 	extension DatabaseExtension db = new DatabaseExtension
   * 
   * its setup and tear down methods will be automatically executed before and after each fact.
   * Due to Xtends extension mechanism, this has the additional benefit that we can directly access all methods in thw
   * database extension without the field name.
   * 
   * <pre class="prettyprint lang-none">
   * openDatabaseConnection
   * query: SELECT * FROM content
   * closeDatabaseConnection
   * </pre>
   * 
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("Spec extensions")
  @Order(9)
  public void _specExtensions() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n\t\t\tdescribe \"Spec Extensions\"{\r\n\t\t\t  extension DatabaseExtension db = new DatabaseExtension\r\n\t\t\t  fact query(\"SELECT * FROM content\")\t      \r\n\t\t\t}\r\n\t\t\t");
  }
  
  /**
   * Helper methods can be directly declared in Jnario files.
   * They have the same syntax as in Xtend. Helper methods and fields
   * can also be defined in nested contexts.
   * 
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("Helper methods")
  @Order(10)
  public void _helperMethods() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n\t      describe \"Helper Methods & Fields\"{\r\n\t        String subject = \"World\" \r\n\t        fact \"can access fields and methods\"{\r\n\t          subject.greeting => \"Hello World\"\r\n\t        }\r\n\t        def greeting(String s){\r\n\t          return \"Hello \" + s\r\n\t        }\r\n\t        context \"shouting\"{\r\n\t          String emphasize = \"!\" \r\n\t          fact \"can access fields and methods from parent\"{\r\n\t             subject.greeting.shout => \"HELLO WORLD!\"\r\n\t          }\r\n\t          def shout(String s){\r\n\t            return s.toUpperCase + emphasize\r\n\t          }\r\n\t        }\r\n\t      }\r\n\t      ");
  }
}
