package org.jnario.spec.tests.unit.compiler;

import com.google.inject.Inject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Extension;
import org.jnario.jnario.test.util.BehaviorExecutor;
import org.jnario.jnario.test.util.SpecTestCreator;
import org.jnario.runner.CreateWith;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@CreateWith(SpecTestCreator.class)
@Named("Compiler")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class CompilerSpec {
  @Extension
  @org.jnario.runner.Extension
  @Inject
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("long boolean expressions compile correctly")
  @Order(1)
  public void _longBooleanExpressionsCompileCorrectly() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something with an expression\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"a fact with an if\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val x = 4");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("if(x > 4 && x > 5){");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder.toString());
  }
  
  @Test
  @Named("assert with multiple bool expressions")
  @Order(2)
  public void _assertWithMultipleBoolExpressions() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something with an expression\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"a fact with an if\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val x = 6");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("assert x > 4 && x > 5");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder.toString());
  }
  
  @Test
  @Named("=> with multiple bool expressions")
  @Order(3)
  public void _withMultipleBoolExpressions() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something with an expression\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"a fact with =>\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val x = 6");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("(x > 4 && x > 5) => true");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder.toString());
  }
  
  @Test
  @Named("should with multiple bool expressions")
  @Order(4)
  public void _shouldWithMultipleBoolExpressions() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something with an expression\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"a fact with should\"{");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("val x = 6");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("x > 4 && x > 5 should be true");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder.toString());
  }
  
  @Test
  @Named("automatically converts lists to arrays")
  @Order(5)
  public void _automaticallyConvertsListsToArrays() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Something with an expression\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"any fact\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def String[] x(){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("list(\"some string\")");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder.toString());
  }
  
  @Test
  @Named("resolve fact method name clashes")
  @Order(6)
  public void _resolveFactMethodNameClashes() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Using Should\"{");
    _builder.newLine();
    _builder.append("  ");
    _builder.newLine();
    _builder.append(" \t  ");
    _builder.append("fact \"a***\"  ");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("fact \"a???\" ");
    _builder.newLine();
    _builder.append("   \t\t");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder.toString());
  }
  
  @Test
  @Named("supports should in closures")
  @Order(7)
  public void _supportsShouldInClosures() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("describe \"Should in closures\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"should-be in closure\" {");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("[|1 should be 1].apply;  ");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("[|var int i; 1 should be 1].apply;");
    _builder.newLine();
    _builder.append("        ");
    _builder.append("[|].apply ;");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder.toString());
  }
  
  @Test
  @Named("compiles rich strings")
  @Order(8)
  public void _compilesRichStrings() throws Exception {
    this._behaviorExecutor.executesSuccessfully("\r\n\t\tdescribe \'Richstrings\'{\r\n\t\t\tfact {\r\n\t\t        \'\'\'hello world\'\'\'.toString => \'hello world\'\r\n\t\t    }\r\n\t\t}\r\n\t\t");
  }
  
  @Test
  @Named("supports enums in tables")
  @Order(9)
  public void _supportsEnumsInTables() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("import static org.jnario.spec.tests.unit.compiler.MyEnum.*");
    _builder.newLine();
    _builder.newLine();
    _builder.append("describe \"Tests type inference of the table columns\"{");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("def myTable {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("| value  |");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("| VALUE1 |");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("| VALUE2 |");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("}\t\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("fact \"Table column type get inferred by the stand-alone compile correctly\" {");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("myTable.forEach [");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("value should not be null");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("]");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this._behaviorExecutor.executesSuccessfully(_builder.toString());
  }
}
