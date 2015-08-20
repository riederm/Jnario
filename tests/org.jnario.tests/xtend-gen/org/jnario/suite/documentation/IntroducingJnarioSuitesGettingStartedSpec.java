/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.suite.documentation;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Resources;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.suite.documentation.IntroducingJnarioSuitesSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * First of all you need a running installation of Jnario. If you haven't installed
 * Jnario yet, follow the [install guide](../../jnario/documentation/InstallingJnarioSpec.html).
 * To get started first create a new Java project and a new Jnario suite using the suite wizard
 * (**File** -> **New** -> **Other** -> **Jnario** -> **Suite**).
 * 
 * <img width="500px" src="/img/tutorial/suite_wizard.png" alt="New Suite Wizard"/>
 * 
 * Name the suite file "MySuite" and as description use "My Jnario Suite". The created suite will
 * look like:
 * 
 * <span class="label label-info">Tip</span> If the editor shows a validation error,
 * because of the missing jnario libraries, add them
 * to the classpath using the quickfix (CMD/Ctrl + 1).
 * 
 * <img width="600px" src="/img/tutorial/suite_buildpath.png" alt="New Suite Error"/>
 */
@Named("Getting Started")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class IntroducingJnarioSuitesGettingStartedSpec extends IntroducingJnarioSuitesSpec {
  @Extension
  @Inject
  public ModelStore _modelStore;
  
  /**
   * A suite consists of a title and a list of references to other specifications, where
   * a specification is either a feature definition, a spec or another suite. The suite
   * title is defined by '**#**' followed by the title. In our example suite
   * it is: `#My Suite`. Referenced specifications are listed after '**-**' by their name
   * in quotes.
   * 
   * <span class="label label-info">Info</span> In order to reference specifications defined in
   * different packages it is necessary to add corresponding import statements. The
   * best thing is to use the code-completion as it will automatically add the
   * required imports.
   * 
   * @lang(none)
   * @filter('''|\.parseSuite.nrOfParseAndLinkingErrors => 2)
   */
  @Test
  @Named("A simple Suite")
  @Order(1)
  public void _aSimpleSuite() throws Exception {
    Resource _parseSuite = this._modelStore.parseSuite("package demo\r\n\r\n#My Suite\r\n\r\n- \"My Feature\"\r\n- \"My Spec\"\r\n");
    int _nrOfParseAndLinkingErrors = Resources.nrOfParseAndLinkingErrors(_parseSuite);
    Assert.assertTrue("\nExpected \'\'\'\r\n\t\t\tpackage demo\r\n\t\t\t\r\n\t\t\t#My Suite\r\n\t\t\t\r\n\t\t\t- \"My Feature\"\r\n\t\t\t- \"My Spec\"\r\n\t\t\t\'\'\'.parseSuite.nrOfParseAndLinkingErrors => 2 but"
     + "\n     \'\'\'\r\n\t\t\tpackage demo\r\n\t\t\t\r\n\t\t\t#My Suite\r\n\t\t\t\r\n\t\t\t- \"My Feature\"\r\n\t\t\t- \"My Spec\"\r\n\t\t\t\'\'\'.parseSuite.nrOfParseAndLinkingErrors is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf(_nrOfParseAndLinkingErrors)).toString()
     + "\n     \'\'\'\r\n\t\t\tpackage demo\r\n\t\t\t\r\n\t\t\t#My Suite\r\n\t\t\t\r\n\t\t\t- \"My Feature\"\r\n\t\t\t- \"My Spec\"\r\n\t\t\t\'\'\'.parseSuite is " + new org.hamcrest.StringDescription().appendValue(_parseSuite).toString() + "\n", Should.<Integer>operator_doubleArrow(Integer.valueOf(_nrOfParseAndLinkingErrors), Integer.valueOf(2)));
    
  }
  
  /**
   * The editor will show two validation errors as the referenced specifications
   * cannot be resolved. Fix this by adding a new feature file "MyFeature.feature"
   * in the same package:
   * 
   * <pre class="prettyprint lang-feature">
   * package demo
   * Feature: My Feature
   * Scenario: My Scenario
   *   When something happens
   *   Then it happens
   * </pre>
   * 
   * and a new spec file "MySpec.spec":
   * 
   * <pre class="prettyprint lang-feature">
   * package demo
   * 
   * describe "My Spec"{
   *   fact "hello".length => 5
   * }
   * </pre>
   * 
   * When the validation errors are fixed we can execute the suite as a normal JUnit
   * test via right-click and **run-as->JUnit Test**.
   * 
   * <span class="label label-info">Tip</span> There is a quick fix (CMD/Ctrl + 1)
   *  available for unresolved specifications to create a new one.
   * 
   * @lang(none)
   * @filter(.*)
   */
  @Test
  @Named("Fixing the Errors")
  @Order(2)
  public void _fixingTheErrors() throws Exception {
    this.parseExampleScenarioAndSpec();
    Resource _parseSuite = this._modelStore.parseSuite("package demo\r\n\r\n#My Suite\r\n\r\n- \"My Feature\"\r\n- \"My Spec\"\r\n");
    Resources.hasNoParseAndLinkingErrors(_parseSuite);
  }
  
  public Resource parseExampleScenarioAndSpec() {
    Resource _xblockexpression = null;
    {
      this._modelStore.parseScenario("package demo\r\nFeature: My Feature\r\nScenario: My Scenario\r\n\tWhen something happens\r\n\tThen it happens\r\n");
      _xblockexpression = this._modelStore.parseSpec("package demo\r\n\r\ndescribe \"My Spec\"{\r\n\tfact \"hello\".length => 5\r\n}\r\n");
    }
    return _xblockexpression;
  }
  
  /**
   * Suites can be structured hierarchically by the number of '#' in front of the name:
   * 
   *     #Headline
   *     ##Section 1
   *     ###Subsection 1.1
   *     ###Subsection 1.2
   *     ##Section 2
   *     ###Subsection 2.1
   *     ###Subsection 2.2
   * 
   * Each subsection can separately list specifications. The specifications
   * will be executed in the same hierarchy:
   * 
   * <img width="400px" src="/img/tutorial/suite_execution.png" alt="Running a suite"/>
   * 
   * Each section can have additional text written in [Markdown Syntax]
   * (http://daringfireball.net/projects/markdown/syntax). This text will
   * be generated into the HTML reports. Referenced specs can also have a text
   * description after a colon. The
   * next example shows the previous suite separated by features and specs
   * with additional descriptions.
   * 
   * <span class="label label-info">Important</span> The characters '#' and '-' are
   * keywords in Jnario suites. They must be escaped like this '\\#' and '\\-' if
   * they are used in normal text (this will be fixed in the near future).
   * 
   * @filter(parseExampleScenarioAndSpec|'''|\.parseSuite.hasNoParseAndLinkingErrors)
   * @lang(none)
   */
  @Test
  @Named("Structuring a Suite")
  @Order(3)
  public void _structuringASuite() throws Exception {
    this.parseExampleScenarioAndSpec();
    Resource _parseSuite = this._modelStore.parseSuite("package demo\r\n\r\n#My Suite\r\n\r\nThis is the description of the suite. It is possible to use \r\n[Markdown Syntax](http://daringfireball.net/projects/markdown/syntax)\r\nfor **formatting** the text and adding images or links. \r\n\r\n##My Features\r\n\r\nHere we list all our features...\r\n\r\n- \"My Feature\": this is an example feature.\r\n\r\n##My Specs\r\n\r\n...and here are all our specs:\r\n\r\n- \"My Spec\": this is an example spec.\r\n   with a multiline description.\r\n");
    Resources.hasNoParseAndLinkingErrors(_parseSuite);
  }
  
  /**
   * When you want to run all specifications in your project you probably don't want
   * to list every single spec by hand. In Jnario suites you can define regular expressions
   * to select specific sets of specifications by matching the fully qualified name of a specification.
   * The generated HTML documentation will still list all matched specifications. A pattern is defined by
   * after a dash between two "\":
   * 
   *     - \.*\
   * 
   * <span class="label label-info">Tip</span> When hovering the cursor of a regex pattern,
   * the Eclipse editor will show all resolved specs.
   * 
   * @filter(parseExampleScenarioAndSpec|'''|\.parseSuite.hasNoParseAndLinkingErrors)
   * @lang(none)
   */
  @Test
  @Named("Selecting multiple Specifications")
  @Order(4)
  public void _selectingMultipleSpecifications() throws Exception {
    this.parseExampleScenarioAndSpec();
    Resource _parseSuite = this._modelStore.parseSuite("package demo\r\n\r\n#My Suite\r\n\r\n// this will select all specs in the project\r\n- \\.*\\ \r\n\r\n// this will select all specs that end with feature\r\n- \\.*Feature\\\r\n");
    Resources.hasNoParseAndLinkingErrors(_parseSuite);
  }
}
