package com.example.hackathon_lakemcmurtry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class EduActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Educational Information"
        setContentView(R.layout.activity_edu)
    }
}