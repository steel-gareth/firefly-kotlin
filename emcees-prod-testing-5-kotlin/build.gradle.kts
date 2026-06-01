plugins {
    id("emcees-prod-testing-5.kotlin")
    id("emcees-prod-testing-5.publish")
}

dependencies {
    api(project(":emcees-prod-testing-5-kotlin-client-okhttp"))
}

// Redefine `dokkaHtml` to:
// - Depend on the root project's task for merging the docs of all the projects
// - Forward that task's output to this task's output
tasks.named("dokkaHtml").configure {
    actions.clear()

    val dokkaHtmlCollector = rootProject.tasks["dokkaHtmlCollector"]
    dependsOn(dokkaHtmlCollector)

    val outputDirectory = project.layout.buildDirectory.dir("dokka/html")
    doLast {
        copy {
            from(dokkaHtmlCollector.outputs.files)
            into(outputDirectory)
            duplicatesStrategy = DuplicatesStrategy.INCLUDE
        }
    }

    outputs.dir(outputDirectory)
}
