package com.example.hackathon_lakemcmurtry

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.app.Activity
import android.net.Uri
import android.widget.RadioButton
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.hackathon_lakemcmurtry.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

//const val EXTRA_MESSAGE = "com.example.hackathon_lakemcmurtry.MESSAGE"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = binding.navView

        val navController = findNavController(R.id.nav_host_fragment_activity_main)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(
            setOf(
                R.id.navigation_home, R.id.navigation_map, R.id.navigation_RSVPParking, R.id.navigation_support, R.id.navigation_about
            )
        )
        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)

        val fab: View = findViewById(com.example.hackathon_lakemcmurtry.R.id.fab)
        fab.setOnClickListener { view ->
            Toast.makeText(getApplicationContext(), "Contacting Emergency Services", Toast.LENGTH_LONG).show()
            val intent : Intent = Intent(Intent.ACTION_DIAL)
            intent.setData(Uri.parse("tel:18329204035"))
            startActivity(intent)
        }
//        val mapspinner: Spinner = findViewById(R.id.map_spinner)!!
//        ArrayAdapter.createFromResource(
//            this,
//            R.array.map_spinner,
//            android.R.layout.simple_spinner_dropdown_item
//        ).also { adapter ->
//            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//            mapspinner.adapter = adapter
//        }


    }
    fun genInfoActivity(view: View) {
        // Do something in response to button
        //val editText = findViewById<EditText>(R.id.editTextTextPersonName)
        //val message = editText.text.toString()
        val intent = Intent(this, GenInfoActivity::class.java).apply {
            //  putExtra(EXTRA_MESSAGE, "test")
        }
        startActivity(intent)
    }
    fun genCampsiteActivity(view: View) {
        val intent1 = Intent(this, GenCampsiteActivity::class.java).apply {
           // putExtra(EXTRA_MESSAGE, "test")
        }
        startActivity(intent1)
    }
    fun genEastRVCampsiteActivity(view: View) {
        val intent4 = Intent(this, EastRVCampsiteActivity::class.java).apply {
            // putExtra(EXTRA_MESSAGE, "test")
        }
        startActivity(intent4)
    }
    fun genWestRVCampsiteActivity(view: View) {
        val intent5 = Intent(this, WestRVCampsiteActivity::class.java).apply {
            // putExtra(EXTRA_MESSAGE, "test")
        }
        startActivity(intent5)
    }


    fun getRules(view: View) {
        val intent2 = Intent(this, RuleActivity::class.java).apply {

        }
        startActivity(intent2)
    }
}