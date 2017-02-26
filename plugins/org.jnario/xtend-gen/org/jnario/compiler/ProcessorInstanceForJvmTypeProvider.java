package org.jnario.compiler;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.io.Closeable;
import java.io.IOException;
import java.net.URL;
import java.net.URLClassLoader;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtend.lib.macro.TransformationContext;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

@SuppressWarnings("all")
public class ProcessorInstanceForJvmTypeProvider {
  @Accessors
  public static class ProcessorClassloaderAdapter extends AdapterImpl {
    private ClassLoader classLoader;
    
    public ProcessorClassloaderAdapter(final ClassLoader classLoader) {
      this.classLoader = classLoader;
    }
    
    @Override
    public boolean isAdapterForType(final Object type) {
      return Objects.equal(type, ProcessorInstanceForJvmTypeProvider.ProcessorClassloaderAdapter.class);
    }
    
    @Override
    public void unsetTarget(final Notifier oldTarget) {
      this.discard();
    }
    
    @Override
    public void setTarget(final Notifier newTarget) {
      boolean _equals = Objects.equal(newTarget, null);
      if (_equals) {
        this.discard();
      }
    }
    
    public ClassLoader discard() {
      ClassLoader _xifexpression = null;
      if ((this.classLoader instanceof Closeable)) {
        ClassLoader _xtrycatchfinallyexpression = null;
        try {
          ClassLoader _xblockexpression = null;
          {
            ((Closeable) this.classLoader).close();
            _xblockexpression = this.classLoader = null;
          }
          _xtrycatchfinallyexpression = _xblockexpression;
        } catch (final Throwable _t) {
          if (_t instanceof IOException) {
            final IOException e = (IOException)_t;
            ProcessorInstanceForJvmTypeProvider.logger.error(e.getMessage(), e);
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        _xifexpression = _xtrycatchfinallyexpression;
      }
      return _xifexpression;
    }
    
    @Pure
    public ClassLoader getClassLoader() {
      return this.classLoader;
    }
    
    public void setClassLoader(final ClassLoader classLoader) {
      this.classLoader = classLoader;
    }
  }
  
  private final static Logger logger = Logger.getLogger(ProcessorInstanceForJvmTypeProvider.class);
  
  /**
   * @return an instance of the given JvmType
   */
  public Object getProcessorInstance(final JvmType type) {
    try {
      ClassLoader _classLoader = this.getClassLoader(type);
      Class<?> _loadClass = null;
      if (_classLoader!=null) {
        _loadClass=_classLoader.loadClass(type.getIdentifier());
      }
      final Class<?> loadClass = _loadClass;
      Object _newInstance = null;
      if (loadClass!=null) {
        _newInstance=loadClass.newInstance();
      }
      return _newInstance;
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        final Exception e = (Exception)_t;
        String _identifier = type.getIdentifier();
        String _plus = ("Problem during instantiation of " + _identifier);
        String _plus_1 = (_plus + " : ");
        String _message = e.getMessage();
        String _plus_2 = (_plus_1 + _message);
        throw new IllegalStateException(_plus_2, e);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  protected ClassLoader getClassLoader(final EObject ctx) {
    final ResourceSet resourceSet = ctx.eResource().getResourceSet();
    final ProcessorInstanceForJvmTypeProvider.ProcessorClassloaderAdapter adapter = IterableExtensions.<ProcessorInstanceForJvmTypeProvider.ProcessorClassloaderAdapter>head(Iterables.<ProcessorInstanceForJvmTypeProvider.ProcessorClassloaderAdapter>filter(resourceSet.eAdapters(), ProcessorInstanceForJvmTypeProvider.ProcessorClassloaderAdapter.class));
    boolean _notEquals = (!Objects.equal(adapter, null));
    if (_notEquals) {
      return adapter.getClassLoader();
    }
    boolean _matched = false;
    if (resourceSet instanceof XtextResourceSet) {
      _matched=true;
      final Object classLoaderCtx = ((XtextResourceSet)resourceSet).getClasspathURIContext();
      ClassLoader _switchResult_1 = null;
      boolean _matched_1 = false;
      if (classLoaderCtx instanceof ClassLoader) {
        _matched_1=true;
        _switchResult_1 = ((ClassLoader)classLoaderCtx);
      }
      if (!_matched_1) {
        if (classLoaderCtx instanceof Class) {
          _matched_1=true;
          _switchResult_1 = ((Class<?>)classLoaderCtx).getClassLoader();
        }
      }
      final ClassLoader jvmTypeLoader = _switchResult_1;
      ClassLoader _xifexpression = null;
      if ((jvmTypeLoader instanceof URLClassLoader)) {
        URL[] _uRLs = ((URLClassLoader)jvmTypeLoader).getURLs();
        ClassLoader _classLoader = TransformationContext.class.getClassLoader();
        _xifexpression = new URLClassLoader(_uRLs, _classLoader);
      } else {
        _xifexpression = jvmTypeLoader;
      }
      final ClassLoader processorClassLoader = _xifexpression;
      boolean _notEquals_1 = (!Objects.equal(processorClassLoader, null));
      if (_notEquals_1) {
        EList<Adapter> _eAdapters = ((XtextResourceSet)resourceSet).eAdapters();
        ProcessorInstanceForJvmTypeProvider.ProcessorClassloaderAdapter _processorClassloaderAdapter = new ProcessorInstanceForJvmTypeProvider.ProcessorClassloaderAdapter(processorClassLoader);
        _eAdapters.add(_processorClassloaderAdapter);
        return processorClassLoader;
      }
    }
    ProcessorInstanceForJvmTypeProvider.logger.info("No class loader configured. Trying with this class classloader.");
    return this.getClass().getClassLoader();
  }
}
