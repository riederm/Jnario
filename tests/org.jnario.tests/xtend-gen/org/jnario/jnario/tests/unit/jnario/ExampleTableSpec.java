/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.jnario.tests.unit.jnario;

import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.ExampleTable;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.jnario.test.util.Query;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.lib.Assert;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(SpecTestCreator.class)
@Named("ExampleTable")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleTableSpec {
  @Extension
  @Inject
  ModelStore _modelStore;
  
  @Test
  @Named("is valid if all rows have the same number of columns")
  @Order(1)
  public void _isValidIfAllRowsHaveTheSameNumberOfColumns() throws Exception {
    this._modelStore.parseSpec("\r\n\t\t\tpackage bootstrap\r\n\t\t\tdescribe \"ExampleTable\"{\r\n\t\t\t\tdef{\r\n\t\t\t\t\t| a | b |\r\n\t\t\t\t\t| 1 | 2 |\r\n\t\t\t\t\t| 1 | 3 |\r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t");
    Query _query = this._modelStore.query();
    ExampleTable _first = _query.<ExampleTable>first(ExampleTable.class);
    boolean _isValid = _first.isValid();
    Assert.assertTrue("\nExpected query.first(typeof(ExampleTable)).isValid() but"
     + "\n     query.first(typeof(ExampleTable)) is " + new org.hamcrest.StringDescription().appendValue(_first).toString()
     + "\n     query is " + new org.hamcrest.StringDescription().appendValue(_query).toString() + "\n", _isValid);
    
  }
  
  @Test
  @Named("is invalid if one row has a different number of columns")
  @Order(2)
  public void _isInvalidIfOneRowHasADifferentNumberOfColumns() throws Exception {
    this._modelStore.parseSpec("\r\n\t\t\tpackage bootstrap\r\n\t\t\tdescribe \"ExampleTable\"{\r\n\t\t\t\tdef{\r\n\t\t\t\t\t| a | b |\r\n\t\t\t\t\t| 1 | 2 |\r\n\t\t\t\t\t| 1 | \r\n\t\t\t\t}\r\n\t\t\t}\r\n\t\t");
    Query _query = this._modelStore.query();
    ExampleTable _first = _query.<ExampleTable>first(ExampleTable.class);
    boolean _isValid = _first.isValid();
    boolean _not = (!_isValid);
    Assert.assertTrue("\nExpected !query.first(typeof(ExampleTable)).isValid() but"
     + "\n     query.first(typeof(ExampleTable)).isValid() is " + new org.hamcrest.StringDescription().appendValue(_isValid).toString()
     + "\n     query.first(typeof(ExampleTable)) is " + new org.hamcrest.StringDescription().appendValue(_first).toString()
     + "\n     query is " + new org.hamcrest.StringDescription().appendValue(_query).toString() + "\n", _not);
    
  }
}
