/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.integration;

import com.google.inject.Inject;
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
 * It is possible to customize the instantiation of features, specs and subjects.
 * This can be useful when a dependency injection container or a mocking
 * framework should be used for creating specs. To do so, create a custom `SpecCreator` and
 * annotate your spec with `CreateWith` and pass as a value the type of the custom `SpecCreator`.
 * Here is an example for a custom `SpecCreator` that uses Google Guice to create the specification:
 * 
 * <pre class="prettyprint">
 * package org.jnario.lib;
 * 
 * import com.google.inject.Guice;
 * import com.google.inject.util.Modules;
 * 
 * public class GuiceSpecCreator extends AbstractSpecCreator {
 *   public Object create(Class<?> klass) throws Exception {
 *     return Guice.createInjector(Modules.EMPTY_MODULE).getInstance(klass);
 *   }
 * }
 * </pre>
 * 
 * [Here](https://gist.github.com/2869959) is another example that demonstrates
 * how to create a custom **SpecCreator** for [Mockito](http://code.google.com/p/mockito/).
 */
@CreateWith(SpecTestCreator.class)
@Named("Customizing the Spec Creation")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class CustomizingTheSpecCreationSpec {
  @Extension
  @Inject
  BehaviorExecutor _behaviorExecutor;
  
  /**
   * This example uses the Google Guice to instantiate the specification.
   *  @filter('''|.executesSuccessfully)
   */
  @Test
  @Named("Example")
  @Order(1)
  public void _example() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n      package bootstrap\r\n      \r\n      import org.jnario.runner.CreateWith\r\n      import org.jnario.jnario.test.util.GuiceSpecCreator\r\n      import com.google.inject.Inject\r\n      \r\n      @CreateWith(typeof(GuiceSpecCreator))\r\n      describe \"Something\" {\r\n        \r\n        @Inject String toInject\r\n        \r\n        fact toInject should not be null\r\n            \r\n      }\r\n    ");
  }
}
