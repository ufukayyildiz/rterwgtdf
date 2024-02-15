plugins {
    kotlin("jvm") version "1.5.10"
}

group = "ghjhgjh"
version = property("version").toString()

repositories {
    mavenCentral()
    maven(url = "https://dl.equo.dev/sdk/mvn/release")
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("com.equo:com.equo.starter.bom:+")
    implementation("org.jetbrains.kotlin:kotlin-osgi-bundle:1.5.10")
}
