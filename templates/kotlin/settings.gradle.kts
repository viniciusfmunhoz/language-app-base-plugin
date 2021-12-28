pluginManagement {
    val artifactoryUrl: String by settings

    repositories {
        mavenLocal()
        gradlePluginPortal()
        maven {
            url = uri(artifactoryUrl)
        }
    }
}
rootProject.name = "{{project_name}}"
include(":app")
include(":provisioning")