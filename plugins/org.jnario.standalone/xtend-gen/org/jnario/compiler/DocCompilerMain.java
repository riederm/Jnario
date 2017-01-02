/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.compiler;

import com.google.common.base.Objects;
import com.google.common.io.Closeables;
import com.google.inject.Injector;
import com.google.inject.Provider;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import org.apache.log4j.BasicConfigurator;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.lib.Property;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;
import org.jnario.compiler.CompilerMain;
import org.jnario.compiler.HtmlAssetsCompiler;
import org.jnario.compiler.JnarioDocCompiler;
import org.jnario.compiler.StandaloneResourceProvider;
import org.jnario.feature.FeatureStandaloneSetup;
import org.jnario.report.HashBasedSpec2ResultMapping;
import org.jnario.report.SpecResultParser;
import org.jnario.spec.SpecStandaloneSetup;
import org.jnario.suite.SuiteStandaloneSetup;

@SuppressWarnings("all")
public class DocCompilerMain {
  public static void main(final String[] args) {
    if ((Objects.equal(args, null) || (((List<String>)Conversions.doWrapArray(args)).size() == 0))) {
      DocCompilerMain.printUsage();
      return;
    }
    DocCompilerMain _docCompilerMain = new DocCompilerMain();
    final Procedure1<DocCompilerMain> _function = new Procedure1<DocCompilerMain>() {
      @Override
      public void apply(final DocCompilerMain it) {
        final Iterator<String> arguments = ((List<String>)Conversions.doWrapArray(args)).iterator();
        while (arguments.hasNext()) {
          {
            String _next = arguments.next();
            final String argument = _next.trim();
            boolean _matched = false;
            if ((Objects.equal(argument, "-cp") || Objects.equal(argument, "-classpath"))) {
              _matched=true;
              String _next_1 = arguments.next();
              it.setClassPath(_next_1);
            }
            if (!_matched) {
              if (Objects.equal(argument, "-d")) {
                _matched=true;
                String _next_2 = arguments.next();
                it.setOutputPath(_next_2);
              }
            }
            if (!_matched) {
              if (Objects.equal(argument, "-results")) {
                _matched=true;
                String _next_3 = arguments.next();
                it.setResultFolder(_next_3);
              }
            }
            if (!_matched) {
              if (Objects.equal(argument, "-encoding")) {
                _matched=true;
                String _next_4 = arguments.next();
                it.setFileEncoding(_next_4);
              }
            }
            if (!_matched) {
              it.setSourcePath(argument);
            }
          }
        }
      }
    };
    final DocCompilerMain main = ObjectExtensions.<DocCompilerMain>operator_doubleArrow(_docCompilerMain, _function);
    int _compile = main.compile();
    System.exit(_compile);
  }
  
  @Property
  private String _outputPath = "doc-gen";
  
  @Property
  private String _classPath = "";
  
  @Property
  private String _resultFolder = "";
  
  @Property
  private String _fileEncoding = "UTF-8";
  
  @Property
  private String _sourcePath = ".";
  
  public int compile() {
    int _xblockexpression = (int) 0;
    {
      BasicConfigurator.configure();
      ISetup _get = DocCompilerMain.SETUPS.get(0);
      final Injector anyInjector = _get.createInjectorAndDoEMFRegistration();
      final ResourceSet resourceSet = anyInjector.<ResourceSet>getInstance(ResourceSet.class);
      this.generateCssAndJsFiles(anyInjector);
      StandaloneResourceProvider _standaloneResourceProvider = new StandaloneResourceProvider(resourceSet);
      _xblockexpression = this.generateDocs(_standaloneResourceProvider);
    }
    return _xblockexpression;
  }
  
