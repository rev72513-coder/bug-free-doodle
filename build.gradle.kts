plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "ru.dorozhnayakarta.app"
    compileSdk = 35

    defaultConfig {
        applicationId = "ru.dorozhnayakarta.app"
        minSdk = 23
        targetSdk = 35
        versionCode = 1
        versionName = "0.1.0"
    }
}
