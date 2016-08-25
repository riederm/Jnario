package org.jnario.scoping;

import java.util.List;

import org.eclipse.xtext.xbase.scoping.batch.ImplicitlyImportedFeatures;
import org.jnario.lib.Each;
import org.jnario.lib.JnarioCollectionLiterals;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.JnarioIteratorExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.lib.StringConversions;
import org.jnario.lib.Wait;

public class JnarioImplicitlyImportedFeatures extends ImplicitlyImportedFeatures {

	@Override
	protected List<Class<?>> getExtensionClasses() {
		List<Class<?>> result = super.getExtensionClasses();

		/*
		 * In Java 8 the Iterator interface defines default method forEach(), that gets bound prior to the extension method Each.forEach().
		 * The new default method signature is 
		 * 
         *      public interface Iterable<T> {
         *        default void forEach(Consumer<? super T> action);
         *      }
         *
         * Since Jnario gets compiled with Java 6, we can't override this method in ExampleTable (No Consumer class defined yet).
         * The solution is to override getBestCandidate() method of JnarioTypeComputer letting the Each.forEach method always win.
		 */
		result.add(Each.class);

//		result.remove(ObjectExtensions.class);
		result.add(Should.class);
//		result.add(ObjectExtensions.class);
		result.add(StringConversions.class);
		result.add(JnarioIterableExtensions.class);
		result.add(JnarioIteratorExtensions.class);
		result.add(StepArguments.class);
		return result;
	}
	
	@Override
	protected List<Class<?>> getStaticImportClasses() {
		List<Class<?>> result = super.getStaticImportClasses();


		result.add(Should.class);
		result.add(Wait.class);
		result.add(JnarioCollectionLiterals.class);
		return result;
	}
	
}
