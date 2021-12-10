package com.mx.monzon.futbolstarter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.mx.monzon.futbolstarter.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private lateinit var binding : ActivitySplashBinding
    private var iterator : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = Intent(this, IntroActivity::class.java)

        var animation = AnimationUtils.loadAnimation(this, R.anim.animation)
        animation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(p0: Animation?) {
                //TODO implements
            }

            override fun onAnimationRepeat(p0: Animation?) {
                //TODO implements
            }

            override fun onAnimationEnd(p0: Animation?) {
                Log.i("DAN","pasando por onAnimationEnd")
                startActivity(intent)
            }
        })
        binding.imageViewSplash.startAnimation(animation)
        binding.textViewSplash.startAnimation(animation)
    }
}