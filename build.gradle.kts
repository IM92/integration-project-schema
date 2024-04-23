plugins {
    id("java")
    id("org.openapi.generator")
    id("maven-publish")
    id("net.researchgate.release")
}

group = "org.project-schema"
version = "1.0-SNAPSHOT"


sourceSets {
    main {
        resources {
            srcDirs("src/main/swagger")
        }
    }
}

openApiValidate {
    inputSpec = "$rootDir/src/main/swagger/api.yaml".toString()
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}
