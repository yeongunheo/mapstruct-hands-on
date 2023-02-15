tasks.getByName("bootJar") {
    enabled = false
}

tasks.getByName("jar") {
    enabled = true
}

dependencies {
    annotationProcessor("org.mapstruct.examples.spi:accessornaming-spi-impl:1.0.0")
}