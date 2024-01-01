package com.menesince.landmarkbookkotlin.data.datasource

import com.menesince.landmarkbookkotlin.R
import com.menesince.landmarkbookkotlin.data.entity.Landmark
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class LandmarkDataSource {

    suspend fun landmarkListesiGetir() : List<Landmark> =
        withContext(Dispatchers.IO) {
            val landmarkList = ArrayList<Landmark>()
            val pisa = Landmark("Pisa Tower","İtaly", R.drawable.pisa_tower)
            val eiffel = Landmark("Eiffel Tower","France", R.drawable.eiffel_tower)
            val collesium = Landmark("Collesium","Italy", R.drawable.collesium)
            val londonBridge = Landmark("London Bridge","UK", R.drawable.london_bridge)

            landmarkList.add(pisa)
            landmarkList.add(eiffel)
            landmarkList.add(collesium)
            landmarkList.add(londonBridge)

            return@withContext landmarkList
        }
}