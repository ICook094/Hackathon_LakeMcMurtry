package com.example.hackathon_lakemcmurtry

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class fragment_mapeast : Fragment() {

    companion object {
        fun newInstance() = fragment_mapeast()
    }

    private lateinit var viewModel: FragmentMapeastViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_mapeast_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(FragmentMapeastViewModel::class.java)
        // TODO: Use the ViewModel
    }

}