  private int generateDocs(final Provider<ResourceSet> resourceSet) {
    for (final ISetup setup : DocCompilerMain.SETUPS) {
      {
        final Injector injector = setup.createInjectorAndDoEMFRegistration();
        final JnarioDocCompiler jnarioCompiler = injector.<JnarioDocCompiler>getInstance(JnarioDocCompiler.class);
        String _outputPath = this.getOutputPath();
        jnarioCompiler.setOutputPath(_outputPath);
        String _classPath = this.getClassPath();
        jnarioCompiler.setClassPath(_classPath);
        String _fileEncoding = this.getFileEncoding();
        jnarioCompiler.setFileEncoding(_fileEncoding);
        String _sourcePath = this.getSourcePath();
        jnarioCompiler.setSourcePath(_sourcePath);
        ResourceSet _get = resourceSet.get();
        EList<Adapter> _eAdapters = _get.eAdapters();
        _eAdapters.clear();
        jnarioCompiler.setResourceSetProvider(resourceSet);
        HashBasedSpec2ResultMapping _createSpec2ResultMapping = this.createSpec2ResultMapping();
        jnarioCompiler.setExecutable2ResultMapping(_createSpec2ResultMapping);
        boolean _compile = jnarioCompiler.compile();
        boolean _not = (!_compile);
        if (_not) {
          return CompilerMain.COMPILATION_ERROR;
        }
      }
    }
    return CompilerMain.OK;
  }
  
  private static void printUsage() {
    InputOutput.<String>println("Usage: JnarioDocCompiler <options> <source directories>");
    InputOutput.<String>println("where possible options include:");
    InputOutput.<String>println("-d <directory>             Specify where to place generated documentation files");
    InputOutput.<String>println("-results <folder>          Specify folder containing JUnit XML test results");
    InputOutput.<String>println("-encoding <encoding>       Specify character encoding used by source files");
  }
  
  public HashBasedSpec2ResultMapping createSpec2ResultMapping() {
    ISetup _get = DocCompilerMain.SETUPS.get(2);
    Injector _createInjectorAndDoEMFRegistration = _get.createInjectorAndDoEMFRegistration();
    final HashBasedSpec2ResultMapping resultMapping = _createInjectorAndDoEMFRegistration.<HashBasedSpec2ResultMapping>getInstance(HashBasedSpec2ResultMapping.class);
    String _resultFolder = this.getResultFolder();
    final File reportFolder = new File(_resultFolder);
    boolean _exists = reportFolder.exists();
    if (_exists) {
      this.addExecutionResults(resultMapping, reportFolder);
    }
    return resultMapping;
  }
  
  public boolean generateCssAndJsFiles(final Injector injector) {
    boolean _xblockexpression = false;
    {
      final HtmlAssetsCompiler assetsCompiler = injector.<HtmlAssetsCompiler>getInstance(HtmlAssetsCompiler.class);
      String _outputPath = this.getOutputPath();
      assetsCompiler.setOutputPath(_outputPath);
      _xblockexpression = assetsCompiler.compile();
    }
    return _xblockexpression;
  }
  
  public void addExecutionResults(final HashBasedSpec2ResultMapping resultMapping, final File reportFolder) {
    try {
      final SpecResultParser specResultParser = new SpecResultParser();
      final FileFilter _function = new FileFilter() {
        @Override
        public boolean accept(final File it) {
          String _name = it.getName();
          return _name.endsWith("xml");
        }
      };
      File[] _listFiles = reportFolder.listFiles(_function);
      for (final File file : _listFiles) {
        {
          FileInputStream is = null;
          try {
            FileInputStream _fileInputStream = new FileInputStream(file);
            is = _fileInputStream;
            specResultParser.parse(is, resultMapping);
          } finally {
            Closeables.closeQuietly(is);
          }
        }
      }
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public final static List<ISetup> SETUPS = CollectionLiterals.<ISetup>newArrayList(new SpecStandaloneSetup(), new FeatureStandaloneSetup(), new SuiteStandaloneSetup());
  
  @Pure
  public String getOutputPath() {
    return this._outputPath;
  }
  
  public void setOutputPath(final String outputPath) {
    this._outputPath = outputPath;
  }
  
  @Pure
  public String getClassPath() {
    return this._classPath;
  }
  
  public void setClassPath(final String classPath) {
    this._classPath = classPath;
  }
  
  @Pure
  public String getResultFolder() {
    return this._resultFolder;
  }
  
  public void setResultFolder(final String resultFolder) {
    this._resultFolder = resultFolder;
  }
  
  @Pure
  public String getFileEncoding() {
    return this._fileEncoding;
  }
  
  public void setFileEncoding(final String fileEncoding) {
    this._fileEncoding = fileEncoding;
  }
  
  @Pure
  public String getSourcePath() {
    return this._sourcePath;
  }
  
  public void setSourcePath(final String sourcePath) {
    this._sourcePath = sourcePath;
  }
}
