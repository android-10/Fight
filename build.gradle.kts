import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.4.32"
}

group = "me.wilynlee"
version = "1.4.20-SNAPSHOT"



repositories {
    mavenCentral()
}

dependencies {

    testImplementation(kotlin("test-junit"))

    implementation("org.jetbrains.kotlin:kotlin-reflect:1.4.32")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}