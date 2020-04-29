package com.azhar.raf;

import org.apache.maven.plugin.MojoExecutionException;

public interface ResultProvider {
    String getVersion(String command) throws MojoExecutionException;
}
