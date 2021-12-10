package com.mx.monzon.futbolstarter.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager.widget.PagerAdapter
import com.mx.monzon.futbolstarter.R
import com.mx.monzon.futbolstarter.databinding.SlideWelcomeBinding

class SliderAdapter(var context: Context) : PagerAdapter(){

    private val layoutInflater: LayoutInflater
    init {
        layoutInflater =  LayoutInflater.from(context)
    }
    var slideBackgrounds : IntArray = intArrayOf(R.drawable.gradient, R.drawable.gradient_second, R.drawable.gradient)
    var slideImages: IntArray = intArrayOf(R.drawable.players, R.drawable.ic_campo_de_futbol, R.drawable.ic_posiciones)
    var slideHeadings = arrayOf(R.string.intro_head_players,R.string.intro_head_field,R.string.intro_head_pos_table)
    var slideDescriptions = arrayOf(R.string.intro_desc_players, R.string.intro_desc_field, R.string.intro_desc_pos_table)


    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object` as (ConstraintLayout)
    }

    override fun getCount(): Int {
        return slideHeadings.size
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val binding = SlideWelcomeBinding.inflate(LayoutInflater.from(context), container, false)

        binding.SlideLayout.setBackgroundResource(slideBackgrounds[position])
        binding.tvSlideHead.setText(slideHeadings[position])
        binding.tvSlideDesc.setText(slideDescriptions[position])
        binding.imageViewSlide.setImageResource(slideBackgrounds[position])
        container.addView(binding.getRoot());
        return binding.getRoot();

    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as ConstraintLayout)
    }
}