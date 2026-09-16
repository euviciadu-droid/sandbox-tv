// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
    alias(libs.plugins.android.library) apply false
    alias(libs.plugins.kotlinAndroid) apply false
}

extra["compileSdkVersion"] = 34
extra["buildToolsVersion"] = "34.0.0"
extra["targetSdkVersion"] = 34
extra["blackReflection"] = "1.1.4"
