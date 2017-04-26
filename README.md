[![Build Status](https://travis-ci.org/borisbrodski/Jnario.svg?branch=no_xtend_xtext2.9)](https://travis-ci.org/borisbrodski/Jnario)

## Overview

Jnario is a framework for writing executable specifications for Java. It provides all the goodness of Xtend while being specifically tailored to writing acceptance and unit tests. It is easy to integrate as Jnario specifications are compiled to plain Java Junit tests. Head over to [Jnario.org](http://www.jnario.org) for more information.

See the [release notes](release_notes.md) for the current version.

# Dependencies & Installation

* Jnario requires at least ~~[Eclipse 3.6]~~[Eclipse 4.6](http://eclipse.org/downloads/) with ~~[Xtext 2.6]~~[Xtext 2.11](http://www.xtext.org) ~~and [Xtend 2.6](http://www.eclipse.org/xtend/)~~. You can install both from this update site `http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/`.
* The latest snapshot verion of Jnario can be installed from the following update site `http://www.jnario.org/updates/snapshot/`.

## Examples

### Acceptance Specification

```cucumber
Feature: Addition

  In order to avoid silly mistakes
  As a math idiot
  I want to be told the sum of two numbers
  
  Scenario: Add two numbers
    Calculator calculator = new Calculator()
    Given I have entered "50" into the calculator
      calculator.enter(args.first)
    And I have entered "70" into the calculator
    When I press "add"
      calculator.press(args.first)
    Then the result should be "120" on the screen
      calculator.result => args.first
```

### Unit Specifications

```java
package example

import java.util.Stack
import java.util.EmptyStackException

describe Stack{
  context "empty stack"{
    fact subject.size should be 0
    fact subject.pop throws EmptyStackException
  }
  context "one element"{ 
    before subject.add("element")
    fact subject.size should be 1
    fact "pop decreases size"{
      subject.pop
      subject.size => 0 
    }
    fact "pop removes last element"{
      subject.pop => "element"
      subject.contains("element") => true
    } 
  } 
}
```

## Setting up a development environment
use eclipse oomph and the jnario.setup file in the repository root.

## Build

Build with Maven 3 and Tycho. Run the following command in the repository root:

``` 
mvn clean install
``` 
