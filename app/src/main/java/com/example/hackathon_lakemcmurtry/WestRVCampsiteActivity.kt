package com.example.hackathon_lakemcmurtry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class WestRVCampsiteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "West RV Campsites"
        setContentView(R.layout.fragment_westrv)
        // Get the Intent that started this activity and extract the string
        //val message = intent.getStringExtra(EXTRA_MESSAGE)
        //val message = "Test message"

        // Capture the layout's TextView and set the string as its text
        //val textView = findViewById<TextView>(R.id.textView).apply {
        //    text = message
        //}
    }
}