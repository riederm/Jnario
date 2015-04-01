/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.standalone.tests;

import com.google.inject.Inject;
import java.io.File;
import org.eclipse.xtext.junit4.InjectWith;
import org.eclipse.xtext.junit4.XtextRunner;
import org.eclipse.xtext.util.Files;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.jnario.jnario.test.util.ExtendedSpecInjectorProvider;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ExtendedSpecInjectorProvider.class)
@SuppressWarnings("all")
public class SpecBatchCompilerTest {
  @Inject
  private /* SpecBatchCompiler */Object batchCompiler;
  
  private static String OUTPUT_DIRECTORY = "./test-result";
  
  private static String XTEND_SRC_DIRECTORY = "./testdata";
  
  private static String TEMP_DIRECTORY = "./test-temp-dir";
  
  @Before
  public void onSetup() {
    throw new Error("Unresolved compilation problems:"
      + "\nsourcePath cannot be resolved"
      + "\noutputPath cannot be resolved"
      + "\ndeleteTempDirectory cannot be resolved"
      + "\nuseCurrentClassLoaderAsParent cannot be resolved");
  }
  
  @After
  public void onTearDown() {
    try {
      File _file = new File(SpecBatchCompilerTest.OUTPUT_DIRECTORY);
      Files.cleanFolder(_file, null, true, true);
      File _file_1 = new File(SpecBatchCompilerTest.TEMP_DIRECTORY);
      boolean _exists = _file_1.exists();
      if (_exists) {
        File _file_2 = new File(SpecBatchCompilerTest.TEMP_DIRECTORY);
        Files.cleanFolder(_file_2, null, true, true);
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testCompileTestData() {
    throw new Error("Unresolved compilation problems:"
      + "\ncompile cannot be resolved");
  }
}
