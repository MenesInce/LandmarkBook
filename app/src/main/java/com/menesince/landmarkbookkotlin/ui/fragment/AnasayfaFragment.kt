package com.menesince.landmarkbookkotlin.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.menesince.landmarkbookkotlin.R
import com.menesince.landmarkbookkotlin.databinding.FragmentAnasayfaBinding
import com.menesince.landmarkbookkotlin.data.entity.Landmark
import com.menesince.landmarkbookkotlin.ui.adapter.LandmarkAdapter
import com.menesince.landmarkbookkotlin.ui.viewmodel.AnasayfaViewModel

class AnasayfaFragment : Fragment() {
 private lateinit var binding: FragmentAnasayfaBinding
 private lateinit var viewModel: AnasayfaViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_anasayfa, container, false)
        binding.anasayfaFragmentListesi = this


        viewModel.landmarkListesi.observe(viewLifecycleOwner) {
            val landmarkAdapter = LandmarkAdapter(requireContext(),it)
            binding.landmarkAdapter = landmarkAdapter
        }




        return binding.root

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel : AnasayfaViewModel by viewModels()
        viewModel = tempViewModel
    }
}