package org.jnario.test.tools;

import java.util.function.Consumer;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.xtext.junit4.validation.AssertableDiagnostics;
import org.eclipse.xtext.xbase.lib.InputOutput;

@SuppressWarnings("all")
public class JnarioTestTools {
  public static void assertOKWithMessage(final AssertableDiagnostics it) {
    int _size = it.getDiagnostic().getChildren().size();
    boolean _notEquals = (_size != 0);
    if (_notEquals) {
      InputOutput.<String>println("Diagnostics:");
      final Consumer<Diagnostic> _function = new Consumer<Diagnostic>() {
        @Override
        public void accept(final Diagnostic it) {
          String _message = it.getMessage();
          String _plus = ("- " + _message);
          InputOutput.<String>println(_plus);
        }
      };
      it.getDiagnostic().getChildren().forEach(_function);
      it.fail("There are expected to be no diagnostics.");
    }
  }
}
