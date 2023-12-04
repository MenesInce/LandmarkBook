package com.menesince.landmarkbookkotlin.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.menesince.landmarkbookkotlin.databinding.CardTasarimBinding
import com.menesince.landmarkbookkotlin.databinding.FragmentAnasayfaBinding
import com.menesince.landmarkbookkotlin.entity.Landmark
import com.menesince.landmarkbookkotlin.ui.fragment.AnasayfaFragmentDirections

class LandmarkAdapter(var mContext : Context, var landmarkList : List<Landmark>)
    : RecyclerView.Adapter<LandmarkAdapter.CardTasarimTutucu>(){

    inner class CardTasarimTutucu (var tasarim : CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = CardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }



    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val landmark = landmarkList.get(position)
        val t = holder.tasarim

        t.textViewLandName.text = landmark.name

        t.cardViewSatir.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.detayGecis(landmark = landmark)
            Navigation.findNavController(it).navigate(gecis)
        }

    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }
}