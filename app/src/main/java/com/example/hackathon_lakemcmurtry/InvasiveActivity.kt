package com.example.hackathon_lakemcmurtry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class InvasiveActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Invasive Species"
        setContentView(R.layout.activity_invasive)
    }
}