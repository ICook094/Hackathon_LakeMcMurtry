package com.example.hackathon_lakemcmurtry.ui.map

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MapViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Lake McMurty West Recreational"
    }
    val text: LiveData<String> = _text
}