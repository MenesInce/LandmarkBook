package com.menesince.landmarkbookkotlin.ui.viewmodel

import androidx.lifecycle.ViewModel
import com.menesince.landmarkbookkotlin.data.repo.LandmarkRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class DetayViewModel @Inject constructor(var lRepo : LandmarkRepository): ViewModel() {
}