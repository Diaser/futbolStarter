package com.mx.monzon.futbolstarter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mx.monzon.futbolstarter.adapters.SliderAdapter
import com.mx.monzon.futbolstarter.databinding.ActivityIntroBinding
import timber.log.Timber

class IntroActivity : AppCompatActivity() {
    private lateinit var binding : ActivityIntroBinding
    private lateinit var slideAdapter: SliderAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.i("EDMM onCreate")
        binding = ActivityIntroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        slideAdapter = SliderAdapter(this)
        binding.viewPager.adapter = slideAdapter

        binding.buttonMainActivity.setOnClickListener({
            startActivity(Intent(this, MainActivity::class.java))
        })


    }
}