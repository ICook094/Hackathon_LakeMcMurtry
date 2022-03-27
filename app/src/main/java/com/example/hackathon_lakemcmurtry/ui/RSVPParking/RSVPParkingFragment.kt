package com.example.hackathon_lakemcmurtry.ui.RSVPParking

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hackathon_lakemcmurtry.databinding.FragmentRsvpparkingBinding

class RSVPParkingFragment : Fragment() {

    private var _binding: FragmentRsvpparkingBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val notificationsViewModel =
            ViewModelProvider(this).get(RSVPParkingViewModel::class.java)

        _binding = FragmentRsvpparkingBinding.inflate(inflater, container, false)

//        val textView: TextView = binding.textMenu
//        notificationsViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}