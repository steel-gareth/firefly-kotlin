plugins {
    id("more-conflicting.kotlin")
    application
}

dependencies {
    implementation(project(":more-conflicting-kotlin-core"))
    implementation(project(":more-conflicting-kotlin-client-okhttp"))
}

application {
    // Use `./gradlew :more-conflicting-kotlin-example:run` to run `Main`
    // Use `./gradlew :more-conflicting-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.configure_me_emcees_prod_testing_5.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
