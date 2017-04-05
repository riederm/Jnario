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

@Named("indentation")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class RichStringsIndentationSpec extends RichStringsSpec {
  @Test
  @Named("no indentation")
  @Order(1)
  public void _noIndentation() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("a");
    _builder.newLine();
    _builder.append("b");
    Assert.assertTrue("\nExpected \'\'\'\n\t\t\ta\n\t\t\tb\'\'\' should be \"a\\nb\" but"
     + "\n     \'\'\'\n\t\t\ta\n\t\t\tb\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString() + "\n", Should.<String>should_be(_builder.toString(), "a\nb"));
    
  }
  
  @Test
  @Named("with indentation")
  @Order(2)
  public void _withIndentation() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("a");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("b");
    boolean _should_be = Should.<String>should_be(_builder.toString(), "a\n\tb");
    Assert.assertTrue("\nExpected \'\'\'\n\t\t\ta\n\t\t\t\tb\'\'\' should be \"a\\n\\tb\" but"
     + "\n     \'\'\'\n\t\t\ta\n\t\t\t\tb\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString() + "\n", _should_be);
    
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("\t");
    _builder_1.append("a");
    _builder_1.newLine();
    _builder_1.append("b");
    Assert.assertTrue("\nExpected \'\'\'\n\t\t\t\ta\n\t\t\tb\'\'\' should be \"\\ta\\nb\" but"
     + "\n     \'\'\'\n\t\t\t\ta\n\t\t\tb\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder_1.toString()).toString() + "\n", Should.<String>should_be(_builder_1.toString(), "\ta\nb"));
    
  }
}
