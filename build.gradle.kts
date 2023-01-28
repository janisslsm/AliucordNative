task<Delete>("clean") {
    delete(rootProject.buildDir)
}

allprojects {
    repositories {
        google()
    }
}