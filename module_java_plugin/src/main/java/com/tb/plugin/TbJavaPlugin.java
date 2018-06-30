package com.tb.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

import groovy.lang.Closure;

public class TbJavaPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
//        project.task("tb", new Closure(this) {
//            @Override
//            public void run() {
//                super.run();
//                System.out.println("this is a javaPlugin...");
//            }
//        });
        System.out.println("this is a javaPlugin...");

    }
}
