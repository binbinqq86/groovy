package com.tb.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

import groovy.lang.Closure;

public class TbJavaPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        System.out.println("this is a java plugin...");
    }
}
