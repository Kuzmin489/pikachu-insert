package com.github.kuzmin489.pikachuinsert.services

import com.intellij.openapi.project.Project
import com.github.kuzmin489.pikachuinsert.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
