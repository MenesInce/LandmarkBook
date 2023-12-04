package com.menesince.landmarkbookkotlin.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.menesince.landmarkbookkotlin.R
import com.menesince.landmarkbookkotlin.databinding.FragmentAnasayfaBinding
import com.menesince.landmarkbookkotlin.entity.Landmark
import com.menesince.landmarkbookkotlin.ui.adapter.LandmarkAdapter

class AnasayfaFragment : Fragment() {
private lateinit var binding: FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater, container, false)


        binding.rv.layoutManager = LinearLayoutManager(requireContext())

        val landmarkList = ArrayList<Landmark>()
        val pisa = Landmark("Pisa Tower","İtaly",R.drawable.pisa_tower)
        val eiffel = Landmark("Eiffel Tower","France",R.drawable.eiffel_tower)
        val collesium = Landmark("Collesium","Italy",R.drawable.collesium)
        val londonBridge = Landmark("London Bridge","UK",R.drawable.london_bridge)

        landmarkList.add(pisa)
        landmarkList.add(eiffel)
        landmarkList.add(collesium)
        landmarkList.add(londonBridge)

        val landmarkAdapter = LandmarkAdapter(requireContext(),landmarkList)
        binding.rv.adapter = landmarkAdapter


        return binding.root

    }
}