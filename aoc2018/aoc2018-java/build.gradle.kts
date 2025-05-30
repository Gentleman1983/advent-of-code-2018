dependencies {
    api(project(":aoc-utils"))

    implementation(aoc2018Libs.commons.codec)
    implementation(aoc2018Libs.commons.lang3)

    testImplementation(aoc2018Libs.equalsverifier)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.named<Jar>("jar") {
    manifest {
        attributes["Implementation-Title"] = project.name
        attributes["Implementation-Version"] = project.version
    }
}
