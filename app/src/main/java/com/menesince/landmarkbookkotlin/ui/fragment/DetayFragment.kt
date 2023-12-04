package com.menesince.landmarkbookkotlin.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.menesince.landmarkbookkotlin.R
import com.menesince.landmarkbookkotlin.databinding.FragmentDetayBinding
import com.menesince.landmarkbookkotlin.entity.Landmark

class DetayFragment : Fragment() {
private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentDetayBinding.inflate(inflater, container, false)

        val bundle : DetayFragmentArgs by navArgs()
        val landmark = bundle.landmark

        binding.imageView.setImageResource(landmark.image)
        binding.textViewName.setText(landmark.name)
        binding.textViewCountry.setText(landmark.country)



        return binding.root

    }
}