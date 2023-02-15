plugins {
    id("java")
    id("org.springframework.boot") version "2.7.7"
    id("io.spring.dependency-management") version "1.0.15.RELEASE"
}

java.sourceCompatibility = JavaVersion.VERSION_17

allprojects {
    group = "com.example"
    version = "0.0.1-SNAPSHOT"

    repositories {
        mavenCentral()
    }
}

repositories {
    mavenCentral()
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")

    dependencies {
        implementation("org.springframework.boot:spring-boot-starter-actuator")
        implementation("org.springframework.boot:spring-boot-starter-data-jpa")

        implementation("org.springframework.boot:spring-boot-starter-validation")
        implementation("org.flywaydb:flyway-core")
        runtimeOnly("com.h2database:h2")
        testImplementation("org.springframework.boot:spring-boot-starter-test") {
            exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
        }

        implementation("org.mapstruct:mapstruct:1.3.1.Final")
        implementation("org.projectlombok:lombok:1.18.20")
        implementation("org.projectlombok:lombok-mapstruct-binding:0.2.0")

        annotationProcessor("org.projectlombok:lombok-mapstruct-binding:0.2.0")
        annotationProcessor("org.mapstruct:mapstruct-processor:1.3.1.Final")
        annotationProcessor("org.projectlombok:lombok:1.18.20")
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}