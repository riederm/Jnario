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

@Named("tab, newline, etc.")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class RichStringsTabNewlineEtcSpec extends RichStringsSpec {
  @Test
  @Named("tabs")
  @Order(1)
  public void _tabs() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\t");
    _builder.append("leading Tab");
    boolean _should_be = Should.<String>should_be(_builder.toString(), "\tleading Tab");
    Assert.assertTrue("\nExpected //Table does not format correctly yet\n\t\t\t\'\'\'\tleading Tab\'\'\' should be \"\\tleading Tab\" but"
     + "\n     //Table does not format correctly yet\n\t\t\t\'\'\'\tleading Tab\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString() + "\n", _should_be);
    
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("trailing Tab\t");
    boolean _should_be_1 = Should.<String>should_be(_builder_1.toString(), "trailing Tab\t");
    Assert.assertTrue("\nExpected \'\'\'trailing Tab\t\'\'\' should be \"trailing Tab\\t\" but"
     + "\n     \'\'\'trailing Tab\t\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder_1.toString()).toString() + "\n", _should_be_1);
    
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("inner\ttab");
    Assert.assertTrue("\nExpected \'\'\'inner\ttab\'\'\' should be \"inner\\ttab\" but"
     + "\n     \'\'\'inner\ttab\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder_2.toString()).toString() + "\n", Should.<String>should_be(_builder_2.toString(), "inner\ttab"));
    
  }
  
  @Test
  @Named("spaces")
  @Order(2)
  public void _spaces() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("leading ws");
    boolean _should_be = Should.<String>should_be(_builder.toString(), " leading ws");
    Assert.assertTrue("\nExpected //Table does not format correctly yet\n\t\t\t\'\'\' leading ws\'\'\' should be \" leading ws\" but"
     + "\n     //Table does not format correctly yet\n\t\t\t\'\'\' leading ws\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString() + "\n", _should_be);
    
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("trailing ws ");
    boolean _should_be_1 = Should.<String>should_be(_builder_1.toString(), "trailing ws ");
    Assert.assertTrue("\nExpected \'\'\'trailing ws \'\'\' should be \"trailing ws \" but"
     + "\n     \'\'\'trailing ws \'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder_1.toString()).toString() + "\n", _should_be_1);
    
    StringConcatenation _builder_2 = new StringConcatenation();
    _builder_2.append("inner ws");
    Assert.assertTrue("\nExpected \'\'\'inner ws\'\'\' should be \"inner ws\" but"
     + "\n     \'\'\'inner ws\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder_2.toString()).toString() + "\n", Should.<String>should_be(_builder_2.toString(), "inner ws"));
    
  }
  
  @Test
  @Named("newlines")
  @Order(3)
  public void _newlines() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("line1");
    _builder.newLine();
    _builder.append("line2");
    Assert.assertTrue("\nExpected \'\'\'\n\t\t\t\tline1\n\t\t\t\tline2\'\'\' should be \"line1\\nline2\" but"
     + "\n     \'\'\'\n\t\t\t\tline1\n\t\t\t\tline2\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString() + "\n", Should.<String>should_be(_builder.toString(), "line1\nline2"));
    
  }
  
  @Test
  @Named("empty newlines")
  @Order(4)
  public void _emptyNewlines() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("line1");
    _builder.newLine();
    _builder.newLine();
    _builder.append("line2");
    Assert.assertTrue("\nExpected \'\'\'\n\t\t\t\tline1\n\t\t\t\t\n\t\t\t\tline2\'\'\' should be \"line1\\n\\nline2\" but"
     + "\n     \'\'\'\n\t\t\t\tline1\n\t\t\t\t\n\t\t\t\tline2\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString() + "\n", Should.<String>should_be(_builder.toString(), "line1\n\nline2"));
    
  }
}
