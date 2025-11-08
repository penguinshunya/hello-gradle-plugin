plugins {
  alias(libs.plugins.kotlin.jvm)
  alias(libs.plugins.publish)
}

repositories {
  google()
  mavenCentral()
  gradlePluginPortal()
}

group = "com.penguinshunya"
version = "0.0.10"

gradlePlugin {
  website.set("https://github.com/penguinshunya/hello-gradle-plugin")
  vcsUrl.set("https://github.com/penguinshunya/hello-gradle-plugin")

  plugins {
    create("helloPlugin") {
      id = "com.penguinshunya.hello"
      displayName = "Hello Gradle Plugin by Penguinshunya"
      description = "Personal custom plugin"
      tags.set(listOf("example"))
      implementationClass = "com.penguinshunya.hello.HelloPlugin"
    }
  }
}
