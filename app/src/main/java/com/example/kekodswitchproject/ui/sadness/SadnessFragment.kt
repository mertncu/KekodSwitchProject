package com.example.kekodswitchproject.ui.sadness

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kekodswitchproject.R
import com.example.kekodswitchproject.databinding.FragmentFearBinding
import com.example.kekodswitchproject.databinding.FragmentSadnessBinding
import com.example.kekodswitchproject.ui.fear.FearViewModel


class SadnessFragment : Fragment(R.layout.fragment_sadness) {
    private lateinit var binding: FragmentSadnessBinding
    private lateinit var viewModel: SadnessViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = SadnessViewModel()

        binding = FragmentSadnessBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }
}