package org.jnario.jnario.tests.unit.jnario;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.tests.unit.jnario.RichStringsSpec;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("expressions in richstrings")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class RichStringsExpressionsInRichstringsSpec extends RichStringsSpec {
  @Test
  @Named("a variable")
  @Order(1)
  public void _aVariable() throws Exception {
    final String x = "value";
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pre ");
    _builder.append(x, "");
    _builder.append(" post");
    Assert.assertTrue("\nExpected \'\'\'pre \u00ABx\u00BB post\'\'\' should be \"pre value post\" but"
     + "\n     \'\'\'pre \u00ABx\u00BB post\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     x is " + new org.hamcrest.StringDescription().appendValue(x).toString() + "\n", Should.<String>should_be(_builder.toString(), "pre value post"));
    
  }
  
  @Test
  @Named("multiple variables")
  @Order(2)
  public void _multipleVariables() throws Exception {
    final String x = "value";
    final String y = "value2";
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pre ");
    _builder.append(x, "");
    _builder.append(" ");
    _builder.append(y, "");
    _builder.append(" post");
    Assert.assertTrue("\nExpected \'\'\'pre \u00ABx\u00BB \u00ABy\u00BB post\'\'\' should be \"pre value value2 post\" but"
     + "\n     \'\'\'pre \u00ABx\u00BB \u00ABy\u00BB post\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     x is " + new org.hamcrest.StringDescription().appendValue(x).toString()
     + "\n     y is " + new org.hamcrest.StringDescription().appendValue(y).toString() + "\n", Should.<String>should_be(_builder.toString(), "pre value value2 post"));
    
  }
  
  @Test
  @Named("multiple variables in new lines")
  @Order(3)
  public void _multipleVariablesInNewLines() throws Exception {
    final String x = "value";
    final String y = "value2";
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pre");
    _builder.newLine();
    _builder.append(x, "");
    _builder.newLineIfNotEmpty();
    _builder.append(y, "");
    _builder.newLineIfNotEmpty();
    _builder.append("post");
    Assert.assertTrue("\nExpected \'\'\'\n\t\t\t\tpre\n\t\t\t\t\u00ABx\u00BB\n\t\t\t\t\u00ABy\u00BB\n\t\t\t\tpost\'\'\' should be \"pre\\nvalue\\nvalue2\\npost\" but"
     + "\n     \'\'\'\n\t\t\t\tpre\n\t\t\t\t\u00ABx\u00BB\n\t\t\t\t\u00ABy\u00BB\n\t\t\t\tpost\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     x is " + new org.hamcrest.StringDescription().appendValue(x).toString()
     + "\n     y is " + new org.hamcrest.StringDescription().appendValue(y).toString() + "\n", Should.<String>should_be(_builder.toString(), "pre\nvalue\nvalue2\npost"));
    
  }
  
  @Test
  @Named("expression")
  @Order(4)
  public void _expression() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("1 + 2 = ");
    _builder.append((1 + 2), "");
    Assert.assertTrue("\nExpected \'\'\'1 + 2 = \u00AB1+2\u00BB\'\'\' should be \"1 + 2 = 3\" but"
     + "\n     \'\'\'1 + 2 = \u00AB1+2\u00BB\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     1+2 is " + new org.hamcrest.StringDescription().appendValue((1 + 2)).toString() + "\n", Should.<String>should_be(_builder.toString(), "1 + 2 = 3"));
    
  }
  
  @Test
  @Named("expression with variables")
  @Order(5)
  public void _expressionWithVariables() throws Exception {
    final int a = 1;
    final int b = 2;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(a, "");
    _builder.append(" + ");
    _builder.append(b, "");
    _builder.append(" = ");
    _builder.append((a + b), "");
    Assert.assertTrue("\nExpected \'\'\'\u00ABa\u00BB + \u00ABb\u00BB = \u00ABa + b\u00BB\'\'\' should be \"1 + 2 = 3\" but"
     + "\n     \'\'\'\u00ABa\u00BB + \u00ABb\u00BB = \u00ABa + b\u00BB\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     a is " + new org.hamcrest.StringDescription().appendValue(a).toString()
     + "\n     b is " + new org.hamcrest.StringDescription().appendValue(b).toString()
     + "\n     a + b is " + new org.hamcrest.StringDescription().appendValue((a + b)).toString() + "\n", Should.<String>should_be(_builder.toString(), "1 + 2 = 3"));
    
  }
}
