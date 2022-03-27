package com.example.hackathon_lakemcmurtry

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class EastRVCampsiteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "East RV Campsite"
        setContentView(R.layout.fragment_eastrv)
        // Get the Intent that started this activity and extract the string
        //val message = intent.getStringExtra(EXTRA_MESSAGE)
        //val message = "Test message"
        val rsvp: View = findViewById(com.example.hackathon_lakemcmurtry.R.id.extedo)

        rsvp.setOnClickListener { view ->
            Toast.makeText(
                getApplicationContext(),
                "RSVPing. . .",
                Toast.LENGTH_SHORT
            ).show()
            val intent: Intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lakemcmurtry.org/reservations.html"))
            startActivity(intent)
        }
        // Capture the layout's TextView and set the string as its text
        //val textView = findViewById<TextView>(R.id.textView).apply {
        //    text = message
        //}
    }
}