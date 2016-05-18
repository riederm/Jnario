package org.jnario.spec.tests.integration;

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
    boolean _doubleArrow = Should.<String>operator_doubleArrow("Test1", "Test1");
    Assert.assertTrue("\nExpected \'\'\'Test1\'\'\' => \"Test1\" but"
     + "\n     \'\'\'Test1\'\'\' => \"Test1\" is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_doubleArrow)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test2\\\'\\\'\\\' => \\\"Test2\\\"")
  @Order(2)
  public void _test2Test2() throws Exception {
    boolean _doubleArrow = Should.<String>operator_doubleArrow("Test2", "Test2");
    Assert.assertTrue("\nExpected \'\'\'\r\nTest2\'\'\' => \"Test2\" but"
     + "\n     \'\'\'\r\nTest2\'\'\' => \"Test2\" is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_doubleArrow)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test3\\\'\\\'\\\' => \\\"Test3\\\"")
  @Order(3)
  public void _test3Test3() throws Exception {
    boolean _doubleArrow = Should.<String>operator_doubleArrow("Test3", "Test3");
    Assert.assertTrue("\nExpected \'\'\'\r\n    Test3\'\'\' => \"Test3\" but"
     + "\n     \'\'\'\r\n    Test3\'\'\' => \"Test3\" is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_doubleArrow)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test4 Line2\\\'\\\'\\\'.convertNL => \\\" Test4\\\\nLine2\\\".convertNL")
  @Order(4)
  public void _test4Line2ConvertNLTest4NLine2ConvertNL() throws Exception {
    String _convertNL = this.convertNL(" Test4\r\nLine2");
    String _convertNL_1 = this.convertNL(" Test4\nLine2");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_convertNL, _convertNL_1);
    Assert.assertTrue("\nExpected \'\'\'\r\n    Test4\r\n   Line2\'\'\'.convertNL => \" Test4\\nLine2\".convertNL but"
     + "\n     \'\'\'\r\n    Test4\r\n   Line2\'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     \" Test4\\nLine2\".convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test5 Line2 Line3\\\'\\\'\\\'.convertNL => \\\"    Test5\\\\n   Line2\\\\nLine3\\\".convertNL")
  @Order(5)
  public void _test5Line2Line3ConvertNLTest5NLine2NLine3ConvertNL() throws Exception {
    String _convertNL = this.convertNL("    Test5\r\n   Line2\r\nLine3");
    String _convertNL_1 = this.convertNL("    Test5\n   Line2\nLine3");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_convertNL, _convertNL_1);
    Assert.assertTrue("\nExpected \'\'\'\r\n    Test5\r\n   Line2\r\nLine3\'\'\'.convertNL => \"    Test5\\n   Line2\\nLine3\".convertNL but"
     + "\n     \'\'\'\r\n    Test5\r\n   Line2\r\nLine3\'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     \"    Test5\\n   Line2\\nLine3\".convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\'Test   \\\'\\\'\\\' => \\\"Test   \\\"")
  @Order(6)
  public void _testTest() throws Exception {
    boolean _doubleArrow = Should.<String>operator_doubleArrow("Test   ", "Test   ");
    Assert.assertTrue("\nExpected \'\'\'Test   \'\'\' => \"Test   \" but"
     + "\n     \'\'\'Test   \'\'\' => \"Test   \" is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_doubleArrow)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test Test2   \\\'\\\'\\\'.convertNL => \\\"Test\\\\nTest2   \\\".convertNL")
  @Order(7)
  public void _testTest2ConvertNLTestNTest2ConvertNL() throws Exception {
    String _convertNL = this.convertNL("Test\r\nTest2   ");
    String _convertNL_1 = this.convertNL("Test\nTest2   ");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_convertNL, _convertNL_1);
    Assert.assertTrue("\nExpected \'\'\'\r\nTest\r\nTest2   \'\'\'.convertNL => \"Test\\nTest2   \".convertNL but"
     + "\n     \'\'\'\r\nTest\r\nTest2   \'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     \"Test\\nTest2   \".convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Line1 Line2\\\'\\\'\\\'.convertNL => \\\"Line1\\\\n\\\\nLine2\\\".convertNL")
  @Order(8)
  public void _line1Line2ConvertNLLine1NNLine2ConvertNL() throws Exception {
    String _convertNL = this.convertNL("Line1\r\n\r\nLine2");
    String _convertNL_1 = this.convertNL("Line1\n\nLine2");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_convertNL, _convertNL_1);
    Assert.assertTrue("\nExpected \'\'\'\r\nLine1\r\n\r\nLine2\'\'\'.convertNL => \"Line1\\n\\nLine2\".convertNL but"
     + "\n     \'\'\'\r\nLine1\r\n\r\nLine2\'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     \"Line1\\n\\nLine2\".convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\'Line3 Line4\\\'\\\'\\\'.convertNL => \\\"Line3\\\\n\\\\nLine4\\\".convertNL")
  @Order(9)
  public void _line3Line4ConvertNLLine3NNLine4ConvertNL() throws Exception {
    String _convertNL = this.convertNL("Line3\r\n\r\nLine4");
    String _convertNL_1 = this.convertNL("Line3\n\nLine4");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_convertNL, _convertNL_1);
    Assert.assertTrue("\nExpected \'\'\'Line3\r\n\r\nLine4\'\'\'.convertNL => \"Line3\\n\\nLine4\".convertNL but"
     + "\n     \'\'\'Line3\r\n\r\nLine4\'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     \"Line3\\n\\nLine4\".convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\"Test\\\\n   \\\\n\\\".convertNL => \\\'\\\'\\\' Test \\\'\\\'\\\'.convertNL")
  @Order(10)
  public void _testNNConvertNLTestConvertNL() throws Exception {
    String _convertNL = this.convertNL("Test\n   \n");
    String _convertNL_1 = this.convertNL("Test\r\n   \r\n");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_convertNL, _convertNL_1);
    Assert.assertTrue("\nExpected \"Test\\n   \\n\".convertNL => \'\'\'\r\nTest\r\n   \r\n\'\'\'.convertNL but"
     + "\n     \"Test\\n   \\n\".convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     \'\'\'\r\nTest\r\n   \r\n\'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\'Test \\\'\\\'\\\'.convertNL => \\\"Test\\\\n\\\".convertNL")
  @Order(11)
  public void _testConvertNLTestNConvertNL() throws Exception {
    String _convertNL = this.convertNL("Test\r\n");
    String _convertNL_1 = this.convertNL("Test\n");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_convertNL, _convertNL_1);
    Assert.assertTrue("\nExpected \'\'\'Test\r\n    \'\'\'.convertNL => \"Test\\n\".convertNL but"
     + "\n     \'\'\'Test\r\n    \'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     \"Test\\n\".convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test6 \\\'\\\'\\\'.convertNL => \\\"Test6\\\\n\\\".convertNL")
  @Order(12)
  public void _test6ConvertNLTest6NConvertNL() throws Exception {
    String _convertNL = this.convertNL("Test6\r\n");
    String _convertNL_1 = this.convertNL("Test6\n");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_convertNL, _convertNL_1);
    Assert.assertTrue("\nExpected \'\'\'\r\nTest6\r\n    \'\'\'.convertNL => \"Test6\\n\".convertNL but"
     + "\n     \'\'\'\r\nTest6\r\n    \'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     \"Test6\\n\".convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\"Test111\\\\n\\\".convertNL => \\\'\\\'\\\'Test111 \\\'\\\'\\\'.convertNL")
  @Order(13)
  public void _test111NConvertNLTest111ConvertNL() throws Exception {
    String _convertNL = this.convertNL("Test111\n");
    String _convertNL_1 = this.convertNL("Test111\r\n");
    boolean _doubleArrow = Should.<String>operator_doubleArrow(_convertNL, _convertNL_1);
    Assert.assertTrue("\nExpected \"Test111\\n\".convertNL => \'\'\'Test111\r\n        \'\'\'.convertNL but"
     + "\n     \"Test111\\n\".convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL).toString()
     + "\n     \'\'\'Test111\r\n        \'\'\'.convertNL is " + new org.hamcrest.StringDescription().appendValue(_convertNL_1).toString() + "\n", _doubleArrow);
    
  }
  
  public String convertNL(@Extension final String s) {
    return s.replace("\r", "");
  }
}
