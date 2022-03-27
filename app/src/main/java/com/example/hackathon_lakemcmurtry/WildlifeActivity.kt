package com.example.hackathon_lakemcmurtry

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class WildlifeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wildlife)
    }

    fun TestActivity(view: View) {
        val intent = Intent(this, TestActivity::class.java).apply {

        }
        startActivity(intent)
    }
}