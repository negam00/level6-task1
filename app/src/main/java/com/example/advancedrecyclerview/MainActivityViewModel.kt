package com.example.advancedrecyclerview

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel(){
    private val colourRepository = ColourRepository()

    val colourItems = MutableLiveData<List<ColourItem>>().apply {
        value = colourRepository.getColourItems()
    }
}