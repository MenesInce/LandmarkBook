package com.menesince.landmarkbookkotlin.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.menesince.landmarkbookkotlin.data.entity.Landmark
import com.menesince.landmarkbookkotlin.data.repo.LandmarkRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnasayfaViewModel @Inject constructor( var lRepo : LandmarkRepository): ViewModel() {

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