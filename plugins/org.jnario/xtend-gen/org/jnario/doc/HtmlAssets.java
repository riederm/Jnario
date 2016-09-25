/**
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.jnario.doc;

import com.google.inject.Singleton;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IFileSystemAccessExtension2;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;
import org.jnario.doc.DocOutputConfigurationProvider;
import org.jnario.util.Strings;

@Data
@Singleton
@SuppressWarnings("all")
public class HtmlAssets {
  private final List<String> _cssFiles = ListExtensions.<String, String>map(CollectionLiterals.<String>newArrayList(
    "bootstrap.min.css", 
    "bootstrap-responsive.min.css", 
    "custom.css", 
    "prettify.css"), new Function1<String, String>() {
    @Override
    public String apply(final String it) {
      return ("css/" + it);
    }
  });
  
  private final List<String> _jsFiles = ListExtensions.<String, String>map(CollectionLiterals.<String>newArrayList(
    "prettify.js", 
    "lang-jnario.js", 
    "jquery.js", 
    "bootstrap-tab.js"), new Function1<String, String>() {
    @Override
    public String apply(final String it) {
      return ("js/" + it);
    }
  });
  
  public void generate(final IFileSystemAccess fsa) {
    List<String> _cssFiles = this.getCssFiles();
    this.copy(fsa, _cssFiles);
    List<String> _jsFiles = this.getJsFiles();
    this.copy(fsa, _jsFiles);
  }
  
  private void copy(final IFileSystemAccess fsa, final Iterable<String> files) {
    final Function1<String, Boolean> _function = new Function1<String, Boolean>() {
      @Override
      public Boolean apply(final String it) {
        boolean _exists = HtmlAssets.this.exists(fsa, it);
        return Boolean.valueOf((!_exists));
      }
    };
    Iterable<String> _filter = IterableExtensions.<String>filter(files, _function);
    for (final String file : _filter) {
      String _load = this.load(file);
      fsa.generateFile(file, DocOutputConfigurationProvider.ASSET_OUTPUT, _load);
    }
  }
  
  private boolean exists(final IFileSystemAccess fsa, final String file) {
    if ((!(fsa instanceof IFileSystemAccessExtension2))) {
      return false;
    }
    final IFileSystemAccessExtension2 fsa2 = ((IFileSystemAccessExtension2) fsa);
    final URI uri = fsa2.getURI(file, DocOutputConfigurationProvider.ASSET_OUTPUT);
    Map<Object, Object> _emptyMap = CollectionLiterals.<Object, Object>emptyMap();
    return URIConverter.INSTANCE.exists(uri, _emptyMap);
  }
  
  private String load(final String file) {
    Class<? extends HtmlAssets> _class = this.getClass();
    final InputStream inputStream = _class.getResourceAsStream(file);
    return Strings.convertStreamToString(inputStream);
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this._cssFiles== null) ? 0 : this._cssFiles.hashCode());
    result = prime * result + ((this._jsFiles== null) ? 0 : this._jsFiles.hashCode());
    return result;
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    HtmlAssets other = (HtmlAssets) obj;
    if (this._cssFiles == null) {
      if (other._cssFiles != null)
        return false;
    } else if (!this._cssFiles.equals(other._cssFiles))
      return false;
    if (this._jsFiles == null) {
      if (other._jsFiles != null)
        return false;
    } else if (!this._jsFiles.equals(other._jsFiles))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
  
  @Pure
  public List<String> getCssFiles() {
    return this._cssFiles;
  }
  
  @Pure
  public List<String> getJsFiles() {
    return this._jsFiles;
  }
}
