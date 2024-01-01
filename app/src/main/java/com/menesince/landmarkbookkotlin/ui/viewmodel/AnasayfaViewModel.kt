package com.menesince.landmarkbookkotlin.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.menesince.landmarkbookkotlin.data.entity.Landmark
import com.menesince.landmarkbookkotlin.data.repo.LandmarkRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AnasayfaViewModel : ViewModel() {
    var lRepo = LandmarkRepository()
    var landmarkListesi = MutableLiveData<List<Landmark>>()

    // init yazılmaz ise liste görünmez
    init {
        landmarkListesiGetir()
    }

    fun landmarkListesiGetir() {
        CoroutineScope(Dispatchers.Main).launch {
            landmarkListesi.value = lRepo.landmarkListesiGetir()
        }
    }
}