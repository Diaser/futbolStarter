package com.mx.monzon.futbolstarter.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.mx.monzon.futbolstarter.R
import com.mx.monzon.futbolstarter.databinding.FragmentScreenSlidePageBinding


class ScreenSlidePageFragment : Fragment() {

    private lateinit var binding : FragmentScreenSlidePageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_screen_slide_page, container, false)
        binding = FragmentScreenSlidePageBinding.inflate(inflater, container, false )
        return binding.root
    }

}