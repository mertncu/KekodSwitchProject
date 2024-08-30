package com.example.kekodswitchproject.ui.disgust

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kekodswitchproject.databinding.FragmentDisgustBinding

class DisgustFragment : Fragment() {

    private lateinit var binding: FragmentDisgustBinding
    private lateinit var viewModel: DisgustViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = DisgustViewModel()

        binding = FragmentDisgustBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }
}