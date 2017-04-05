package org.jnario.jnario.tests.unit.jnario;

import org.jnario.jnario.tests.unit.jnario.RichStringsAsExpressionSpec;
import org.jnario.jnario.tests.unit.jnario.RichStringsExpressionsInRichstringsSpec;
import org.jnario.jnario.tests.unit.jnario.RichStringsIfConditionSpec;
import org.jnario.jnario.tests.unit.jnario.RichStringsIndentationSpec;
import org.jnario.jnario.tests.unit.jnario.RichStringsLoopSpec;
import org.jnario.jnario.tests.unit.jnario.RichStringsTabNewlineEtcSpec;
import org.jnario.runner.Contains;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.junit.runner.RunWith;

@Contains({ RichStringsAsExpressionSpec.class, RichStringsTabNewlineEtcSpec.class, RichStringsExpressionsInRichstringsSpec.class, RichStringsIndentationSpec.class, RichStringsIfConditionSpec.class, RichStringsLoopSpec.class })
@Named("RichStrings")
@RunWith(ExampleGroupRunner.class)
@SuppressWarnings("all")
public class RichStringsSpec {
}
