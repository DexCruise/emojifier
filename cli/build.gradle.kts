plugins {
    java
    application
    id("com.github.johnrengelman.shadow") version "7.1.0"
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

application {
    mainClass.set("emojifier.cli.CLI")
}

dependencies {
    implementation(project(":core"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}
