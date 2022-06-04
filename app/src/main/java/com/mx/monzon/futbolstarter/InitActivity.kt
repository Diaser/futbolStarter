package com.mx.monzon.futbolstarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mx.monzon.futbolstarter.databinding.ActivityInitBinding
import timber.log.Timber

class InitActivity : AppCompatActivity() {

    private lateinit var binding : ActivityInitBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("EDMM onCreate")
        binding = ActivityInitBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Esta actividad planea actualizar a ViewPager2
    }
}