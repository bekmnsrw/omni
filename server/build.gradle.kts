plugins {
    alias(libs.plugins.kotlinJvm)
    alias(libs.plugins.ktor)
}

group = "me.bekmnsrw.omni"
version = "1.0.0"
application {
    mainClass = "me.bekmnsrw.omni.ApplicationKt"
}

dependencies {
    api(project(":core"))

    implementation(libs.ktor.serverCore)
    implementation(libs.ktor.serverNetty)
    implementation(libs.logback)
}
