plugins {
    alias(libs.plugins.android.application)
}

android {
    namespace = "night.owl.aichatbot"
    compileSdk = 34

    defaultConfig {
        applicationId = "night.owl.aichatbot"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    // For making HTTP requests (if using a REST API)
    implementation(libs.converter.gson)
    implementation(libs.gson)
    implementation("com.squareup.okhttp3:okhttp:4.10.0")

    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}