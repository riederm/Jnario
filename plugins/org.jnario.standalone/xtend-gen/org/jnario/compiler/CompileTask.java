package org.jnario.compiler;

import com.google.common.base.Objects;
import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.Task;
import org.apache.tools.ant.types.Path;
import org.apache.tools.ant.types.Reference;
import org.eclipse.xtend.lib.Property;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Pure;
import org.jnario.compiler.CompilerMain;

@SuppressWarnings("all")
public class CompileTask extends Task {
  /**
   * Set target for the generated Java source. Default is "xtend-gen".
   */
  @Property
  private String _outputPath = "xtend-gen";
  
  private Path classPath = null;
  
  /**
   * Set the temporary folder to use. Default is a temporary folder obtained via System::getProperty("java.io.tmpdir").
   */
  @Property
  private String _tempDirectory = System.getProperty("java.io.tmpdir");
  
  /**
   * The spec encoding. Default is UTF-8.
   */
  @Property
  private String _fileEncoding = "UTF-8";
  
  private Path sourcePath = null;
  
  @Override
  public void execute() throws BuildException {
    CompilerMain _compilerMain = new CompilerMain();
    final Procedure1<CompilerMain> _function = new Procedure1<CompilerMain>() {
      @Override
      public void apply(final CompilerMain it) {
        it.setOutputPath(CompileTask.this.getOutputPath());
        it.setClassPath(CompileTask.this.classPath.toString());
        it.setTempDirectory(CompileTask.this.getTempDirectory());
        it.setFileEncoding(CompileTask.this.getFileEncoding());
        it.setSourcePath(CompileTask.this.sourcePath.toString());
      }
    };
    final CompilerMain compiler = ObjectExtensions.<CompilerMain>operator_doubleArrow(_compilerMain, _function);
    int _compile = compiler.compile();
    boolean _equals = (_compile == CompilerMain.COMPILATION_ERROR);
    if (_equals) {
      throw new BuildException("Error when compiling Jnario specs");
    }
  }
  
  /**
   * Set the sourcepath to use by reference.
   * 
   * @param r a reference to an existing sourcepath.
   */
  public void setSourcepathRef(final Reference r) {
    this.createSourcepath().setRefid(r);
  }
  
  /**
   * Set the sourcepath to be used when compiling the Jnario specs.
   * 
   * @param s an Ant Path object containing the sourcepath.
   */
  public void setSourcepath(final Path s) {
    this.createSourcepath().append(s);
  }
  
  /**
   * Set the classpath to use by reference.
   * 
   * @param r a reference to an existing classpath.
   */
  public void setClasspathRef(final Reference r) {
    this.createClasspath().setRefid(r);
  }
  
  /**
   * Set the classpath to be used when compiling the Jnario specs.
   * 
   * @param s an Ant Path object containing the classpath.
   */
  public void setClasspath(final Path s) {
    this.createClasspath().append(s);
  }
  
  private Path createClasspath() {
    Path _xblockexpression = null;
    {
      boolean _equals = Objects.equal(this.classPath, null);
      if (_equals) {
        Project _project = this.getProject();
        Path _path = new Path(_project);
        this.classPath = _path;
      }
      _xblockexpression = this.classPath;
    }
    return _xblockexpression;
  }
  
  private Path createSourcepath() {
    Path _xblockexpression = null;
    {
      boolean _equals = Objects.equal(this.sourcePath, null);
      if (_equals) {
        Project _project = this.getProject();
        Path _path = new Path(_project);
        this.sourcePath = _path;
      }
      _xblockexpression = this.sourcePath;
    }
    return _xblockexpression;
  }
  
  @Pure
  public String getOutputPath() {
    return this._outputPath;
  }
  
  public void setOutputPath(final String outputPath) {
    this._outputPath = outputPath;
  }
  
  @Pure
  public String getTempDirectory() {
    return this._tempDirectory;
  }
  
  public void setTempDirectory(final String tempDirectory) {
    this._tempDirectory = tempDirectory;
  }
  
  @Pure
  public String getFileEncoding() {
    return this._fileEncoding;
  }
  
  public void setFileEncoding(final String fileEncoding) {
    this._fileEncoding = fileEncoding;
  }
}
