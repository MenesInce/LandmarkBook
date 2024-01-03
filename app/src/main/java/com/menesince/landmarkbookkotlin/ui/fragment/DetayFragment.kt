package com.menesince.landmarkbookkotlin.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.menesince.landmarkbookkotlin.R
import com.menesince.landmarkbookkotlin.databinding.FragmentDetayBinding
import com.menesince.landmarkbookkotlin.data.entity.Landmark
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DetayFragment : Fragment() {
private lateinit var binding: FragmentDetayBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_detay, container, false)

        val bundle : DetayFragmentArgs by navArgs()
        val landmark = bundle.landmark
        binding.landmarkNesnesi = landmark

        binding.imageView.setImageResource(
            resources.getIdentifier(landmark.image.toString(),"drawable",requireContext().packageName)
        )
        //binding.imageView.setImageResource(landmark.image)
//        binding.textViewName.setText(landmark.name)
//        binding.textViewCountry.setText(landmark.country)



        return binding.root

    }
}