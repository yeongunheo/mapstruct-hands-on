tasks.getByName("bootJar") {
    enabled = false
}

tasks.getByName("jar") {
    enabled = true
}

dependencies {
    implementation("org.mapstruct:mapstruct:1.3.1.Final")
    implementation("org.projectlombok:lombok:1.18.20")
    implementation("org.projectlombok:lombok-mapstruct-binding:0.2.0")
    implementation("org.mapstruct:mapstruct-processor:1.3.1.Final")
}