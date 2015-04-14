/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.conversion;

import org.eclipse.xtext.conversion.IValueConverter;
import org.eclipse.xtext.conversion.ValueConverterException;
import org.eclipse.xtext.conversion.impl.STRINGValueConverter;
import org.eclipse.xtext.nodemodel.INode;

public class RichStringValueConverter extends STRINGValueConverter implements IValueConverter<String> {

	public String toValue(String string, INode node)
			throws ValueConverterException {
		if (string.startsWith("'''")) {
			int i = 0;
			while (i < 3 && string.charAt(string.length() - 1 - i) == '\'') {
				i++;
			}
			return string.substring(3, string.length() - i);
		}
		return super.toValue(string, node);
	}

	public String toString(String value) throws ValueConverterException {
		return super.toString(value);
	}

}
