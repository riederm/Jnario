/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.scoping

import com.google.common.collect.ImmutableMap
import org.eclipse.emf.ecore.EObject
import org.jnario.scoping.JnarioResourceDescriptionStrategy
import org.jnario.spec.spec.ExampleGroup

import static java.lang.String.*
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.common.types.JvmVoid

class SpecResourceDescriptionStrategy extends JnarioResourceDescriptionStrategy {
	
	public static val ROOT_SPEC = "root"
	public static val TRUE = "1"
	public static val FALSE = "0"
	public static val EXAMPLE_TYPE = "type"
	
	override createUserData(EObject eObject, ImmutableMap.Builder<String, String> userData) {
		super.createUserData(eObject, userData);
		if (eObject instanceof ExampleGroup){
			val exampleGroup = eObject as ExampleGroup			
			userData.put(ROOT_SPEC, valueOf(exampleGroup.isRoot))
			if (exampleGroup.targetType !== null) {	
				val targetType = exampleGroup.targetType
				if (!(targetType.type instanceof JvmVoid)) {
					userData.put(EXAMPLE_TYPE,exampleGroup.targetType.simpleName)					
				}
			}
		}
	}
	
	def isRoot(ExampleGroup exampleGroup){
		if(!(exampleGroup.eContainer instanceof ExampleGroup)){
			TRUE
		}else{
			FALSE
		}
	}
	
	static def getTypeName(IEObjectDescription specDescription) {
		specDescription.getUserData(EXAMPLE_TYPE)
	}
	
}