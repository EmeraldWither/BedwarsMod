plugins {
    kotlin("jvm") version "2.0.0" apply false
    id("org.polyfrost.multi-version.root")
    id("com.github.johnrengelman.shadow") version "8.1.1" apply false
}

preprocess {
    "1.8.9-forge"(10809, "srg")
}
