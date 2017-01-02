/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.doc;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.jnario.report.ExecutableStateSwitch;
import org.jnario.report.Failed;
import org.jnario.report.NotRun;
import org.jnario.report.Passed;
import org.jnario.report.Pending;

@SuppressWarnings("all")
public class CssClassProvider extends ExecutableStateSwitch<String> {
  @Override
  protected String handleFailed(final Failed result) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("failed");
    return _builder.toString();
  }
  
  @Override
  protected String handleNotRun(final NotRun execution) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("notrun");
    return _builder.toString();
  }
  
  @Override
  protected String handlePassed(final Passed execution) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("passed");
    return _builder.toString();
  }
  
  @Override
  protected String handlePending(final Pending execution) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("pending");
    return _builder.toString();
  }
}
