package org.jnario;

import com.google.common.collect.Iterables;
import com.google.inject.Injector;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.xbase.compiler.GeneratorConfig;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.jnario.jnario.test.util.ModelStore;
import org.jnario.spec.SpecStandaloneSetup;

@SuppressWarnings("all")
public class Main {
  public static void main(final String[] args) {
    final SpecStandaloneSetup setup = new SpecStandaloneSetup();
    final Injector injector = setup.createInjectorAndDoEMFRegistration();
    final ModelStore modelStore = injector.<ModelStore>getInstance(ModelStore.class);
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package test");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.newLine();
    _builder.append("\t\t\t\t\t");
    _builder.append("describe \"Example Tables\"{");
    _builder.newLine();
    _builder.append("\t\t\t\t    ");
    _builder.append("def examplesWithType{      ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("| \t\t\tlist \t\t\t|  ");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("| new ArrayList<String>()  \t|");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("| new LinkedList<String>() \t| ");
    _builder.newLine();
    _builder.append("  ");
    _builder.append("} \t");
    _builder.newLine();
    _builder.append("      ");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("}");
    _builder.newLine();
    final Resource resource = modelStore.parseSpec(_builder);
    final JvmModelGenerator generator = injector.<JvmModelGenerator>getInstance(JvmModelGenerator.class);
    EList<EObject> _contents = resource.getContents();
    Iterable<JvmGenericType> _filter = Iterables.<JvmGenericType>filter(_contents, JvmGenericType.class);
    final Consumer<JvmGenericType> _function = new Consumer<JvmGenericType>() {
      @Override
      public void accept(final JvmGenericType it) {
        GeneratorConfig _generatorConfig = new GeneratorConfig();
        CharSequence _generateType = generator.generateType(it, _generatorConfig);
        InputOutput.<CharSequence>println(_generateType);
      }
    };
    _filter.forEach(_function);
  }
}
