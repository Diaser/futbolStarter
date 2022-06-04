package com.mx.monzon.futbolstarter

import android.app.Application
import timber.log.Timber

class ApplicationFut: Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())
    }
}