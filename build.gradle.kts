plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit:junit:4.13.2")
}

group = "com.jakewharton.android.repackaged"
version = "HEAD-SNAPSHOT"
description = "platform/dalvik dx"

sourceSets {
    main.get().java.srcDir("platform_dalvik/dx/src")
    test.get().java.srcDir("platform_dalvik/dx/junit-tests")
}

java {
    withJavadocJar()
    withSourcesJar()

    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
}

tasks.javadoc {
    (options as CoreJavadocOptions).addStringOption("Xdoclint:none", "-quiet")
}