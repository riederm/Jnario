/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.spec.tests.unit.naming;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.ExampleTable;
import org.jnario.jnario.test.util.Query;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("toFieldName[ExampleTable]")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleNameProviderToFieldNameExampleTableSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should use the example name")
  @Order(1)
  public void _shouldUseTheExampleName() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \'My Context\'{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("def myExample{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    Query _parse = this.parse(_builder.toString());
    final ExampleTable exampleTable = _parse.<ExampleTable>first(ExampleTable.class);
    String _fieldName = this.subject.toFieldName(exampleTable);
    Assert.assertTrue("\nExpected subject.toFieldName(exampleTable) => \"myExample\" but"
     + "\n     subject.toFieldName(exampleTable) is " + new org.hamcrest.StringDescription().appendValue(_fieldName).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
     + "\n     exampleTable is " + new org.hamcrest.StringDescription().appendValue(exampleTable).toString() + "\n", Should.<String>operator_doubleArrow(_fieldName, "myExample"));
    
  }
  
  @Test
  @Named("should use \\\'examples\\\' if no name is given")
  @Order(2)
  public void _shouldUseExamplesIfNoNameIsGiven() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \'My Context\'{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("def{");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    Query _parse = this.parse(_builder.toString());
    final ExampleTable exampleTable = _parse.<ExampleTable>first(ExampleTable.class);
    String _fieldName = this.subject.toFieldName(exampleTable);
    Assert.assertTrue("\nExpected subject.toFieldName(exampleTable) => \"examples\" but"
     + "\n     subject.toFieldName(exampleTable) is " + new org.hamcrest.StringDescription().appendValue(_fieldName).toString()
     + "\n     subject is " + new org.hamcrest.StringDescription().appendValue(this.subject).toString()
     + "\n     exampleTable is " + new org.hamcrest.StringDescription().appendValue(exampleTable).toString() + "\n", Should.<String>operator_doubleArrow(_fieldName, "examples"));
    
  }
}
