package com.example.hackathon_lakemcmurtry

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.hackathon_lakemcmurtry.databinding.ActivityMainBinding

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

//        val maps = resources.getStringArray(R.array.map_spinner)
//        val mapspinner: Spinner = findViewById(R.id.map_spinner)
//        if(mapspinner != null) {
//            ArrayAdapter.createFromResource(
//                this,
//                R.array.map_spinner,
//                android.R.layout.simple_spinner_dropdown_item
//            ).also { adapter ->
//                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//                mapspinner.adapter = adapter
//            }
//        }

    }

}