package com.penguinshunya.hello

import org.gradle.api.DefaultTask
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.tasks.TaskAction

class HelloPlugin : Plugin<Project> {
  override fun apply(target: Project) {
    target.tasks.register("hello", HelloTask::class.java)
  }
}

class HelloTask : DefaultTask() {
  @TaskAction
  fun hello() {
    println("hello")
  }
}
