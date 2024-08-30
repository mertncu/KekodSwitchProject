package com.example.kekodswitchproject.ui.anger

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.kekodswitchproject.databinding.FragmentAngerBinding

class AngerFragment : Fragment() {

    private lateinit var binding: FragmentAngerBinding
    private lateinit var viewModel: AngerViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = AngerViewModel()

        binding = FragmentAngerBinding.inflate(inflater, container, false)
        binding.viewModel = viewModel
        binding.lifecycleOwner = viewLifecycleOwner

        return binding.root
    }
}
