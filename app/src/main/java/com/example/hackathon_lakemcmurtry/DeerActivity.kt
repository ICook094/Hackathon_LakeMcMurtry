package com.example.hackathon_lakemcmurtry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DeerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Deer Diversity"
        setContentView(R.layout.activity_deer)
    }
}