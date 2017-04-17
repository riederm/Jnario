package org.jnario.spec.tests.unit.compiler

describe "Qualfied References in should be"{
	
	fact "it should successfully generate asserts on QualifiedRefernces"{
		java.lang.System => java.lang.System
		java.lang.System should be java.lang.System
		
		java.lang.System should not be java.lang.String
	}
	
	fact "it should successfully generate asserts on members of QualifiedRefernces"{
		java.lang.System.classLoader => java.lang.System.classLoader
		java.lang.System.classLoader should be java.lang.System.classLoader
		
		java.lang.String.canonicalName should not be java.lang.Integer.canonicalName
	}
	
}