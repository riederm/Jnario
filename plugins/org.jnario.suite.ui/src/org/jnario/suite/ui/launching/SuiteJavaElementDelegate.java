/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.ui.launching;

import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.ui.generator.IDerivedResourceMarkers;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.ui.launching.JavaElementDelegateJunitLaunch;
import org.jnario.JnarioClass;
import org.jnario.JnarioFile;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.suite.SuiteFile;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class SuiteJavaElementDelegate extends JavaElementDelegateJunitLaunch {

	private final static Logger log = Logger.getLogger(SuiteJavaElementDelegate.class);
	
	@Inject
	private IJvmModelAssociations associations;

	@Inject private IResourceSetProvider resourceSetProvider;
	@Inject private SuiteClassNameProvider nameProvider;
	@Inject	private IDerivedResourceMarkers derivedResourceMarkers;

	
	protected IJavaElement getJavaElementForResource(IResource resource) {
		try {
			final URI uri = URI.createPlatformResourceURI(resource.getFullPath().toString(), true);
			String mainClassName = loadSuite(resource, uri);
			if(mainClassName == null){
				return null;
			}
			List<IFile> resources = derivedResourceMarkers.findDerivedResources(resource.getProject(), uri.toString());
			for (IFile file : resources) {
				if (file.getName().equals(mainClassName)){
					return JavaCore.create(file);
				}
			}
		} catch (CoreException e) {
			if (log.isDebugEnabled()) {
				log.debug(e.getMessage(), e);
			}
		}
		return null;
	}

	protected String loadSuite(IResource resource, final URI uri) {
		ResourceSet resourceSet = resourceSetProvider.get(resource.getProject());
		Resource r = resourceSet.getResource(uri, true);
		if(r == null || r.getContents().isEmpty()){
			return null;
		}
		SuiteFile suiteFile = Iterables.filter(r.getContents(), SuiteFile.class).iterator().next();
		if(suiteFile.getXtendTypes().isEmpty()){
			return null;
		}
		Suite suite = (Suite) suiteFile.getXtendTypes().get(0);
		return nameProvider.toJavaClassName(suite) + ".java";
	}
	
	@Override
	protected JvmIdentifiableElement findAssociatedJvmElement(EObject element) {
		if (element == null)
			return null;
		if (element instanceof JnarioFile) {
			JnarioFile specFile = (JnarioFile) element;
			if(!specFile.getXtendTypes().isEmpty()){
				element = specFile.getXtendTypes().get(0);
			}
		}else{
			element = EcoreUtil2.getContainerOfType(element, JnarioClass.class);
		}
		Set<EObject> elements = associations.getJvmElements(element);
		if (elements.isEmpty()) {
			return findAssociatedJvmElement(element.eContainer());
		}
		return super.findAssociatedJvmElement(element);
	}
}
