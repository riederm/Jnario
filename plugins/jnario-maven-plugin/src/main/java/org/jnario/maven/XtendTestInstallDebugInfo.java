package org.jnario.maven;

import static org.apache.maven.plugins.annotations.LifecyclePhase.PROCESS_TEST_CLASSES;
import static org.apache.maven.plugins.annotations.ResolutionScope.COMPILE;

import org.apache.maven.plugins.annotations.Mojo;

/**
 * Goal which installs debug information into Java class files that have been generated from Jnario.
 * @deprecated use org.jnario.maven.JnarioTestInstallDebugInfo 
 * @author Moritz Eysholdt - Initial contribution and API
 */
@Mojo(name = "xtend-test-install-debug-info", defaultPhase = PROCESS_TEST_CLASSES, requiresDependencyResolution = COMPILE)
@Deprecated
public class XtendTestInstallDebugInfo extends JnarioTestInstallDebugInfo {
}
