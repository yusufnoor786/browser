package com.glassbrowser

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class GlassBrowserApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}