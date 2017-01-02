/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.jnario.test.util;

import java.util.List;

import org.osgi.framework.Bundle;

/**
 * @author Birgit Engelmann
 */
@SuppressWarnings("restriction")
public class BundleClassPathProvider {
	
	private static final String BUNDLE_REFERENCE = "reference:file:";
	private static final String PLUGIN_CLASSES_FOLDER = "plugins";
	private static final String SYSTEM_BUNDLE = "System Bundle";
	

	
	public static List<String> getClassPath() {
		//TODO MARI not used !?
//		String installLocation = Platform.getInstallLocation().getURL()
//				.getPath();
//
//		Bundle[] bundles = (Bundle[]) Activator.getDefault()
//				.getBundle().getBundleContext().getBundles();
//		List<String> classpath = new ArrayList<String>();
//
//		for (Bundle bundle : bundles) {
//			String pathToBundle = getPathOfBundle(bundle);
//			try {
//				bundle.
//				for (String subFolders : bundle.getClassPath()) {
//					String fullLocation = pathToBundle + File.separator + subFolders;
//					String finalClassPath = getAbsoluteClassPath(fullLocation, installLocation);
//					if(finalClassPath.length() > 0){
//						if(finalClassPath.endsWith("//.")){
//							finalClassPath = finalClassPath.substring(0, finalClassPath.length()-3);
//						}else if(finalClassPath.endsWith("/.")){
//							finalClassPath = finalClassPath.substring(0, finalClassPath.length()-2);
//						}
//						classpath.add(finalClassPath.replace("/", File.separator));
//					}
//				}
//			} catch (BundleException e) {
//				e.printStackTrace();
//			}
//		}
//		System.out.println(classpath.toString().replace(",", "\n"));
//		return classpath;
		return null;
	}

	private static String getPathOfBundle(Bundle bundle) {
		String pathOfBundle = bundle.getLocation();
		int indexOf = pathOfBundle.indexOf(BUNDLE_REFERENCE);
		if (indexOf >= 0) {
			return pathOfBundle.substring(indexOf + BUNDLE_REFERENCE.length());
		}
		return pathOfBundle;
	}
	

	private static String getAbsoluteClassPath(String fullLocation, 
			String installLocation) {
		if (fullLocation.contains(SYSTEM_BUNDLE)) {
			return "";
		}
		if (fullLocation.contains("..")	|| fullLocation.startsWith(PLUGIN_CLASSES_FOLDER)) {
			return installLocation + fullLocation;
		}
		return fullLocation;
	}

}
