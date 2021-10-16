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

// ./gradlew :sub:buildSrcExternalTask
tasks.create<ru.somarov.BuildSrcExternalTask>("buildSrcExternalTask") {
    externalNickname = "Kotiln admin"
    doLast { println("Do last from Kotiln DSL!") }
}
