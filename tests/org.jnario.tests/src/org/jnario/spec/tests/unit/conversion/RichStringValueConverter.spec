package org.jnario.spec.tests.unit.conversion

import org.jnario.conversion.RichStringValueConverter

import static extension org.junit.Assert.*

describe "RichStringValueConverter unit test" {
	fact "toValueRemovesRichStringSignes" {
		assertConverted(
			"'''Test'''",
			"Test"
		)
	}
	
	fact "toValueRemovesLineWithOnlyLineBreak" {
		assertConverted(
			"'''\n" + 
			"Test'''",
			"Test"
		)
		assertConverted(
			"'''\r\n" +
			"Test'''",
			"Test"
		)
	}

	fact "toValueRemovesIntendationToFirstCharacter" {
		assertConverted(
			"'''\n" + 
			"    Test'''",
			"Test"
		)
		assertConverted(
			"'''\r\n" + 
			"    Test'''",
			"Test"
		)
	}

	fact "toValueCountsTabsAsOneSpaceWhenMixed" {
		assertConverted(
			"'''\n" +
			"\tTest\n" +
			"  Test2'''",
			"Test\n" + 
			" Test2"
		)
		assertConverted(
			"'''\r\n" +
			"\tTest\r\n" +
			"  Test2'''",
			"Test\r\n" + 
			" Test2"
		)
	}
	
	fact "toValueRemovesIntendationToFirstCharacterMultiline" {
		assertConverted(
			"'''\n" +
			"  Test\n" +
			"   Test2'''",
			"Test\n" + 
			" Test2"
		)
		assertConverted(
			"'''\r\n" +
			"  Test\r\n" +
			"   Test2'''",
			"Test\r\n" + 
			" Test2"
		)
	}

	fact "toValueRemovesIntendationToFirstCharacterMultiline2" {
		assertConverted(
			"'''\n" +
			"    Test\n" +
			"   Test2\n" +
			" Test3'''",
			"   Test\n" +
			"  Test2\n" +
			"Test3"
		)
		assertConverted(
			"'''\r\n" +
			"    Test\r\n" +
			"   Test2\r\n" +
			" Test3'''",
			"   Test\r\n" +
			"  Test2\r\n" +
			"Test3"
		)
	}

	fact "toValueKeepsWhitespacesAfterLastCharacterWhenItKeepsIntendation" {
		assertConverted(
			"'''Test   '''",
			"Test   "
		)
	}

	fact "toValueIgnoresWhitespacesAfterLastCharacter" {
		assertConverted(
			"'''\n" +
			"Test\n" +
			"Test2   '''",
			"Test\n" + 
			"Test2   "
		)
		assertConverted(
			"'''\r\n" +
			"Test\r\n" +
			"Test2   '''",
			"Test\r\n" + 
			"Test2   "
		)
	}

	fact "toValueIgnoresEmptyLinesBetweenCharacters" {
		assertConverted(
			"'''\n" + 
			"Line1\n" +
			"\n" +
			"Line2'''",
			"Line1\n" +
			"\n" + 
			"Line2"
		)
		assertConverted(
			"'''\r\n" + 
			"Line1\r\n" +
			"\r\n" +
			"Line2'''",
			"Line1\r\n" +
			"\r\n" + 
			"Line2"
		)
	}

	fact "toValueKeepsEmptyLinesBetweenCharactersWhenItKeepsIntendation" {
		assertConverted(
			"'''Line1\n" + 
			"\n" + 
			"Line2'''",
			"Line1\n" +
			"\n" + 
			"Line2"
		)
		assertConverted(
			"'''Line1\r\n" + 
			"\r\n" + 
			"Line2'''",
			"Line1\r\n" +
			"\r\n" + 
			"Line2"
		)
	}

	fact "toValueKeepsLinesWithOnlyWhitespaces" {
		assertConverted(
			"'''\n" +
			"Test\n"+
			"   \n'''",
			"Test\n" +
			"   \n"
		)
		assertConverted(
			"'''\r\n" +
			"Test\r\n"+
			"   \r\n'''",
			"Test\r\n" +
			"   \r\n"
		)
	}
	
	fact "void toValueIgnoresEmptyLinesAtTheEndWhenItKeepsIntendation" {
		assertConverted(
			"'''Test\n" +
			"   '''",
			"Test\n"
		)
		assertConverted(
			"'''Test\r\n" +
			"   '''",
			"Test\r\n"
		)
	}
	
	fact "toValueIgnoresEmptyLinesAtTheEnd" {
		assertConverted(
			"'''\n" +
			"Test\n" +
			"   '''",
			"Test\n"
		)
	}

	fact "mixNewLineStyles" {
		assertConverted(
			"'''\r" +
			"   Line1\n" +
			"    Line2\r\n" + 
			" Line3\r" +
			"'''",
			"  Line1\n" +
			"   Line2\r\n" +
			"Line3\r"
		)
	}
	
	def assertConverted(String stringToConvert, String expected) {
		val actual = new RichStringValueConverter().toValue(stringToConvert, null)
		expected.assertEquals(actual)		
	}
}