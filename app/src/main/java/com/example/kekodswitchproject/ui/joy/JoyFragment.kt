package com.example.kekodswitchproject.ui.joy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kekodswitchproject.R
import com.example.kekodswitchproject.databinding.FragmentJoyBinding


class JoyFragment : Fragment(R.layout.fragment_joy) {

    private lateinit var binding: FragmentJoyBinding
    private lateinit var viewModel: JoyViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = JoyViewModel()

        binding = FragmentJoyBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }

}