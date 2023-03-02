package com.mx.monzon.futbolstarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mx.monzon.futbolstarter.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("EDMM onCreate")
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}