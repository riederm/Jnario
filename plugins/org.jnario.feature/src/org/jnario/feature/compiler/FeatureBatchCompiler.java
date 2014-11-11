/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.compiler;


/**
 * @author Sebastian Benz - Initial contribution and API
 */
// TODO NO_XTEND
//public class FeatureBatchCompiler extends JnarioBatchCompiler {
//	
//	@Inject
//	public FeatureClassNameProvider nameProvider;
//
//	@Override
//	protected String getClassName(EObject eObject) {
//		return nameProvider.toJavaClassName(eObject);
//	}
//	
//	@Override
//	protected void addObjectsWithClasses(Resource resource, List<EObject> result) {
//		TreeIterator<EObject> allContents = resource.getAllContents();
//		while (allContents.hasNext()) {
//			Notifier notifier = allContents.next();
//			if (notifier instanceof Feature) {
//				Feature feature = (Feature) notifier;
//				result.add(feature);
//				if (feature.getBackground() != null) {
//					result.add(feature.getBackground());
//				}
//				Iterable<Scenario> scenarios = filter(feature.getMembers(), Scenario.class);
//				for (Scenario scenario : scenarios) {
//					result.add(scenario);
//				}
//				allContents.prune();
//			}
//		}
//	}
//
//}
