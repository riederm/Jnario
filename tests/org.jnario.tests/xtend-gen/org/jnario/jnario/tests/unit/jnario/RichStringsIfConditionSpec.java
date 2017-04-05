package org.jnario.jnario.tests.unit.jnario;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.jnario.tests.unit.jnario.RichStringsSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("if condition")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class RichStringsIfConditionSpec extends RichStringsSpec {
  @Test
  @Named("if false")
  @Order(1)
  public void _ifFalse() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pre");
    {
      if (false) {
        _builder.append(" x ");
      }
    }
    _builder.append("post");
    final String stringWithIf = _builder.toString();
    Assert.assertEquals("prepost", stringWithIf);
  }
  
  @Test
  @Named("if true")
  @Order(2)
  public void _ifTrue() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pre");
    {
      if (true) {
        _builder.append(" x ");
      }
    }
    _builder.append("post");
    final String stringWithIf = _builder.toString();
    Assert.assertEquals("pre x post", stringWithIf);
  }
  
  @Test
  @Named("if expression")
  @Order(3)
  public void _ifExpression() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pre");
    {
      if ((3 > 2)) {
        _builder.append(" x ");
      }
    }
    _builder.append("post");
    String stringWithIf = _builder.toString();
    Assert.assertEquals("pre x post", stringWithIf);
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("pre");
    {
      if ((3 < 2)) {
        _builder_1.append(" x ");
      }
    }
    _builder_1.append("post");
    stringWithIf = _builder_1.toString();
    Assert.assertEquals("prepost", stringWithIf);
  }
}
