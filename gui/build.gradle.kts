plugins {
    java
    application
    id("com.github.johnrengelman.shadow") version "7.1.0"
}

application {
    mainClass.set("emojifier.gui.GUI")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

dependencies {
    implementation(project(":core"))

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}
