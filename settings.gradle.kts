rootProject.name = "cuboid"
includeBuild("dependencies/modulator") {
    dependencySubstitution {
        substitute(module("com.github.ynverxe:modulator"))
                .using(project(":"))
    }
}
includeBuild("dependencies/kerberos") {
    dependencySubstitution {
        substitute(module("com.github.ynverxe:kerberos-universal"))
                .using(project(":kerberos-universal"))
    }
}