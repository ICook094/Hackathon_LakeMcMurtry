package com.example.hackathon_lakemcmurtry.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    private val textLakeMission = MutableLiveData<String>().apply {
        value = "The mission of Lake McMurtry Friends is to enrich the quality of life by providing opportunities to engage in sustainable outdoor recreation, environmental education, and nature conservation."
    }
    val textLakeMissionValue: LiveData<String> = textLakeMission
}