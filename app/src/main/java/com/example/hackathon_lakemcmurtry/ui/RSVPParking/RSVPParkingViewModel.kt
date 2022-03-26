package com.example.hackathon_lakemcmurtry.ui.about

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RSVPParkingViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is RSVP and Parking Fragment"
    }
    val text: LiveData<String> = _text
}