package com.example.hackathon_lakemcmurtry

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.Spinner

class MapSpinnerActivity : Activity(), AdapterView.OnItemSelectedListener {

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {

    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }

    val spinner: Spinner = findViewById(com.example.hackathon_lakemcmurtry.R.id.map_spinner)

}