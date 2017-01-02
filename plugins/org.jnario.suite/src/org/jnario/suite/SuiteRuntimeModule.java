/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/*
 * generated by Xtext
 */
package org.jnario.suite;

import org.eclipse.xtext.common.types.descriptions.JvmDeclaredTypeSignatureHashProvider.SignatureHashBuilder;
import org.eclipse.xtext.common.types.xtext.TypesAwareDefaultGlobalScopeProvider;
import org.eclipse.xtext.conversion.IValueConverterService;
import org.eclipse.xtext.conversion.impl.IDValueConverter;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.generator.IFilePostProcessor;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.generator.OutputConfigurationProvider;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.parser.IParser;
import org.eclipse.xtext.parser.impl.TokenRegionProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.EagerResourceSetBasedResourceDescriptions;
import org.eclipse.xtext.resource.persistence.IResourceStorageFacade;
import org.eclipse.xtext.scoping.IGlobalScopeProvider;
import org.eclipse.xtext.scoping.IScopeProvider;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import org.eclipse.xtext.validation.CompositeEValidator;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.compiler.output.TraceAwarePostProcessor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.resource.BatchLinkableResourceStorageFacade;
import org.jnario.compiler.JnarioBatchCompiler;
import org.jnario.conversion.JnarioJavaIDValueConverter;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.DocOutputConfigurationProvider;
import org.jnario.documentation.XtendDocumentationProvider;
import org.jnario.generator.JnarioJavaIoFileSystemAccess;
import org.jnario.jvmmodel.ExecutableProvider;
import org.jnario.jvmmodel.ExtendedJvmModelGenerator;
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder;
import org.jnario.jvmmodel.JnarioNameProvider;
import org.jnario.jvmmodel.JnarioSignatureHashBuilder;
import org.jnario.report.Executable2ResultMapping;
import org.jnario.report.HashBasedSpec2ResultMapping;
import org.jnario.scoping.JnarioResourceDescriptionStrategy;
import org.jnario.suite.compiler.SuiteBatchCompiler;
import org.jnario.suite.conversion.SuiteValueConverterService;
import org.jnario.suite.doc.SuiteDocGenerator;
import org.jnario.suite.generator.SuiteGenerator;
import org.jnario.suite.jvmmodel.SuiteClassNameProvider;
import org.jnario.suite.jvmmodel.SuiteExecutableProvider;
import org.jnario.suite.jvmmodel.SuiteJvmModelInferrer;
import org.jnario.suite.naming.SuiteQualifiedNameProvider;
import org.jnario.suite.scoping.SuiteImportedNamespaceScopeProvider;
import org.jnario.suite.scoping.SuiteScopeProvider;

import com.google.inject.Binder;
import com.google.inject.name.Names;

/**
 * Use this class to register components to be used at runtime / without the Equinox extension registry.
 */
public class SuiteRuntimeModule extends org.jnario.suite.AbstractSuiteRuntimeModule {

	@Override
	public void configure(Binder binder) {
		super.configure(binder);
// TODO NO_XTEND
//		binder.bind(FlexerFactory.class).in(Scopes.SINGLETON);
		binder.bind(AbstractDocGenerator.class).to(SuiteDocGenerator.class);
		binder.bind(SignatureHashBuilder.class).to(JnarioSignatureHashBuilder.class);
		binder.bind(JnarioNameProvider.class).to(SuiteClassNameProvider.class);
		binder.bind(ExecutableProvider.class).to(SuiteExecutableProvider.class);
		binder.bind(Executable2ResultMapping.class).to(HashBasedSpec2ResultMapping.class);
		binder.bind(boolean.class).annotatedWith(
				Names.named(CompositeEValidator.USE_EOBJECT_VALIDATOR)).toInstance(false);
		binder.bind(JnarioBatchCompiler.class).to(SuiteBatchCompiler.class);
// TODO NO_XTEND
//		binder.bind(AnnotationProcessor.class).to(JnarioAnnotationProcessor.class);
	}
	
	@Override
	public Class<? extends IGlobalScopeProvider> bindIGlobalScopeProvider() {
		return TypesAwareDefaultGlobalScopeProvider.class;
	}
	
	public Class<? extends OutputConfigurationProvider> bindOutputConfigurationProvider() {
		return DocOutputConfigurationProvider.class;
	}
	
	public Class<? extends JvmTypesBuilder> bindJvmTypesBuilder(){
		return ExtendedJvmTypesBuilder.class;
	}
	
	public Class<? extends JvmModelGenerator> bindJvmModelGenerator(){
		return ExtendedJvmModelGenerator.class;
	}

	public Class<? extends IFilePostProcessor> bindPostProcessor() {
		return TraceAwarePostProcessor.class;
	}
	
	public Class<? extends JavaIoFileSystemAccess> bindJavaIoFileSystemAccess() {
		return JnarioJavaIoFileSystemAccess.class;
	}

// TODO NO_XTEND
//	public Class<? extends XExpressionHelper> bindXExpressionHelper() {
//		return XtendExpressionHelper.class;
//	}
	
	@Override
	public Class<? extends IValueConverterService> bindIValueConverterService() {
		return SuiteValueConverterService.class;
	}
	
	@Override
	public void configureIScopeProviderDelegate(Binder binder) {
		binder.bind(IScopeProvider.class).annotatedWith(Names.named(AbstractDeclarativeScopeProvider.NAMED_DELEGATE))
		.to(SuiteImportedNamespaceScopeProvider.class);
	}

