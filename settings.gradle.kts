pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Weather"
include(":app")

include(":feature:weather")
include(":feature:locations")
include(":feature:settings")
include(":core:design")
include(":core:network")
include(":core:database")
include(":core:data")
