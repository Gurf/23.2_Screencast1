package ru.ustyuzhinskiydev.a232_screencast1

import android.app.Application
import android.os.Debug
import timber.log.Timber

class App:Application() {

    override fun onCreate(){
        super.onCreate()
        if (BuildConfig.DEBUG){
            Timber.plant(Timber.DebugTree())
        }
    }
}