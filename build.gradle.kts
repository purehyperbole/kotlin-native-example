plugins {
    kotlin("multiplatform") version "1.3.71"
    kotlin("plugin.serialization") version "1.3.71"
}

repositories {
    mavenCentral()
    jcenter()
}

kotlin {
    macosX64()
    linuxX64("native") {
        val main by compilations.getting

        binaries {
            sharedLib {
                baseName = "native"
            }
        }
    }

    sourceSets {
        val nativeMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime-native:0.20.0")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
            }
        }
    }
}


tasks.withType<Wrapper> {
    gradleVersion = "5.3.1"
    distributionType = Wrapper.DistributionType.ALL
}
