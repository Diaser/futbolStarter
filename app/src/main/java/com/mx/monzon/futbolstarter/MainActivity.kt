package com.mx.monzon.futbolstarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("EDMM onCreate")
        setContentView(R.layout.activity_main)
    }
}