	@Override
	public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
		return SuiteQualifiedNameProvider.class;
	}
	
	@Override
	public Class <? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
		return JnarioResourceDescriptionStrategy.class;
	}

// TODO NO_XTEND
//	public Class<? extends JvmModelAssociator> bindJvmModelAssociator() {
//		return IXtendJvmAssociations.Impl.class;
//	}
//
//	public Class<? extends EarlyExitValidator> bindEarlyExitValidator() {
//		return XtendEarlyExitValidator.class;
//	}
//	
//	public Class<? extends IOutputConfigurationProvider> bindIOutputConfigurationProvider() {
//		return XtendOutputConfigurationProvider.class;
//	}

	@Override
	public Class<? extends IScopeProvider> bindIScopeProvider() {
		return SuiteScopeProvider.class;
	}

// TODO NO_XTEND
//	@Override
//	public Class<? extends ILocationInFileProvider> bindILocationInFileProvider() {
//		return XtendLocationInFileProvider.class;
//	}
//
//	@Override
//	public Class<? extends ILinkingDiagnosticMessageProvider> bindILinkingDiagnosticMessageProvider() {
//		return XtendLinkingDiagnosticMessageProvider.class;
//	}
//	
//	public Class<? extends IBasicFormatter> bindIBasicFormatter() {
//		return XtendFormatter.class;
//	}
//
//	public Class<? extends IImportsConfiguration> bindIImportsConfiguration() {
//		return XtendImportsConfiguration.class;
//	}
//
//	@Override
//	public Class<? extends ConfigurableIssueCodesProvider> bindConfigurableIssueCodesProvider() {
//		return XtendConfigurableIssueCodes.class;
//	}
//	
//	public XtendFactory bindXtendFactory() {
//		return XtendFactory.eINSTANCE;
//	}
//
//	@Override
//	public Class<? extends DefaultBatchTypeResolver> bindDefaultBatchTypeResolver() {
//		return TypeDeclarationAwareBatchTypeResolver.class;
//	}
//
//	@Override
//	public Class<? extends DefaultReentrantTypeResolver> bindDefaultReentrantTypeResolver() {
//		return XtendReentrantTypeResolver.class;
//	}
//	
//	public Class<? extends XbaseCompiler> bindXbaseCompiler() {
//		return XtendCompiler.class;
//	}
//	
//	public Class<? extends TraceAwarePostProcessor> bindTraceAwarePostProcessor() {
//		return UnicodeAwarePostProcessor.class;
//	}
//
//	@Override
//	public Class<? extends ITypeComputer> bindITypeComputer() {
//		return XtendTypeComputer.class;
//	}

	public Class<? extends IJvmModelInferrer> bindIJvmModelInferrer() {
		return SuiteJvmModelInferrer.class;
	}
	
// TODO NO_XTEND
//	@Override
//	public Class<? extends Manager> bindIResourceDescription$Manager() {
//		return XtendResourceDescriptionManager.class;
//	}
//	
//	@Override
//	public Class<? extends IResourceValidator> bindIResourceValidator() {
//		return org.eclipse.xtend.core.validation.CachingResourceValidatorImpl.class;
//	}
	
	/**
	 * @since 2.4.2
	 */
	@Override
	public void configureIResourceDescriptions(com.google.inject.Binder binder) {
		binder.bind(IResourceDescriptions.class).to(EagerResourceSetBasedResourceDescriptions.class);
	}

	public Class<? extends IResourceStorageFacade> bindResourceStorageFacade() {
		return BatchLinkableResourceStorageFacade.class;
	}

	public Class<? extends IGenerator> bindIGenerator() {
		return SuiteGenerator.class;
	}

	//TODO MARI
//	public Class<? extends AbstractFileSystemSupport> bindAbstractFileSystemSupport() {
//		return JavaIOFileSystemSupport.class;
//	}
//	
//	@Override
//	
//	public void configureWorkspaceConfigContribution(Binder binder) {
//		binder.bind(WorkspaceConfig.class).toProvider(RuntimeWorkspaceConfigProvider.class);
//	}
//	
//	public Class<? extends FileLocations> bindFileLocations() {
//		return FileLocationsImpl.class;
//	}
	//TODO MARI END
	
	public Class<? extends IEObjectDocumentationProvider> bindIEObjectDocumentationProvider() {
		return XtendDocumentationProvider.class;
	}
	
	@Override
	public Class<? extends IParser> bindIParser() {
		return SuiteParserWithoutPartialParsing.class;
	}
	
	public Class<? extends TokenRegionProvider> bindTokenRegionProvider() {
		return TokenRegionProvider.class;
	}
	
	public Class<? extends IDValueConverter> bindIDValueConverter() {
		return JnarioJavaIDValueConverter.class;
	}

// TODO NO_XTEND
//	@Override
//	public Class<? extends EObjectAtOffsetHelper> bindEObjectAtOffsetHelper() {
//		return XtendEObjectAtOffsetHelper.class;
//	}
//	
//	public Class<? extends ImplicitReturnFinder> bindImplicitReturnFinder() {
//		return XtendImplicitReturnFinder.class;
//	}
//	
//	public Class<? extends HumanReadableTypeNames> bindHumanReadableTypeNames() {
//		return LocalClassAwareTypeNames.class;
//	}
//	
//	
//	public Class<? extends ResourceChangeRegistry> bindResourceChangeRegistry() {
//		return NopResourceChangeRegistry.class;
//	}
	
}
