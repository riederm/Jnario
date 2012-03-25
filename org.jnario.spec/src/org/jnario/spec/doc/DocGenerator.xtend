/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.doc

import com.google.inject.Inject
import org.jnario.ExampleTable
import org.jnario.jvmmodel.ExtendedJvmTypesBuilder
import org.jnario.spec.naming.ExampleNameProvider
import org.jnario.spec.spec.Example
import org.jnario.spec.spec.ExampleGroup
import org.jnario.spec.spec.SpecFile
import java.util.List
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.xbase.XBlockExpression
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtend.core.xtend.XtendMember
import org.pegdown.PegDownProcessor

import static org.jnario.spec.util.Strings.*

import static extension org.eclipse.xtext.util.Strings.*
import org.eclipse.xtext.nodemodel.util.NodeModelUtils
import org.jnario.spec.spec.ExampleGroup
import org.eclipse.xtend2.lib.StringConcatenation

class DocGenerator implements IGenerator {

	@Inject extension ExampleNameProvider 
	@Inject extension ExtendedJvmTypesBuilder
	@Inject extension WhiteSpaceNormalizer
	@Inject extension PegDownProcessor
	@Inject extension FilterExtractor

	List<String> cssFiles = newArrayList("bootstrap.min.css", "bootstrap-responsive.min.css", "custom.css", "prettify.css")
	List<String> jsFiles = newArrayList("prettify.js", "lang-jnario.js")

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		fsa.copy("css", cssFiles)
		fsa.copy("js", jsFiles)
		for(spec : input.contents.filter(typeof(SpecFile))){
			val exampleGroup = spec.xtendClass as ExampleGroup
			if(exampleGroup != null){
				fsa.generateFile(fileName(exampleGroup), DocOutputConfigurationProvider::DOC_OUTPUT, generate(exampleGroup))
			}
		}
	}
	
	def fileName(ExampleGroup exampleGroup){
		val fileName = "/" + exampleGroup.toJavaClassName + ".html"
		if(exampleGroup.packageName == null){
			return fileName
		}
		return "/" + exampleGroup.packageName.replaceAll("\\.", "/") + fileName
	}
	
	def copy(IFileSystemAccess fsa, String targetFolder, Iterable<String> files){
		for(file : files){
			fsa.generateFile("/" + targetFolder + "/" + file, DocOutputConfigurationProvider::DOC_OUTPUT, load(file)) 
		}
	}
	
	def load(String file){
		val inputStream = getClass().getResourceAsStream(file)
		return convertStreamToString(inputStream)
	}	
	
	def folder(String name, ExampleGroup context){
		return root(context) + name
	}
	
	def root(ExampleGroup exampleGroup){
		val specFile = EcoreUtil2::getContainerOfType(exampleGroup, typeof(SpecFile))
		val packageName= specFile.xtendClass.packageName
		if(packageName == null){
			return ""
		}
		val fragments = packageName.split("\\.")
		val path = fragments.map(String s | "../")
		return path.join("")
	}

	def generate(ExampleGroup exampleGroup)'''
		<!DOCTYPE html>
		<html lang="en">
		<head>
		<meta charset="utf-8">
		<title>�exampleGroup.asTitle�</title>
		<meta name="description" content="">
		<meta name="author" content="Jnario">
		
		<!-- Le HTML5 shim, for IE6-8 support of HTML elements -->
		<!--[if lt IE 9]>
		      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
		    <![endif]-->
		
		<!-- Le styles -->
		�FOR cssFile : cssFiles�
		<link rel="stylesheet" href="�folder("css", exampleGroup)�/�cssFile�">
		�ENDFOR�
		�FOR jsFile : jsFiles�
		<script type="text/javascript" src="�folder("js", exampleGroup)�/�jsFile�"></script>
		�ENDFOR�
		</head>
		
		<body onload="prettyPrint()">
			<div class="container">
				<div class="content">
					<div class="page-header">
						<h1>�exampleGroup.asTitle�</h1>
					</div>
					<div class="row">
						<div class="span12">
		�exampleGroup.generateDoc()�
�exampleGroup.generateMembers(1)�
						</div>
					</div>
				</div> <!-- /content -->
				<footer>
					<p><small>Generated by <a href="http://www.jnario.org">Jnario</a>.</small></p>
				</footer>
		
			</div>
			<!-- /container -->
		
		</body>
		</html>
	'''
	
	def generateMembers(ExampleGroup exampleGroup, int level){
		val result = new StringConcatenation
		var inList = false	
		for(member : exampleGroup.members){
			val isExampleGroup = member instanceof ExampleGroup
			if (inList && !isExampleGroup){
				result.append("<li>")
				result.append(generate(member, level))
				result.append("</li>")
			}else if(!inList && !isExampleGroup){
				result.append("<ul>")
				result.append("<li>")
				result.append(generate(member, level))
				result.append("</li>")
				inList = true
			}else if(inList && isExampleGroup){
				result.append("</ul>")
				result.append(generate(member, level))
				inList = false
			}else if(!inList && isExampleGroup){
				result.append(generate(member, level))
			}
		}
		if(inList){
			result.append("</ul>")
		}
		return result
	}
	
	def generateDoc(EObject eObject)'''
		�IF eObject.documentation != null�
			�eObject.documentation.markdown2Html�
		�ENDIF�
	'''
	def dispatch generate(XtendMember member, int level)'''
	'''
	
	def dispatch generate(Example example, int level){
		var String docString = example.documentation
		var List<Filter> filters = emptyList
		if(docString != null){
			val filterResult = docString.apply
			filters = filterResult.filters
			docString = filterResult.string
			docString = docString.markdown2Html
		}
		'''
			<p>�IF example.name != null�
			<strong>�example.describe.convertToText�</strong>
			�ENDIF�
			�docString�
			�IF !example.pending && example.body != null�
			�example.toCodeBlock(filters)�
			�ENDIF�</p>
		'''
	}
	
	def toCodeBlock(Example example, List<Filter> filters){
		val code = example.implementation.toXtendCode(filters)
		if(code.length == 0) return ''''''
		'''
		<pre class="prettyprint lang-jnario">
		�code�</pre>'''
	}
	 
	def dispatch generate(ExampleTable table, int level)'''
		<h4>�table.toFieldName.convertToTitle�</h4>
		<p>�table.generateDoc�</p>
		<table class="table table-striped table-bordered table-condensed">
			<thead>
				<tr>
				�FOR headingCell : table.columns�
					<th>�headingCell.name�</th>
				�ENDFOR�
				</tr>
			</thead>
			<tbody>
			�FOR row : table.rows�
			<tr>
				�FOR cell : row.cells�
				<td>�toXtendCode(cell, emptyList)�</td>
				�ENDFOR�
			</tr>
		  	�ENDFOR�
			</tbody>
		</table>
	'''
	
	def dispatch generate(ExampleGroup exampleGroup, int level)'''
���		�IF level > 1�
���		�ENDIF�
		<�level.heading�>�exampleGroup.asTitle�</�level.heading�>
���		<div class="level">
		<p>�exampleGroup.generateDoc�</p>
�generateMembers(exampleGroup, level + 1)�
���		�IF level > 1�
���		</div>
���		�ENDIF�
	'''

	def dispatch toXtendCode(XExpression expr, List<Filter> filters){
		return expr.serialize.normalize.toHtml.trim
	}
	
	def dispatch toXtendCode(XBlockExpression expr, List<Filter> filters){
		var code = expr.serialize.trim
		for(filter : filters){
			code = filter.apply(code)
		}
		if(code.length == 0){
			return ""
		}
		code = code.substring(1, code.length-1) 
		return code.normalize.toHtml
	}
	
	def toHtml(String input){
		input.replaceAll("<", "&lt;").replaceAll(">", "&gt;")
	}
	
	def serialize(EObject obj){
		val node = NodeModelUtils::getNode(obj)
		return node.text
	}
	
	def heading(int level){
		//"h" + (if (level <= 5) level else 5)
		"h3" 
	}
	
	def dispatch asTitle(ExampleGroup exampleGroup){
		exampleGroup.describe.convertToTitle
	}
	 
	def dispatch asTitle(Example example){
		example.describe.convertToTitle
	}
	
	def convertToTitle(String string){
		string.convertToText.toFirstUpper
	}
	
	def convertToText(String string){
		string.convertFromJavaString(true)
	}
	
	def markdown2Html(String string){
		string.markdownToHtml
				.replaceAll("<pre><code>", '<pre class="prettyprint">')
				.replaceAll("</pre></code>", '</pre>')
	}
}

