plugins {
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":db"))
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}