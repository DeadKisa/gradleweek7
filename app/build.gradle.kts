/*
 * This file was generated by the Gradle 'init' task.
 *
 * This project uses @Incubating APIs which are subject to change.
 */

plugins {
    id("gradleweek7.java-application-conventions")
}

dependencies {
    implementation("org.jfree:jfreechart:1.5.3")
}

application {
    // Define the main class for the application.
    mainClass.set("gradleweek7.app.App")
}

tasks.withType<Jar> {
    manifest {
        attributes["Main-Class"] = "gradleweek7.app.App"
    }
}