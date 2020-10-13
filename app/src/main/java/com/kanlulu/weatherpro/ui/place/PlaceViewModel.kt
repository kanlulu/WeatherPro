package com.kanlulu.weatherpro.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.kanlulu.weatherpro.logic.Repository
import com.kanlulu.weatherpro.logic.model.Place

/**
 * author:kanlulu
 * data  :2020-10-12 16:21
 **/
class PlaceViewModel : ViewModel() {
    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLiveData = Transformations.switchMap(searchLiveData) { query ->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }
}