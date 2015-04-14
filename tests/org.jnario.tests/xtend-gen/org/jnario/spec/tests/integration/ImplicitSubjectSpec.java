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
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * If your spec describes a specific type, Jnario
 * will automatically create an instance variable
 * ```subject``` of this type. By default it will
 * use the no arg constructor to instantiate the subject
 * field, but it is possible to use Guice or other tools
 * to instantiate the subject by providing a custom
 * **SpecCreator**.
 */
@CreateWith(SpecTestCreator.class)
@Named("Implicit Subject")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ImplicitSubjectSpec {
  @Extension
  BehaviorExecutor _behaviorExecutor;
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("spec creates instance of target type")
  @Order(1)
  public void _specCreatesInstanceOfTargetType() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n      package bootstrap\r\n      \r\n      describe String {\r\n      \r\n        fact subject should not be null\r\n        fact subject should be typeof(String)\r\n\r\n      }\r\n    ");
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("subject can be overridden within example group")
  @Order(2)
  public void _subjectCanBeOverriddenWithinExampleGroup() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n      package bootstrap\r\n\r\n      describe String {\r\n        \r\n        String subject = \"overridden\"\r\n      \r\n        fact \"subject should be overridden\"{\r\n          subject should be \"overridden\"\r\n        } \r\n            \r\n      }\r\n    ");
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("subjects can be instantiated manually")
  @Order(3)
  public void _subjectsCanBeInstantiatedManually() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n      package bootstrap\r\n\r\n      describe Integer {\r\n        \r\n        before subject = new Integer(42)\r\n      \r\n        fact \"subject should be overridden\"{\r\n          subject should be 42\r\n        } \r\n            \r\n      }\r\n    ");
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("subjects will be only created if used")
  @Order(4)
  public void _subjectsWillBeOnlyCreatedIfUsed() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n      package bootstrap\r\n\r\n      describe String {\r\n        \r\n        fact \"throws NoSuchFieldException because subject will not be created\"{\r\n          typeof(StringSpec).getField(\"subject\") throws NoSuchFieldException\r\n        } \r\n            \r\n      }\r\n    ");
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("subjects can be accessed from nested ExampleGroups")
  @Order(5)
  public void _subjectsCanBeAccessedFromNestedExampleGroups() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n      package bootstrap\r\n\r\n      describe String {\r\n      \r\n        describe \"Nested ExampleGroup\"{\r\n          fact \"should inherit the subject\"{\r\n          subject should be \"\"\r\n        }\r\n      }\r\n          \r\n      }\r\n    ");
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("subjects can be overridden from nested ExampleGroups")
  @Order(6)
  public void _subjectsCanBeOverriddenFromNestedExampleGroups() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n    package bootstrap\r\n\r\n    describe String {\r\n      \r\n      describe java.util.ArrayList \"Nested ExampleGroup with different target type\"{\r\n        fact \"can override the subject\"{\r\n          assert subject.empty\r\n        }\r\n      }\r\n    }\r\n    ");
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("subject will be only created in the subexample if is not used in the parent example group")
  @Order(7)
  public void _subjectWillBeOnlyCreatedInTheSubexampleIfIsNotUsedInTheParentExampleGroup() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n      package bootstrap\r\n\r\n      describe Integer{\r\n        \r\n        describe Integer {\r\n          \r\n          Integer subject = 0\r\n          \r\n          fact \"can be manually assigned from within sub specification\"{\r\n            subject should be 0\r\n          } \r\n        }\r\n        \r\n      }\r\n    ");
  }
  
  /**
   * @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("subject will not be created in a sub example if is used in the parent example group")
  @Order(8)
  public void _subjectWillNotBeCreatedInASubExampleIfIsUsedInTheParentExampleGroup() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n      package bootstrap\r\n\r\n      describe String {\r\n        describe String{\r\n          fact \"should generate subject for superclass\"{\r\n            assert typeof(StringSpec).getDeclaredField(\"subject\") != null\r\n          }\r\n          fact \"should not generate subject for subclass\"{\r\n            typeof(StringStringSpec).getDeclaredField(\"subject\") throws NoSuchFieldException\r\n          }\r\n          fact \"uses subject\"{\r\n          subject.toString\r\n        }\r\n        }\r\n        \r\n        fact \"uses subject\"{\r\n          subject.toString\r\n        }\r\n      }\r\n    ");
  }
}
