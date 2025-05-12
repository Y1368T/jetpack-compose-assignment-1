plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    id("org.jetbrains.kotlin.plugin.compose")
}

android {
    namespace = "com.example.courselistapp"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.example.courselistapp"
        minSdk = 21
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    buildFeatures {
        compose = true  // Enables Jetpack Compose
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    composeOptions {
        kotlinCompilerExtensionVersion = "1.4.3" // Match with Kotlin version
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
}

dependencies {
    // Core Compose dependencies
    implementation("androidx.compose.material:material-icons-core:1.5.0") // For icons
    implementation("androidx.compose.ui:ui:1.5.0")
    implementation ("com.google.android.material:material:1.9.0")
    implementation("androidx.compose.material:material-icons-extended:1.5.0")
    implementation("androidx.compose.material3:material3:1.1.1")
    implementation("androidx.activity:activity-compose:1.7.2")
    implementation("androidx.compose.ui:ui-tooling-preview:1.5.0")
    implementation ("androidx.compose.material3:material3:1.1.1")
    // or for Views:
    implementation ("androidx.compose.material3:material3:1.1.1")
    implementation(libs.androidx.work.runtime.ktx)
    debugImplementation("androidx.compose.ui:ui-tooling:1.5.4")
    implementation ("androidx.activity:activity-compose:1.8.0")
    implementation ("androidx.compose.ui:ui:1.5.4")
    implementation ("androidx.compose.material3:material3:1.1.2")
    implementation ("androidx.compose.ui:ui:1.5.4")
    implementation ("androidx.compose.ui:ui-tooling:1.5.4")
    implementation ("androidx.compose.foundation:foundation:1.5.4")
    debugImplementation ("androidx.compose.ui:ui-tooling-preview:1.5.4")

}