package org.jnario.jnario.tests.unit.jnario;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.IntegerRange;
import org.jnario.jnario.tests.unit.jnario.RichStringsSpec;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("loop")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class RichStringsLoopSpec extends RichStringsSpec {
  @Test
  @Named("for 1..3")
  @Order(1)
  public void _for13() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    {
      IntegerRange _upTo = new IntegerRange(1, 3);
      for(final Integer x : _upTo) {
        _builder.append("line ");
        _builder.append(x, "");
        _builder.newLineIfNotEmpty();
      }
    }
    final String x_1 = _builder.toString();
    Assert.assertEquals("line 1\nline 2\nline 3\n", x_1);
  }
  
  @Test
  @Named("for before after")
  @Order(2)
  public void _forBeforeAfter() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    {
      IntegerRange _upTo = new IntegerRange(1, 3);
      boolean _hasElements = false;
      for(final Integer x : _upTo) {
        if (!_hasElements) {
          _hasElements = true;
          _builder.append("pre ", "");
        } else {
          _builder.appendImmediate(",", "");
        }
        _builder.append(x, "");
      }
      if (_hasElements) {
        _builder.append(" post", "");
      }
    }
    final String text = _builder.toString();
    Assert.assertEquals("pre 1,2,3 post", text);
  }
}
