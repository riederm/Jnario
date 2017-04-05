package org.jnario.jnario.tests.unit.jnario

describe "RichStrings"{
	context "as expression"{

		fact "richstring should be"{
			//dont assign to variable, use directly
			'''abc''' should be "abc"
		} 
		    
		fact "richstring with if"{
			'''a «IF true»b«ENDIF»''' should be "a b"
		}
	} 
	
	context "tab, newline, etc."{

		fact "tabs"{
			//Table does not format correctly yet
			'''	leading Tab''' should be "\tleading Tab"
			'''trailing Tab	''' should be "trailing Tab\t"
			'''inner	tab''' should be "inner\ttab"
		}
		
		fact "spaces"{
			//Table does not format correctly yet
			''' leading ws''' should be " leading ws"
			'''trailing ws ''' should be "trailing ws "
			'''inner ws''' should be "inner ws"
		}
		 
		fact "newlines"{
			'''
				line1
				line2''' should be "line1\nline2"
		}
		
		fact "empty newlines"{
			'''
				line1
				
				line2''' should be "line1\n\nline2"
		}
	}
	
	context "expressions in richstrings"{
		fact "a variable"{
			val x = "value"
			'''pre «x» post''' should be "pre value post"
		}
		
		fact "multiple variables"{
			val x = "value"
			val y = "value2"
			'''pre «x» «y» post''' should be "pre value value2 post"
		}
		
		fact "multiple variables in new lines"{
			val x = "value"
			val y = "value2"
			'''
				pre
				«x»
				«y»
				post''' should be "pre\nvalue\nvalue2\npost"
		}
		
		fact "expression"{
			'''1 + 2 = «1+2»''' should be "1 + 2 = 3"
		}
		
		fact "expression with variables"{
			val a = 1
			val b = 2
			'''«a» + «b» = «a + b»''' should be "1 + 2 = 3"
		}
	}
	
	context "indentation"{
		
		fact "no indentation"{
			'''
			a
			b''' should be "a\nb"
		}
		
		fact "with indentation"{
			'''
			a
				b''' should be "a\n\tb"
				
			'''
				a
			b''' should be "\ta\nb"
		}
	}
	    
	context "if condition"{    
		fact "if false"{ 
			val stringWithIf = '''pre«IF false» x «ENDIF»post'''
			org.junit.Assert.assertEquals("prepost", stringWithIf) 
		}
		
		fact "if true"{ 
			val stringWithIf = '''pre«IF true» x «ENDIF»post'''
			org.junit.Assert.assertEquals("pre x post", stringWithIf) 
		}  
		
		fact "if expression"{
			var stringWithIf = '''pre«IF 3 > 2» x «ENDIF»post'''
			org.junit.Assert.assertEquals("pre x post", stringWithIf) 
			
			stringWithIf = '''pre«IF 3 < 2» x «ENDIF»post'''
			org.junit.Assert.assertEquals("prepost", stringWithIf) 
		}
	}
	
	context "loop" {
		fact "for 1..3"{
			val x = ''' 
				«FOR x : (1..3)»
				line «x»
				«ENDFOR»
				'''	
			
			org.junit.Assert.assertEquals("line 1\nline 2\nline 3\n", x)
		}
		
		fact "for before after"{
			val text = ''' 
				«FOR x : (1..3) BEFORE 'pre ' SEPARATOR ',' AFTER ' post'»«x»«ENDFOR»'''	
			 
			org.junit.Assert.assertEquals("pre 1,2,3 post", text)
		}
	}
}