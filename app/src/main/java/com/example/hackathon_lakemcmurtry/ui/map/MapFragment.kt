package com.example.hackathon_lakemcmurtry.ui.map

import android.R
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hackathon_lakemcmurtry.databinding.FragmentMapBinding
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.*
import com.google.maps.android.data.kml.*
import android.widget.ArrayAdapter
import android.widget.AdapterView
import android.widget.AdapterView.OnItemSelectedListener


class MapFragment : Fragment(), AdapterView.OnItemSelectedListener {

    private var _binding: FragmentMapBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val dashboardViewModel =
            ViewModelProvider(this)[MapViewModel::class.java]

        _binding = FragmentMapBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val spinner = view?.findViewById<Spinner>(com.example.hackathon_lakemcmurtry.R.id.map_spinner)
        spinner?.onItemSelectedListener = this

        val ad: ArrayAdapter<*> = ArrayAdapter<Any?>(
            requireContext(),
            android.R.layout.simple_spinner_item,
            com.example.hackathon_lakemcmurtry.R.id.map_spinner)

        ad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner?.adapter = ad
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {
        TODO("Not yet implemented")
    }
}