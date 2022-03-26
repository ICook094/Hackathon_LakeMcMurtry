package com.example.hackathon_lakemcmurtry.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.hackathon_lakemcmurtry.databinding.FragmentMoreinformationBinding

class MoreInformationFragment : Fragment() {

    private var _binding: FragmentMoreinformationBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(MenuViewModel::class.java)

        _binding = FragmentMoreinformationBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textMoreInformation
        notificationsViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}