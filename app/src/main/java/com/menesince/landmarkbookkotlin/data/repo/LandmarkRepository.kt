package com.menesince.landmarkbookkotlin.data.repo

import com.menesince.landmarkbookkotlin.data.datasource.LandmarkDataSource
import com.menesince.landmarkbookkotlin.data.entity.Landmark

class LandmarkRepository {
    var lds = LandmarkDataSource()

    suspend fun landmarkListesiGetir() : List<Landmark> = lds.landmarkListesiGetir()
}