package com.example.hackathon_lakemcmurtry

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class Donateallurmoneytomeordie : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val browserIntent =
            Intent(Intent.ACTION_VIEW, Uri.parse("https://lakemcmurtry.givingfuel.com/donation"))
        startActivity(browserIntent)
    }
}