package com.example.kekodswitchproject.ui.fear

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kekodswitchproject.databinding.FragmentFearBinding
import com.example.kekodswitchproject.ui.disgust.DisgustViewModel

class FearFragment : Fragment() {
    private lateinit var binding: FragmentFearBinding
    private lateinit var viewModel: FearViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = FearViewModel()

        binding = FragmentFearBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }
}
