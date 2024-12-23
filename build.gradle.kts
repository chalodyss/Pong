/* Copyright (c) 2024, Charles T. */

group   = "abitodyssey.pong"
version = "1.0.0"

plugins {
    application
    id("org.javamodularity.moduleplugin") version "1.8.15"
    id("org.openjfx.javafxplugin") version "0.1.0"
    id("org.beryx.jlink") version "3.0.0"
}

repositories {
    mavenCentral()
}

application {
    mainClass   = "abitodyssey.pong.Main"
    mainModule  = "pong"
}

javafx {
    modules("javafx.graphics", "javafx.controls", "javafx.fxml", "javafx.media")
}

tasks.withType<Jar> {
    archiveBaseName = "Pong"

    manifest {
        attributes["Main-Class"] = "abitodyssey.pong.Main"
    }
}

jlink {
    options = listOf("--strip-debug", "--no-header-files", "--no-man-pages", "--bind-services")

    launcher {
        name = "pong"
    }
}
