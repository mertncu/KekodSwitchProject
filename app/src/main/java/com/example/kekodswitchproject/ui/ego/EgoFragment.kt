package com.example.kekodswitchproject.ui.ego

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import androidx.core.view.size
import androidx.fragment.app.Fragment
import com.example.kekodswitchproject.R
import com.example.kekodswitchproject.databinding.FragmentEgoBinding
import com.example.kekodswitchproject.ui.MainActivity


class EgoFragment : Fragment() {

    private lateinit var binding: FragmentEgoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentEgoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val menu = (activity as MainActivity).menu



        binding.switchEgo.setOnCheckedChangeListener { _, isChecked ->
            (activity as? MainActivity)?.setBottomNavigationVisibility(!isChecked)
            if (isChecked) {

                menu.removeItem(R.id.angerFragment)
                menu.removeItem(R.id.disgustFragment)
                menu.removeItem(R.id.fearFragment)
                menu.removeItem(R.id.joyFragment)
                menu.removeItem(R.id.sadnessFragment)

                with(binding) {
                    switch1.isEnabled = false
                    switch2.isEnabled = false
                    switch3.isEnabled = false
                    switch4.isEnabled = false
                    switch5.isEnabled = false

                    switch1.isChecked = false
                    switch2.isChecked = false
                    switch3.isChecked = false
                    switch4.isChecked = false
                    switch5.isChecked = false
                }
            } else {


                binding.switch1.isEnabled = true
                binding.switch2.isEnabled = true
                binding.switch3.isEnabled = true
                binding.switch4.isEnabled = true
                binding.switch5.isEnabled = true
            }


        }


        binding.switch1.setOnCheckedChangeListener { _, isChecked ->

            clickItems(
                menu,
                isChecked,
                R.id.angerFragment,
                "Anger",
                R.drawable.ic_anger,
            )


        }

        binding.switch2.setOnCheckedChangeListener { _, isChecked ->

            clickItems(
                menu, isChecked,
                R.id.disgustFragment,
                "Disgust",
                R.drawable.ic_disgust
            )


        }

        binding.switch3.setOnCheckedChangeListener { _, isChecked ->

            clickItems(
                menu,
                isChecked,
                R.id.fearFragment,
                "Fear",
                R.drawable.ic_fear,
            )
        }

        binding.switch4.setOnCheckedChangeListener { _, isChecked ->

            clickItems(
                menu,
                isChecked,
                R.id.joyFragment,
                "Joy",
                R.drawable.ic_joy,
            )


        }

        binding.switch5.setOnCheckedChangeListener { _, isChecked ->

            clickItems(
                menu,
                isChecked,
                R.id.sadnessFragment,
                "Sadness",
                R.drawable.ic_sad,

                )


        }

    }

    fun clickItems(
        menu: Menu,
        isChecked: Boolean,
        fragmentId: Int,
        title: String,
        bottomIcon: Int,

        ) {

        if (menu.size <= 4 && isChecked && menu.findItem(fragmentId) == null) {
            menu.add(Menu.NONE, fragmentId, Menu.NONE, title)
                ?.setIcon(bottomIcon)
        } else if (!isChecked && menu.findItem(fragmentId) != null) {
            menu.removeItem(fragmentId)
        }

    }
}