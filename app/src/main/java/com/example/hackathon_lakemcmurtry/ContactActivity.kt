package com.example.hackathon_lakemcmurtry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class ContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Contact Information"
        setContentView(R.layout.activity_contact)
    }
}