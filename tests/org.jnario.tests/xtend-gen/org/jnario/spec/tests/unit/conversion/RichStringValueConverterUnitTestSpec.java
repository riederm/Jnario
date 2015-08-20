package org.jnario.spec.tests.unit.conversion;

import org.jnario.conversion.RichStringValueConverter;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@Named("RichStringValueConverter unit test")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class RichStringValueConverterUnitTestSpec {
  @Test
  @Named("toValueRemovesRichStringSignes")
  @Order(1)
  public void _toValueRemovesRichStringSignes() throws Exception {
    this.assertConverted(
      "\'\'\'Test\'\'\'", 
      "Test");
  }
  
  @Test
  @Named("toValueRemovesLineWithOnlyLineBreak")
  @Order(2)
  public void _toValueRemovesLineWithOnlyLineBreak() throws Exception {
    this.assertConverted(
      ("\'\'\'\n" + 
        "Test\'\'\'"), 
      "Test");
    this.assertConverted(
      ("\'\'\'\r\n" + 
        "Test\'\'\'"), 
      "Test");
  }
  
  @Test
  @Named("toValueRemovesIntendationToFirstCharacter")
  @Order(3)
  public void _toValueRemovesIntendationToFirstCharacter() throws Exception {
    this.assertConverted(
      ("\'\'\'\n" + 
        "    Test\'\'\'"), 
      "Test");
    this.assertConverted(
      ("\'\'\'\r\n" + 
        "    Test\'\'\'"), 
      "Test");
  }
  
  @Test
  @Named("toValueCountsTabsAsOneSpaceWhenMixed")
  @Order(4)
  public void _toValueCountsTabsAsOneSpaceWhenMixed() throws Exception {
    this.assertConverted(
      (("\'\'\'\n" + 
        "\tTest\n") + 
        "  Test2\'\'\'"), 
      ("Test\n" + 
        " Test2"));
    this.assertConverted(
      (("\'\'\'\r\n" + 
        "\tTest\r\n") + 
        "  Test2\'\'\'"), 
      ("Test\r\n" + 
        " Test2"));
  }
  
  @Test
  @Named("toValueRemovesIntendationToFirstCharacterMultiline")
  @Order(5)
  public void _toValueRemovesIntendationToFirstCharacterMultiline() throws Exception {
    this.assertConverted(
      (("\'\'\'\n" + 
        "  Test\n") + 
        "   Test2\'\'\'"), 
      ("Test\n" + 
        " Test2"));
    this.assertConverted(
      (("\'\'\'\r\n" + 
        "  Test\r\n") + 
        "   Test2\'\'\'"), 
      ("Test\r\n" + 
        " Test2"));
  }
  
  @Test
  @Named("toValueRemovesIntendationToFirstCharacterMultiline2")
  @Order(6)
  public void _toValueRemovesIntendationToFirstCharacterMultiline2() throws Exception {
    this.assertConverted(
      ((("\'\'\'\n" + 
        "    Test\n") + 
        "   Test2\n") + 
        " Test3\'\'\'"), 
      (("   Test\n" + 
        "  Test2\n") + 
        "Test3"));
    this.assertConverted(
      ((("\'\'\'\r\n" + 
        "    Test\r\n") + 
        "   Test2\r\n") + 
        " Test3\'\'\'"), 
      (("   Test\r\n" + 
        "  Test2\r\n") + 
        "Test3"));
  }
  
  @Test
  @Named("toValueKeepsWhitespacesAfterLastCharacterWhenItKeepsIntendation")
  @Order(7)
  public void _toValueKeepsWhitespacesAfterLastCharacterWhenItKeepsIntendation() throws Exception {
    this.assertConverted(
      "\'\'\'Test   \'\'\'", 
      "Test   ");
  }
  
  @Test
  @Named("toValueIgnoresWhitespacesAfterLastCharacter")
  @Order(8)
  public void _toValueIgnoresWhitespacesAfterLastCharacter() throws Exception {
    this.assertConverted(
      (("\'\'\'\n" + 
        "Test\n") + 
        "Test2   \'\'\'"), 
      ("Test\n" + 
        "Test2   "));
    this.assertConverted(
      (("\'\'\'\r\n" + 
        "Test\r\n") + 
        "Test2   \'\'\'"), 
      ("Test\r\n" + 
        "Test2   "));
  }
  
  @Test
  @Named("toValueIgnoresEmptyLinesBetweenCharacters")
  @Order(9)
  public void _toValueIgnoresEmptyLinesBetweenCharacters() throws Exception {
    this.assertConverted(
      ((("\'\'\'\n" + 
        "Line1\n") + 
        "\n") + 
        "Line2\'\'\'"), 
      (("Line1\n" + 
        "\n") + 
        "Line2"));
    this.assertConverted(
      ((("\'\'\'\r\n" + 
        "Line1\r\n") + 
        "\r\n") + 
        "Line2\'\'\'"), 
      (("Line1\r\n" + 
        "\r\n") + 
        "Line2"));
  }
  
  @Test
  @Named("toValueKeepsEmptyLinesBetweenCharactersWhenItKeepsIntendation")
  @Order(10)
  public void _toValueKeepsEmptyLinesBetweenCharactersWhenItKeepsIntendation() throws Exception {
    this.assertConverted(
      (("\'\'\'Line1\n" + 
        "\n") + 
        "Line2\'\'\'"), 
      (("Line1\n" + 
        "\n") + 
        "Line2"));
    this.assertConverted(
      (("\'\'\'Line1\r\n" + 
        "\r\n") + 
        "Line2\'\'\'"), 
      (("Line1\r\n" + 
        "\r\n") + 
        "Line2"));
  }
  
  @Test
  @Named("toValueKeepsLinesWithOnlyWhitespaces")
  @Order(11)
  public void _toValueKeepsLinesWithOnlyWhitespaces() throws Exception {
    this.assertConverted(
      (("\'\'\'\n" + 
        "Test\n") + 
        "   \n\'\'\'"), 
      ("Test\n" + 
        "   \n"));
    this.assertConverted(
      (("\'\'\'\r\n" + 
        "Test\r\n") + 
        "   \r\n\'\'\'"), 
      ("Test\r\n" + 
        "   \r\n"));
  }
  
  @Test
  @Named("void toValueIgnoresEmptyLinesAtTheEndWhenItKeepsIntendation")
  @Order(12)
  public void _voidToValueIgnoresEmptyLinesAtTheEndWhenItKeepsIntendation() throws Exception {
    this.assertConverted(
      ("\'\'\'Test\n" + 
        "   \'\'\'"), 
      "Test\n");
    this.assertConverted(
      ("\'\'\'Test\r\n" + 
        "   \'\'\'"), 
      "Test\r\n");
  }
  
  @Test
  @Named("toValueIgnoresEmptyLinesAtTheEnd")
  @Order(13)
  public void _toValueIgnoresEmptyLinesAtTheEnd() throws Exception {
    this.assertConverted(
      (("\'\'\'\n" + 
        "Test\n") + 
        "   \'\'\'"), 
      "Test\n");
  }
  
  @Test
  @Named("mixNewLineStyles")
  @Order(14)
  public void _mixNewLineStyles() throws Exception {
    this.assertConverted(
      (((("\'\'\'\r" + 
        "   Line1\n") + 
        "    Line2\r\n") + 
        " Line3\r") + 
        "\'\'\'"), 
      (("  Line1\n" + 
        "   Line2\r\n") + 
        "Line3\r"));
  }
  
  public void assertConverted(final String stringToConvert, final String expected) {
    RichStringValueConverter _richStringValueConverter = new RichStringValueConverter();
    final String actual = _richStringValueConverter.toValue(stringToConvert, null);
    Assert.assertEquals(expected, actual);
  }
}
