apply(plugin = "java-library")

dependencies {
    "testImplementation"("junit:junit:4.13.1")
    "testImplementation"("com.codeborne:selenide:5.16.2")
    "testRuntimeOnly"("org.slf4j:slf4j-simple:1.7.30")
}

repositories {
    jcenter()
}

configurations {
    "implementation" {
        resolutionStrategy.failOnVersionConflict()
    }
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}

tasks {
    named<Test>("test") {
        testLogging.showExceptions = true
    }
}
