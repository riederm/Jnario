/**
 * Copyright (c) 2014 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.compiler;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import com.google.inject.Inject;
import com.google.inject.Injector;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtext.ISetup;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.common.types.descriptions.IStubGenerator;
import org.eclipse.xtext.common.types.descriptions.JvmTypesResourceDescriptionStrategy;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;
import org.eclipse.xtext.mwe.NameBasedFilter;
import org.eclipse.xtext.mwe.PathTraverser;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.parser.IEncodingProvider;
import org.eclipse.xtext.resource.FileExtensionProvider;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.containers.FlatResourceSetBasedAllContainersState;
import org.eclipse.xtext.resource.impl.ResourceSetBasedResourceDescriptions;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.compiler.GeneratorConfig;
import org.eclipse.xtext.xbase.compiler.IGeneratorConfigProvider;
import org.eclipse.xtext.xbase.compiler.JvmModelGenerator;
import org.eclipse.xtext.xbase.lib.CollectionExtensions;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pair;
import org.jnario.compiler.AbstractBatchCompiler;
import org.jnario.feature.FeatureStandaloneSetup;
import org.jnario.spec.SpecStandaloneSetup;
import org.jnario.suite.SuiteStandaloneSetup;

@SuppressWarnings("all")
public class JnarioStandaloneCompiler extends AbstractBatchCompiler {
  private final static Logger log = Logger.getLogger(JnarioStandaloneCompiler.class.getName());
  
  @Inject
  private IEncodingProvider.Runtime encodingProvider;
  
  @Inject
  private IStubGenerator stubGenerator;
  
  private List<Injector> injectors;
  
  private Map<String, Injector> injectorMap;
  
  public static JnarioStandaloneCompiler create() {
    FeatureStandaloneSetup _featureStandaloneSetup = new FeatureStandaloneSetup();
    SpecStandaloneSetup _specStandaloneSetup = new SpecStandaloneSetup();
    SuiteStandaloneSetup _suiteStandaloneSetup = new SuiteStandaloneSetup();
    final List<? extends ISetup> setups = Collections.<ISetup>unmodifiableList(CollectionLiterals.<ISetup>newArrayList(_featureStandaloneSetup, _specStandaloneSetup, _suiteStandaloneSetup));
    return new JnarioStandaloneCompiler(setups);
  }
  
  public JnarioStandaloneCompiler(final List<? extends ISetup> setups) {
    final Function1<ISetup, Injector> _function = new Function1<ISetup, Injector>() {
      @Override
      public Injector apply(final ISetup it) {
        return it.createInjectorAndDoEMFRegistration();
      }
    };
    List<Injector> _eagerMap = JnarioStandaloneCompiler.eagerMap(setups, _function);
    List<Injector> _list = IterableExtensions.<Injector>toList(_eagerMap);
    this.injectors = _list;
    Injector _head = IterableExtensions.<Injector>head(this.injectors);
    _head.injectMembers(this);
    final Function1<Injector, Pair<String, Injector>> _function_1 = new Function1<Injector, Pair<String, Injector>>() {
      @Override
      public Pair<String, Injector> apply(final Injector it) {
        Pair<String, Injector> _xblockexpression = null;
        {
          FileExtensionProvider _instance = it.<FileExtensionProvider>getInstance(FileExtensionProvider.class);
          final String fileExtension = _instance.getPrimaryFileExtension();
          _xblockexpression = Pair.<String, Injector>of(fileExtension, it);
        }
        return _xblockexpression;
      }
    };
    List<Pair<String, Injector>> _map = ListExtensions.<Injector, Pair<String, Injector>>map(this.injectors, _function_1);
    HashMap<String, Injector> _newHashMap = CollectionLiterals.<String, Injector>newHashMap(((Pair<? extends String, ? extends Injector>[])Conversions.unwrapArray(_map, Pair.class)));
    this.injectorMap = _newHashMap;
  }
  
  @Override
  protected ResourceSet loadXtendFiles(final ResourceSet resourceSet) {
    EList<Adapter> _eAdapters = resourceSet.eAdapters();
    _eAdapters.add(
      new FlatResourceSetBasedAllContainersState(resourceSet) {
        @Override
        public Collection<URI> getContainedURIs(final String containerHandle) {
          ResourceSet _resourceSet = this.getResourceSet();
          EList<Resource> _resources = _resourceSet.getResources();
          int _size = _resources.size();
          final ArrayList<URI> uris = Lists.<URI>newArrayListWithCapacity(_size);
          ResourceSet _resourceSet_1 = this.getResourceSet();
          EList<Resource> _resources_1 = _resourceSet_1.getResources();
          for (final Resource r : _resources_1) {
            URI _uRI = r.getURI();
            uris.add(_uRI);
          }
          return uris;
        }
      });
    String _fileEncoding = this.getFileEncoding();
    this.encodingProvider.setDefaultEncoding(_fileEncoding);
    final List<NameBasedFilter> nameBasedFilter = this.getNameBasedFilters();
    final PathTraverser pathTraverser = new PathTraverser();
    final List<String> sourcePathDirectories = this.getSourcePathDirectories();
    final Predicate<URI> _function = new Predicate<URI>() {
      @Override
      public boolean apply(final URI src) {
        final Function1<NameBasedFilter, Boolean> _function = new Function1<NameBasedFilter, Boolean>() {
          @Override
          public Boolean apply(final NameBasedFilter it) {
            return Boolean.valueOf(it.matches(src));
          }
        };
        return IterableExtensions.<NameBasedFilter>exists(nameBasedFilter, _function);
      }
    };
    final Multimap<String, URI> pathes = pathTraverser.resolvePathes(sourcePathDirectories, _function);
    Set<String> _keySet = pathes.keySet();
    final Consumer<String> _function_1 = new Consumer<String>() {
      @Override
      public void accept(final String src) {
        final URI baseDir = URI.createFileURI((src + "/"));
        Joiner _on = Joiner.on("_");
        String[] _segments = baseDir.segments();
        final String identifier = _on.join(_segments);
        final URI platformResourceURI = URI.createPlatformResourceURI((identifier + "/"), true);
        URIConverter _uRIConverter = resourceSet.getURIConverter();
        Map<URI, URI> _uRIMap = _uRIConverter.getURIMap();
        _uRIMap.put(platformResourceURI, baseDir);
        Collection<URI> _get = pathes.get(src);
        for (final URI uri : _get) {
          {
            boolean _isDebugEnabled = JnarioStandaloneCompiler.log.isDebugEnabled();
            if (_isDebugEnabled) {
              JnarioStandaloneCompiler.log.debug((("load xtend file \'" + uri) + "\'"));
            }
            final URI uriToUse = uri.replacePrefix(baseDir, platformResourceURI);
            resourceSet.getResource(uriToUse, true);
          }
        }
      }
    };
    _keySet.forEach(_function_1);
    return resourceSet;
  }
  
  public List<NameBasedFilter> getNameBasedFilters() {
    final Function1<Injector, NameBasedFilter> _function = new Function1<Injector, NameBasedFilter>() {
      @Override
      public NameBasedFilter apply(final Injector it) {
        NameBasedFilter _xblockexpression = null;
        {
          final NameBasedFilter filter = new NameBasedFilter();
          FileExtensionProvider _instance = it.<FileExtensionProvider>getInstance(FileExtensionProvider.class);
          String _primaryFileExtension = _instance.getPrimaryFileExtension();
          filter.setExtension(_primaryFileExtension);
          _xblockexpression = filter;
        }
        return _xblockexpression;
      }
    };
    return JnarioStandaloneCompiler.<Injector, NameBasedFilter>eagerMap(this.injectors, _function);
  }
  
  @Override
  public File createStubs(final ResourceSet resourceSet) {
    final File outputDirectory = this.createTempDir("stubs");
    final JavaIoFileSystemAccess fileSystemAccess = this.javaIoFileSystemAccessProvider.get();
    String _string = outputDirectory.toString();
    fileSystemAccess.setOutputPath(_string);
    EList<Resource> _resources = resourceSet.getResources();
    ArrayList<Resource> _newArrayList = Lists.<Resource>newArrayList(_resources);
    final Consumer<Resource> _function = new Consumer<Resource>() {
      @Override
      public void accept(final Resource it) {
        IResourceDescription.Manager _findResourceDescriptionManager = JnarioStandaloneCompiler.this.findResourceDescriptionManager(it);
        IResourceDescription _resourceDescription = null;
        if (_findResourceDescriptionManager!=null) {
          _resourceDescription=_findResourceDescriptionManager.getResourceDescription(it);
        }
        final IResourceDescription description = _resourceDescription;
        boolean _notEquals = (!Objects.equal(description, null));
        if (_notEquals) {
          JnarioStandaloneCompiler.this.stubGenerator.doGenerateStubs(fileSystemAccess, description);
        }
      }
    };
    _newArrayList.forEach(_function);
    return outputDirectory;
  }
  
  public IResourceDescription.Manager findResourceDescriptionManager(final Resource resource) {
    return this.<IResourceDescription.Manager>getInstance(resource, IResourceDescription.Manager.class);
  }
  
  public <T extends Object> T getInstance(final Resource resource, final Class<T> type) {
    URI _uRI = resource.getURI();
    String _fileExtension = _uRI.fileExtension();
    String _lowerCase = _fileExtension.toLowerCase();
    Injector _get = this.injectorMap.get(_lowerCase);
    T _instance = null;
    if (_get!=null) {
      _instance=_get.<T>getInstance(type);
    }
    return _instance;
  }
  
  @Override
  public void generateJavaFiles(final ResourceSet resourceSet) {
    final JavaIoFileSystemAccess javaIoFileSystemAccess = this.javaIoFileSystemAccessProvider.get();
    final String outputPath = this.outputPath;
    javaIoFileSystemAccess.setOutputPath(outputPath);
    javaIoFileSystemAccess.setWriteTrace(this.writeTraceFiles);
    final ResourceSetBasedResourceDescriptions resourceDescriptions = this.getResourceDescriptions(resourceSet);
    final Iterable<IEObjectDescription> exportedObjectsByType = resourceDescriptions.getExportedObjectsByType(TypesPackage.Literals.JVM_DECLARED_TYPE);
    boolean _isInfoEnabled = JnarioStandaloneCompiler.log.isInfoEnabled();
    if (_isInfoEnabled) {
      final int size = IterableExtensions.size(exportedObjectsByType);
      if ((size == 0)) {
        JnarioStandaloneCompiler.log.info((("No sources to compile in \'" + this.sourcePath) + "\'"));
      } else {
        String _xifexpression = null;
        if ((size == 1)) {
          _xifexpression = "file";
        } else {
          _xifexpression = "files";
        }
        String _plus = ((("Compiling " + Integer.valueOf(size)) + " source ") + _xifexpression);
        String _plus_1 = (_plus + " to ");
        String _plus_2 = (_plus_1 + outputPath);
        JnarioStandaloneCompiler.log.info(_plus_2);
      }
    }
    final Function1<IEObjectDescription, Boolean> _function = new Function1<IEObjectDescription, Boolean>() {
      @Override
      public Boolean apply(final IEObjectDescription it) {
        String _userData = it.getUserData(JvmTypesResourceDescriptionStrategy.IS_NESTED_TYPE);
        return Boolean.valueOf(Objects.equal(_userData, null));
      }
    };
    Iterable<IEObjectDescription> _filter = IterableExtensions.<IEObjectDescription>filter(exportedObjectsByType, _function);
    final Consumer<IEObjectDescription> _function_1 = new Consumer<IEObjectDescription>() {
      @Override
      public void accept(final IEObjectDescription eObjectDescription) {
        EObject _eObjectOrProxy = eObjectDescription.getEObjectOrProxy();
        final JvmDeclaredType jvmGenericType = ((JvmDeclaredType) _eObjectOrProxy);
        Resource _eResource = jvmGenericType.eResource();
        final JvmModelGenerator generator = JnarioStandaloneCompiler.this.<JvmModelGenerator>getInstance(_eResource, JvmModelGenerator.class);
        Resource _eResource_1 = jvmGenericType.eResource();
        final IGeneratorConfigProvider generatorConfig = JnarioStandaloneCompiler.this.<IGeneratorConfigProvider>getInstance(_eResource_1, IGeneratorConfigProvider.class);
        Resource _eResource_2 = jvmGenericType.eResource();
        final IQualifiedNameProvider nameProvider = JnarioStandaloneCompiler.this.<IQualifiedNameProvider>getInstance(_eResource_2, IQualifiedNameProvider.class);
        GeneratorConfig _get = generatorConfig.get(jvmGenericType);
        final CharSequence generatedType = generator.generateType(jvmGenericType, _get);
        final QualifiedName qualifiedName = nameProvider.getFullyQualifiedName(jvmGenericType);
        boolean _isDebugEnabled = JnarioStandaloneCompiler.log.isDebugEnabled();
        if (_isDebugEnabled) {
          String _javaFileName = JnarioStandaloneCompiler.this.getJavaFileName(qualifiedName);
          String _plus = ((("write \'" + outputPath) + File.separator) + _javaFileName);
          String _plus_1 = (_plus + "\'");
          JnarioStandaloneCompiler.log.debug(_plus_1);
        }
        String _javaFileName_1 = JnarioStandaloneCompiler.this.getJavaFileName(qualifiedName);
        javaIoFileSystemAccess.generateFile(_javaFileName_1, generatedType);
      }
    };
    _filter.forEach(_function_1);
  }
  
  public String getJavaFileName(final QualifiedName typeName) {
    List<String> _segments = typeName.getSegments();
    String _concat = Strings.concat("/", _segments);
    return (_concat + ".java");
  }
  
  public static <T extends Object, R extends Object> List<R> eagerMap(final List<T> list, final Function1<? super T, ? extends R> transformation) {
    ArrayList<R> _xblockexpression = null;
    {
      int _size = list.size();
      final ArrayList<R> result = new ArrayList<R>(_size);
      for (final T t : list) {
        R _apply = transformation.apply(t);
        CollectionExtensions.<R>addAll(result, _apply);
      }
      _xblockexpression = result;
    }
    return _xblockexpression;
  }
}
