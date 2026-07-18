plugins {
    `maven-publish`
    signing
}

configure<PublishingExtension> {
    publications {
        register<MavenPublication>("maven") {
            from(components["java"])

            pom {
                name.set("Firefly III API vv6.6.2")
                description.set("This is the documentation of the Firefly III API. Please report any bugs or\nissues. You may use the \"Authorize\" button to try the API below.\n\nPlease keep in mind that the demo site does **not** accept requests from `curl`,\n`colly`, `wget`, etc. You must use a browser or a tool like Insomnia to make\nyour test requests.\n\nTo learn more about the idiosyncrasies of this API, please read about the API in\nthe\n[Firefly III API documentation](https://docs.firefly-iii.org/references/firefly-iii/api/).\n\n<small>This file was last generated on 2026-04-30 @ 10:00:33\n(Europe/Amsterdam)</small>")
                url.set("https://firefly-iii.org")

                licenses {
                    license {
                        name.set("Apache-2.0")
                    }
                }

                developers {
                    developer {
                        name.set("Firefly")
                        email.set("james@firefly-iii.org")
                    }
                }

                scm {
                    connection.set("scm:git:git://github.com/steel-gareth/firefly-kotlin.git")
                    developerConnection.set("scm:git:git://github.com/steel-gareth/firefly-kotlin.git")
                    url.set("https://github.com/steel-gareth/firefly-kotlin")
                }

                versionMapping {
                    allVariants {
                        fromResolutionResult()
                    }
                }
            }
        }
    }
    repositories {
        if (project.hasProperty("publishLocal")) {
            maven {
                name = "LocalFileSystem"
                url = uri("${rootProject.layout.buildDirectory.get()}/local-maven-repo")
            }
        }
    }
}

signing {
    val signingKeyId = System.getenv("GPG_SIGNING_KEY_ID")?.ifBlank { null }
    val signingKey = System.getenv("GPG_SIGNING_KEY")?.ifBlank { null }
    val signingPassword = System.getenv("GPG_SIGNING_PASSWORD")?.ifBlank { null }
    if (signingKey != null && signingPassword != null) {
        useInMemoryPgpKeys(
            signingKeyId,
            signingKey,
            signingPassword,
        )
        sign(publishing.publications["maven"])
    }
}

tasks.named("publish") {
    dependsOn(":closeAndReleaseSonatypeStagingRepository")
}
