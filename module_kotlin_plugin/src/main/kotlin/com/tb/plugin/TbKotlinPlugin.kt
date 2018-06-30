package com.tb.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class TbKotlinPlugin : Plugin<Project> {
    override fun apply(p0: Project?) {
        println("this is kotlin plugin...")
    }
}
