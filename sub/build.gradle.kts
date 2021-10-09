plugins {
    kotlin("jvm") version "1.5.31"
}

group = "ru.ru.somarov"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.5.31")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "16"
    }
}