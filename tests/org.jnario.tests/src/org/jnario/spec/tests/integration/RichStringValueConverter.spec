//package org.jnario.spec.tests.integration
//
//import static extension org.junit.Assert.*
//
//describe "RichStringValueConverter integration test" {
//	fact '''Test1''' => "Test1" 
//	
//	fact '''
//Test2''' => "Test2"
//
//	fact '''
//    Test3''' => "Test3"
//
//	fact '''
//    Test4
//   Line2'''.convertNL => " Test4\nLine2".convertNL
//
//	fact '''
//    Test5
//   Line2
//Line3'''.convertNL => "    Test5\n   Line2\nLine3".convertNL
//
//	fact '''Test   ''' => "Test   "
//
//	fact '''
//Test
//Test2   '''.convertNL => "Test\nTest2   ".convertNL
//
//	fact '''
//Line1
//
//Line2'''.convertNL => "Line1\n\nLine2".convertNL
//
//	fact '''Line3
//
//Line4'''.convertNL => "Line3\n\nLine4".convertNL
//
//	fact "Test\n   \n".convertNL => '''
//Test
//   
//'''.convertNL 
//
//	fact '''Test
//    '''.convertNL => "Test\n".convertNL
//	
//	fact '''
//Test6
//    '''.convertNL => "Test6\n".convertNL
//   
//    fact "Test111\n".convertNL => '''Test111
//        '''.convertNL
//   
//    def convertNL(String s) {
//		s.replace("\r", "");
//    }
//}