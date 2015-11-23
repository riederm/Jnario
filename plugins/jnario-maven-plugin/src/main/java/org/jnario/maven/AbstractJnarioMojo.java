package org.jnario.maven;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;
import org.eclipse.xtext.maven.MavenLog4JConfigurator;
import org.eclipse.xtext.maven.MavenStandaloneBuilderModule;

import com.google.inject.Guice;
import com.google.inject.Inject;

public abstract class AbstractJnarioMojo extends AbstractMojo {

	@Inject
	protected MavenLog4JConfigurator log4jConfigurator;

	/**
	 * The project itself. This parameter is set by maven.
	 */
	@Parameter(property = "project", required = true)
	protected MavenProject project;

	/**
	 * Set this to true to skip compiling Xtend sources.
	 */
	@Parameter(property = "skipXtend", defaultValue = "false")
	protected boolean skipXtend;

	public AbstractJnarioMojo() {
		injectMembers();
	}

	public void execute() throws MojoExecutionException, MojoFailureException {
		if (isSkipped()) {
			getLog().info("skipped.");
		} else {
			log4jConfigurator.configureLog4j(getLog());
			internalExecute();
		}
	}

	protected void injectMembers() {
		Guice.createInjector(new MavenStandaloneBuilderModule()).injectMembers(this);
	}

	protected abstract void internalExecute() throws MojoExecutionException, MojoFailureException;

	protected boolean isSkipped() {
		return skipXtend;
	}

}
