plugins {
    id("firefly.kotlin")
    application
}

dependencies {
    implementation(project(":firefly-kotlin-core"))
    implementation(project(":firefly-kotlin-client-okhttp"))
}

application {
    // Use `./gradlew :firefly-kotlin-example:run` to run `Main`
    // Use `./gradlew :firefly-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.firefly.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
