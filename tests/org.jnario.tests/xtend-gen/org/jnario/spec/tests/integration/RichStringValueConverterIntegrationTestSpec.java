package org.jnario.spec.tests.integration;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.lib.Assert;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("RichStringValueConverter integration test")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class RichStringValueConverterIntegrationTestSpec {
  @Test
  @Named("\\\'\\\'\\\'Test1\\\'\\\'\\\' => \\\"Test1\\\"")
  @Order(1)
  public void _test1Test1() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Test1");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_builder.toString(), "Test1");
    Assert.assertTrue("\nExpected \'\'\'Test1\'\'\' => \"Test1\" but"
     + "\n     \'\'\'Test1\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test2\\\'\\\'\\\' => \\\"Test2\\\"")
  @Order(2)
  public void _test2Test2() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Test2");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_builder.toString(), "Test2");
    Assert.assertTrue("\nExpected \'\'\'\nTest2\'\'\' => \"Test2\" but"
     + "\n     \'\'\'\nTest2\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test3\\\'\\\'\\\' => \\\"Test3\\\"")
  @Order(3)
  public void _test3Test3() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Test3");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_builder.toString(), "Test3");
    Assert.assertTrue("\nExpected \'\'\'\n    Test3\'\'\' => \"Test3\" but"
     + "\n     \'\'\'\n    Test3\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test4 Line2\\\'\\\'\\\'.convertNL => \\\" Test4\\\\nLine2\\\".convertNL")
  @Order(4)
  public void _test4Line2ConvertNLTest4NLine2ConvertNL() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append(" ");
    _builder.append("Test4");
    _builder.newLine();
    _builder.append("Line2");
    String _convertNL = this.convertNL(_builder.toString());
    String _convertNL_1 = this.convertNL(" Test4\nLine2");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_convertNL, _convertNL_1);
    Assert.assertTrue("\nExpected \'\'\'\n    Test4\n   Line2\'\'\'.convertNL => \" Test4\\nLine2\".convertNL but"
     + "\n     \'\'\'\n    Test4\n   Line2\'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     \'\'\'\n    Test4\n   Line2\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     \" Test4\\nLine2\".convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test5 Line2 Line3\\\'\\\'\\\'.convertNL => \\\"    Test5\\\\n   Line2\\\\nLine3\\\".convertNL")
  @Order(5)
  public void _test5Line2Line3ConvertNLTest5NLine2NLine3ConvertNL() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("    ");
    _builder.append("Test5");
    _builder.newLine();
    _builder.append("   ");
    _builder.append("Line2");
    _builder.newLine();
    _builder.append("Line3");
    String _convertNL = this.convertNL(_builder.toString());
    String _convertNL_1 = this.convertNL("    Test5\n   Line2\nLine3");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_convertNL, _convertNL_1);
    Assert.assertTrue("\nExpected \'\'\'\n    Test5\n   Line2\nLine3\'\'\'.convertNL => \"    Test5\\n   Line2\\nLine3\".convertNL but"
     + "\n     \'\'\'\n    Test5\n   Line2\nLine3\'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     \'\'\'\n    Test5\n   Line2\nLine3\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     \"    Test5\\n   Line2\\nLine3\".convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\'Test   \\\'\\\'\\\' => \\\"Test   \\\"")
  @Order(6)
  public void _testTest() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Test   ");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_builder.toString(), "Test   ");
    Assert.assertTrue("\nExpected \'\'\'Test   \'\'\' => \"Test   \" but"
     + "\n     \'\'\'Test   \'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test Test2   \\\'\\\'\\\'.convertNL => \\\"Test\\\\nTest2   \\\".convertNL")
  @Order(7)
  public void _testTest2ConvertNLTestNTest2ConvertNL() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Test");
    _builder.newLine();
    _builder.append("Test2   ");
    String _convertNL = this.convertNL(_builder.toString());
    String _convertNL_1 = this.convertNL("Test\nTest2   ");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_convertNL, _convertNL_1);
    Assert.assertTrue("\nExpected \'\'\'\nTest\nTest2   \'\'\'.convertNL => \"Test\\nTest2   \".convertNL but"
     + "\n     \'\'\'\nTest\nTest2   \'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     \'\'\'\nTest\nTest2   \'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     \"Test\\nTest2   \".convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Line1 Line2\\\'\\\'\\\'.convertNL => \\\"Line1\\\\n\\\\nLine2\\\".convertNL")
  @Order(8)
  public void _line1Line2ConvertNLLine1NNLine2ConvertNL() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Line1");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Line2");
    String _convertNL = this.convertNL(_builder.toString());
    String _convertNL_1 = this.convertNL("Line1\n\nLine2");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_convertNL, _convertNL_1);
    Assert.assertTrue("\nExpected \'\'\'\nLine1\n\nLine2\'\'\'.convertNL => \"Line1\\n\\nLine2\".convertNL but"
     + "\n     \'\'\'\nLine1\n\nLine2\'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     \'\'\'\nLine1\n\nLine2\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     \"Line1\\n\\nLine2\".convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\'Line3 Line4\\\'\\\'\\\'.convertNL => \\\"Line3\\\\n\\\\nLine4\\\".convertNL")
  @Order(9)
  public void _line3Line4ConvertNLLine3NNLine4ConvertNL() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Line3");
    _builder.newLine();
    _builder.newLine();
    _builder.append("Line4");
    String _convertNL = this.convertNL(_builder.toString());
    String _convertNL_1 = this.convertNL("Line3\n\nLine4");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_convertNL, _convertNL_1);
    Assert.assertTrue("\nExpected \'\'\'Line3\n\nLine4\'\'\'.convertNL => \"Line3\\n\\nLine4\".convertNL but"
     + "\n     \'\'\'Line3\n\nLine4\'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     \'\'\'Line3\n\nLine4\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     \"Line3\\n\\nLine4\".convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\"Test\\\\n   \\\\n\\\".convertNL => \\\'\\\'\\\' Test \\\'\\\'\\\'.convertNL")
  @Order(10)
  public void _testNNConvertNLTestConvertNL() throws Exception {
    String _convertNL = this.convertNL("Test\n   \n");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Test");
    _builder.newLine();
    _builder.append("   ");
    _builder.newLine();
    String _convertNL_1 = this.convertNL(_builder.toString());
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_convertNL, _convertNL_1);
    Assert.assertTrue("\nExpected \"Test\\n   \\n\".convertNL => \'\'\'\nTest\n   \n\'\'\'.convertNL but"
     + "\n     \"Test\\n   \\n\".convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     \'\'\'\nTest\n   \n\'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString()
     + "\n     \'\'\'\nTest\n   \n\'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\'Test \\\'\\\'\\\'.convertNL => \\\"Test\\\\n\\\".convertNL")
  @Order(11)
  public void _testConvertNLTestNConvertNL() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Test");
    _builder.newLine();
    String _convertNL = this.convertNL(_builder.toString());
    String _convertNL_1 = this.convertNL("Test\n");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_convertNL, _convertNL_1);
    Assert.assertTrue("\nExpected \'\'\'Test\n    \'\'\'.convertNL => \"Test\\n\".convertNL but"
     + "\n     \'\'\'Test\n    \'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     \'\'\'Test\n    \'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     \"Test\\n\".convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test6 \\\'\\\'\\\'.convertNL => \\\"Test6\\\\n\\\".convertNL")
  @Order(12)
  public void _test6ConvertNLTest6NConvertNL() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Test6");
    _builder.newLine();
    String _convertNL = this.convertNL(_builder.toString());
    String _convertNL_1 = this.convertNL("Test6\n");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_convertNL, _convertNL_1);
    Assert.assertTrue("\nExpected \'\'\'\nTest6\n    \'\'\'.convertNL => \"Test6\\n\".convertNL but"
     + "\n     \'\'\'\nTest6\n    \'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     \'\'\'\nTest6\n    \'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString()
     + "\n     \"Test6\\n\".convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\"Test111\\\\n\\\".convertNL => \\\'\\\'\\\'Test111 \\\'\\\'\\\'.convertNL")
  @Order(13)
  public void _test111NConvertNLTest111ConvertNL() throws Exception {
    String _convertNL = this.convertNL("Test111\n");
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Test111");
    _builder.newLine();
    String _convertNL_1 = this.convertNL(_builder.toString());
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_convertNL, _convertNL_1);
    Assert.assertTrue("\nExpected \"Test111\\n\".convertNL => \'\'\'Test111\n        \'\'\'.convertNL but"
     + "\n     \"Test111\\n\".convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     \'\'\'Test111\n        \'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString()
     + "\n     \'\'\'Test111\n        \'\'\' is " + new org.hamcrest.StringDescription().appendValue(_builder.toString()).toString() + "\n", _doubleArrow);
    
  }
  
  public String convertNL(@Extension final String s) {
    return s.replace("\r", "");
  }
}
