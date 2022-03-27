package com.example.hackathon_lakemcmurtry

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GenCampsiteActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_campsites)
    }

    fun genEastRVCampsiteActivity(view: View) {
        val intent = Intent(this, EastRVCampsiteActivity::class.java).apply {

        }
        startActivity(intent)
    }

    fun genWestRVCampsiteActivity(view: View) {
        val intent = Intent(this, WestRVCampsiteActivity::class.java).apply {

        }
        startActivity(intent)
    }

    fun genEastTentCampsiteActivity(view: View) {
        val intent = Intent(this, WestRVCampsiteActivity::class.java).apply {

        }
        startActivity(intent)
    }

    fun genWestTentCampsiteActivity(view: View) {
        val intent = Intent(this, WestRVCampsiteActivity::class.java).apply {

        }
        startActivity(intent)
    }





}