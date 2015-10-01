package org.jnario.spec.tests.integration;

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
  @Named("\\\'\\\'\\\' Test4 Line2\\\'\\\'\\\' => \\\" Test4\\\\nLine2\\\"")
  @Order(4)
  public void _test4Line2Test4NLine2() throws Exception {
    boolean _doubleArrow = Should.<String>operator_doubleArrow(" Test4\r\nLine2", " Test4\nLine2");
    Assert.assertTrue("\nExpected \'\'\'\r\n    Test4\r\n   Line2\'\'\' => \" Test4\\nLine2\" but"
     + "\n     \'\'\'\r\n    Test4\r\n   Line2\'\'\' => \" Test4\\nLine2\" is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_doubleArrow)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test5 Line2 Line3\\\'\\\'\\\' => \\\"    Test5\\\\n   Line2\\\\nLine3\\\"")
  @Order(5)
  public void _test5Line2Line3Test5NLine2NLine3() throws Exception {
    boolean _doubleArrow = Should.<String>operator_doubleArrow("    Test5\r\n   Line2\r\nLine3", "    Test5\n   Line2\nLine3");
    Assert.assertTrue("\nExpected \'\'\'\r\n    Test5\r\n   Line2\r\nLine3\'\'\' => \"    Test5\\n   Line2\\nLine3\" but"
     + "\n     \'\'\'\r\n    Test5\r\n   Line2\r\nLine3\'\'\' => \"    Test5\\n   Line2\\nLine3\" is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_doubleArrow)).toString() + "\n", _doubleArrow);
    
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
  @Named("\\\'\\\'\\\' Test Test2   \\\'\\\'\\\' => \\\"Test\\\\nTest2   \\\"")
  @Order(7)
  public void _testTest2TestNTest2() throws Exception {
    boolean _doubleArrow = Should.<String>operator_doubleArrow("Test\r\nTest2   ", "Test\nTest2   ");
    Assert.assertTrue("\nExpected \'\'\'\r\nTest\r\nTest2   \'\'\' => \"Test\\nTest2   \" but"
     + "\n     \'\'\'\r\nTest\r\nTest2   \'\'\' => \"Test\\nTest2   \" is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_doubleArrow)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Line1 Line2\\\'\\\'\\\' => \\\"Line1\\\\n\\\\nLine2\\\"")
  @Order(8)
  public void _line1Line2Line1NNLine2() throws Exception {
    boolean _doubleArrow = Should.<String>operator_doubleArrow("Line1\r\n\r\nLine2", "Line1\n\nLine2");
    Assert.assertTrue("\nExpected \'\'\'\r\nLine1\r\n\r\nLine2\'\'\' => \"Line1\\n\\nLine2\" but"
     + "\n     \'\'\'\r\nLine1\r\n\r\nLine2\'\'\' => \"Line1\\n\\nLine2\" is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_doubleArrow)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\'Line3 Line4\\\'\\\'\\\' => \\\"Line3\\\\n\\\\nLine4\\\"")
  @Order(9)
  public void _line3Line4Line3NNLine4() throws Exception {
    boolean _doubleArrow = Should.<String>operator_doubleArrow("Line3\r\n\r\nLine4", "Line3\n\nLine4");
    Assert.assertTrue("\nExpected \'\'\'Line3\r\n\r\nLine4\'\'\' => \"Line3\\n\\nLine4\" but"
     + "\n     \'\'\'Line3\r\n\r\nLine4\'\'\' => \"Line3\\n\\nLine4\" is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_doubleArrow)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\"Test\\\\n   \\\\n\\\".assertEquals[\\\'\\\'\\\' Test \\\'\\\'\\\']")
  @Order(10)
  public void _testNNAssertEqualsTest() throws Exception {
    org.junit.Assert.assertEquals("Test\n   \n", "Test\r\n   \r\n");
  }
  
  @Test
  @Named("\\\'\\\'\\\'Test \\\'\\\'\\\' => \\\"Test\\\\n\\\"")
  @Order(11)
  public void _testTestN() throws Exception {
    boolean _doubleArrow = Should.<String>operator_doubleArrow("Test\r\n", "Test\n");
    Assert.assertTrue("\nExpected \'\'\'Test\r\n   \'\'\' => \"Test\\n\" but"
     + "\n     \'\'\'Test\r\n   \'\'\' => \"Test\\n\" is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_doubleArrow)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\' Test6 \\\'\\\'\\\' => \\\"Test6\\\\n\\\"")
  @Order(12)
  public void _test6Test6N() throws Exception {
    boolean _doubleArrow = Should.<String>operator_doubleArrow("Test6\r\n", "Test6\n");
    Assert.assertTrue("\nExpected \'\'\'\r\nTest6\r\n   \'\'\' => \"Test6\\n\" but"
     + "\n     \'\'\'\r\nTest6\r\n   \'\'\' => \"Test6\\n\" is " + new org.hamcrest.StringDescription().appendValue(Boolean.valueOf(_doubleArrow)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("\\\'\\\'\\\'Test111 \\\'\\\'\\\'.assertEquals[\\\"Test111\\\\n\\\"]")
  @Order(13)
  public void _test111AssertEqualsTest111N() throws Exception {
    org.junit.Assert.assertEquals("Test111\r\n", "Test111\n");
  }
}
