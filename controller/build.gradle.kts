plugins {
    id("java")
}

group = "ru.mirea.lippo"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(project(":models"))

    implementation ("com.google.code.gson:gson:2.9.1")

    implementation("com.intellij:annotations:12.0")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}