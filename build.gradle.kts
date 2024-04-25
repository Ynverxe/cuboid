plugins {
    id("java")
    id("java-library")
}

repositories {
    mavenCentral()
    maven {
        name = "spigotmc-repo"
        url = uri("https://hub.spigotmc.org/nexus/content/repositories/snapshots/")
    }
    maven {
        name = "sonatype"
        url = uri("https://oss.sonatype.org/content/groups/public/")
    }
}

dependencies {
    compileOnly(libs.spigotapi)
    compileOnly(libs.annotations)
    implementation(libs.kerberos)
    implementation(libs.modulator)
}