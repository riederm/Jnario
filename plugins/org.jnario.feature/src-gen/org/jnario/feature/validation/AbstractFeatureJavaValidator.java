/*
 * generated by Xtext
 */
package org.jnario.feature.validation;
 
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EPackage;

public class AbstractFeatureJavaValidator extends org.jnario.xbase.richstring.validation.XbaseWithRichstringJavaValidator {

	@Override
	protected List<EPackage> getEPackages() {
	    List<EPackage> result = new ArrayList<EPackage>();
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.org/Jnario"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.org/jnario/feature/Feature"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/xtext/xbase/Xbase"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/xtext/common/JavaVMTypes"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/xbase/RichString"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/Xtext/Xbase/XAnnotations"));
	    result.add(EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/xtext/xbase/Xtype"));
		return result;
	}

}
