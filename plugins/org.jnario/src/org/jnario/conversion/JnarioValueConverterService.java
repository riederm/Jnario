/*******************************************************************************
s * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverter;
import org.eclipse.xtext.xbase.conversion.XbaseValueConverterService;
import org.jnario.xbase.richstring.conversion.XbaseWithRichstringValueConverterService;

import com.google.inject.Inject;
import com.google.inject.Singleton;
@Singleton
public class JnarioValueConverterService extends XbaseWithRichstringValueConverterService {
	
	@Inject ShouldValueConverter shouldValueConverter;
	
	@ValueConverter(rule = "Should")
	public IValueConverter<String> getShouldValueConverter() {
		return shouldValueConverter;
	}
	

}
