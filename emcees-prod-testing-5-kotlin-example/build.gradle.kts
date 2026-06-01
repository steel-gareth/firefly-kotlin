plugins {
    id("emcees-prod-testing-5.kotlin")
    application
}

dependencies {
    implementation(project(":emcees-prod-testing-5-kotlin-core"))
    implementation(project(":emcees-prod-testing-5-kotlin-client-okhttp"))
}

application {
    // Use `./gradlew :emcees-prod-testing-5-kotlin-example:run` to run `Main`
    // Use `./gradlew :emcees-prod-testing-5-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.configure_me_emcees_prod_testing_5.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
