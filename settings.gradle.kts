plugins {
    id("com.gradle.develocity") version("4.0.2")
}

rootProject.name = "advent-of-code-2018"

include("aoc2018")
include("aoc2018:aoc2018-java")
include("aoc2018:aoc2018-kotlin")

include("utils")
include("utils:utils-java")
include("utils:utils-kotlin")
