plugins {
    kotlin("jvm") version "1.5.31"
}

group = "ru.somarov"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
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