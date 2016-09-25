/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.doc;

import org.jnario.doc.Filter;

@SuppressWarnings("all")
public class LangFilter implements Filter {
  public static Filter create(final String regex) {
    return new LangFilter(regex);
  }
  
  private String language;
  
  public LangFilter(final String language) {
    this.language = language;
  }
  
  @Override
  public String apply(final String input) {
    return input.replace("<pre class=\"prettyprint lang-spec", ("<pre class=\"prettyprint lang-" + this.language));
  }
  
  @Override
  public String toString() {
    return ("lang-" + this.language);
  }
}
