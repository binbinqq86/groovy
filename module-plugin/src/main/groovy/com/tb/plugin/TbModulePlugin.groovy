package com.tb.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class TbModulePlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        println("this is a module plugin...")
    }
}
