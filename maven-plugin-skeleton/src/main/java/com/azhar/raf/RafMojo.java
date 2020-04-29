package com.azhar.raf;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

import javax.inject.Inject;

/***
 * Skeleton RAF scanner results
 */
@Mojo(name="runScan",defaultPhase = LifecyclePhase.INITIALIZE)
public class RafMojo extends AbstractMojo{

    @Parameter(property = "git.command",defaultValue = "git rev-parse --short HEAD")
    private String command;

    /***
     *
     */
    @Parameter(property = "project", readonly = true)
    private MavenProject project;

    @Inject
    ResultProvider resultProvider;
    public void execute() throws MojoExecutionException, MojoFailureException {

        String result = resultProvider.getVersion(command);
        project.getProperties().put("exampleVersion",result);

    getLog().info("Scan Complete "+result);
    }


}
