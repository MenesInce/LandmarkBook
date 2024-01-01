package com.menesince.landmarkbookkotlin.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.menesince.landmarkbookkotlin.R
import com.menesince.landmarkbookkotlin.databinding.CardTasarimBinding
import com.menesince.landmarkbookkotlin.databinding.FragmentAnasayfaBinding
import com.menesince.landmarkbookkotlin.data.entity.Landmark
import com.menesince.landmarkbookkotlin.ui.fragment.AnasayfaFragmentDirections

class LandmarkAdapter(var mContext : Context, var landmarkList : List<Landmark>)
    : RecyclerView.Adapter<LandmarkAdapter.CardTasarimTutucu>(){

    inner class CardTasarimTutucu (var tasarim : CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding : CardTasarimBinding = DataBindingUtil.inflate(LayoutInflater.from(mContext),R.layout.card_tasarim, parent, false)
        return CardTasarimTutucu(binding)
    }



    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val landmark = landmarkList.get(position)
        val t = holder.tasarim

        t.landmarkNesnesi = landmark

        t.cardViewSatir.setOnClickListener {
            val gecis = AnasayfaFragmentDirections.detayGecis(landmark = landmark)
            Navigation.findNavController(it).navigate(gecis)
        }

    }

    override fun getItemCount(): Int {
        return landmarkList.size
    }
}