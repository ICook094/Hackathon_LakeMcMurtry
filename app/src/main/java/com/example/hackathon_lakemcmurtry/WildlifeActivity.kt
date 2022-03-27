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

    fun BirdActivity(view: View) {
        val intent = Intent(this, BirdActivity::class.java).apply {

        }
        startActivity(intent)
    }

    fun DeerActivity(view: View) {
        val intent = Intent(this, DeerActivity::class.java).apply {

        }
        startActivity(intent)
    }

    fun InvasiveActivity(view: View) {
        val intent = Intent(this, InvasiveActivity::class.java).apply {

        }
        startActivity(intent)
    }
}