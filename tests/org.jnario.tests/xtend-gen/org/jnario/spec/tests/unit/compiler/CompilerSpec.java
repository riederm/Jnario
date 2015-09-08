package org.jnario.spec.tests.unit.compiler;

import com.google.inject.Inject;
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
  @Inject
  public BehaviorExecutor _behaviorExecutor;
  
  @Test
  @Named("long boolean expressions compile correctly")
  @Order(1)
  public void _longBooleanExpressionsCompileCorrectly() throws Exception {
    this._behaviorExecutor.executesSuccessfully("describe \"Something with an expression\"{\r\n\tfact \"a fact with an if\"{\r\n\t\tval x = 4\r\n\t\tif(x > 4 && x > 5){\r\n\t\t\t\r\n\t\t}\r\n\t}\r\n}\r\n");
  }
  
  @Test
  @Named("assert with multiple bool expressions")
  @Order(2)
  public void _assertWithMultipleBoolExpressions() throws Exception {
    this._behaviorExecutor.executesSuccessfully("describe \"Something with an expression\"{\r\n\tfact \"a fact with an if\"{\r\n\t\tval x = 6\r\n\t\tassert x > 4 && x > 5\r\n\t}\r\n}\r\n");
  }
  
  @Test
  @Named("=> with multiple bool expressions")
  @Order(3)
  public void _withMultipleBoolExpressions() throws Exception {
    this._behaviorExecutor.executesSuccessfully("describe \"Something with an expression\"{\r\n\tfact \"a fact with =>\"{\r\n\t\tval x = 6\r\n\t\t(x > 4 && x > 5) => true\r\n\t}\r\n}\r\n");
  }
  
  @Test
  @Named("should with multiple bool expressions")
  @Order(4)
  public void _shouldWithMultipleBoolExpressions() throws Exception {
    this._behaviorExecutor.executesSuccessfully("describe \"Something with an expression\"{\r\n\tfact \"a fact with should\"{\r\n\t\tval x = 6\r\n\t\tx > 4 && x > 5 should be true\r\n\t}\r\n}\r\n");
  }
  
  @Test
  @Named("automatically converts lists to arrays")
  @Order(5)
  public void _automaticallyConvertsListsToArrays() throws Exception {
    this._behaviorExecutor.executesSuccessfully("describe \"Something with an expression\"{\r\n\tfact \"any fact\"{\r\n\t}\r\n\t\r\n\tdef String[] x(){\r\n\tlist(\"some string\")\r\n\t}\r\n}\r\n");
  }
  
  @Test
  @Named("resolve fact method name clashes")
  @Order(6)
  public void _resolveFactMethodNameClashes() throws Exception {
    this._behaviorExecutor.executesSuccessfully("describe \"Using Should\"{\r\n  \r\n \t  fact \"a***\"  \r\n      fact \"a???\" \r\n   \t\t\r\n}\r\n");
  }
  
  @Test
  @Named("supports should in closures")
  @Order(7)
  public void _supportsShouldInClosures() throws Exception {
    this._behaviorExecutor.executesSuccessfully("describe \"Should in closures\"{\r\n\tfact \"should-be in closure\" {\r\n        [|1 should be 1].apply;  \r\n        [|var int i; 1 should be 1].apply;\r\n        [|].apply ;\r\n    }\r\n}\r\n");
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
    this._behaviorExecutor.executesSuccessfully("import static org.jnario.spec.tests.unit.compiler.MyEnum.*\r\n\r\ndescribe \"Tests type inference of the table columns\"{\r\n\t\r\n\t\r\n\tdef myTable {\r\n\t\t| value  |\r\n\t\t| VALUE1 |\r\n\t\t| VALUE2 |\r\n    }\t\t\r\n\t\r\n\tfact \"Table column type get inferred by the stand-alone compile correctly\" {\r\n\t\tmyTable.forEach [\r\n\t\t\tvalue should not be null\r\n\t\t]\r\n\t}\r\n}\r\n");
  }
}
