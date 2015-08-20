package linking;

import java.util.Arrays;
import linking.ExampleNestedExampleSpec;
import linking.ExampleSpecATable;
import org.jnario.lib.Assert;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.Should;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@Contains(ExampleNestedExampleSpec.class)
@Named("Example")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class ExampleSpec {
  public ExampleTable<ExampleSpecATable> _initExampleSpecATable() {
    return ExampleTable.create("aTable", 
      Arrays.asList("x", "y"), 
      new ExampleSpecATable(  Arrays.asList("0", "0"), _initExampleSpecATableCell0(), _initExampleSpecATableCell1())
    );
  }
  
  protected ExampleTable<ExampleSpecATable> aTable = _initExampleSpecATable();
  
  public int _initExampleSpecATableCell0() {
    return 0;
  }
  
  public int _initExampleSpecATableCell1() {
    return 0;
  }
  
  @Test
  @Named("should pass")
  @Order(1)
  public void _shouldPass() throws Exception {
    Assert.assertTrue("\nExpected 1 + 1 => 2 but"
     + "\n     1 + 1 is " + new org.hamcrest.StringDescription().appendValue(Integer.valueOf((1 + 1))).toString() + "\n", Should.<Integer>operator_doubleArrow(
      Integer.valueOf((1 + 1)), Integer.valueOf(2)));
    
  }
}
