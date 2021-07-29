package com.github.gui44110.plugindemo2.services

import com.github.gui44110.plugindemo2.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
