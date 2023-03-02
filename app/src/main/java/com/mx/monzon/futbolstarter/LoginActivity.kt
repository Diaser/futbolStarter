package com.mx.monzon.futbolstarter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mx.monzon.futbolstarter.databinding.ActivityLoginBinding
import timber.log.Timber

class LoginActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("EDMM onCreate")
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Esta actividad planea actualizar a ViewPager2


    }
}