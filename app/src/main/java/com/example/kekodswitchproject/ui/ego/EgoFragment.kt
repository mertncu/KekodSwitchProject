package com.example.kekodswitchproject.ui.ego

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.app.AlertDialog
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.kekodswitchproject.R
import com.example.kekodswitchproject.databinding.FragmentEgoBinding
import com.example.kekodswitchproject.ui.anger.AngerFragment
import com.example.kekodswitchproject.ui.disgust.DisgustFragment
import com.example.kekodswitchproject.ui.fear.FearFragment
import com.example.kekodswitchproject.ui.joy.JoyFragment
import com.example.kekodswitchproject.ui.sadness.SadnessFragment

class EgoFragment : Fragment() {

    private var _binding: FragmentEgoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEgoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupSwitchListeners()
        setupBottomNavigation()
    }

    private fun setupSwitchListeners() {
        binding.switchEgo.setOnCheckedChangeListener { _, isChecked ->
            handleEgoSwitchChange(isChecked)
        }

        val switches = listOf(
            binding.switch1,
            binding.switch2,
            binding.switch3,
            binding.switch4,
            binding.switch5
        )

        switches.forEach { switch ->
            switch.setOnCheckedChangeListener { _, _ -> updateSwitchesAndNavigation() }
        }
    }

    private fun handleEgoSwitchChange(isEgoChecked: Boolean) {
        toggleSwitches(isEgoChecked)
        if (isEgoChecked) {
            disableAllOtherSwitches()
        }
        updateBottomNavigation()
    }

    private fun toggleSwitches(isEgoChecked: Boolean) {
        val enabled = !isEgoChecked
        binding.apply {
            switch1.isEnabled = enabled
            switch2.isEnabled = enabled
            switch3.isEnabled = enabled
            switch4.isEnabled = enabled
            switch5.isEnabled = enabled
            bottomNavigation.visibility = if (enabled) View.VISIBLE else View.GONE
        }
    }

    private fun disableAllOtherSwitches() {
        listOf(
            binding.switch1,
            binding.switch2,
            binding.switch3,
            binding.switch4,
            binding.switch5
        ).forEach { it.isChecked = false }
    }

    private fun updateSwitchesAndNavigation() {
        handleSwitchStates()
        updateBottomNavigation()
    }

    private fun handleSwitchStates() {
        val switches = listOf(
            binding.switch1,
            binding.switch2,
            binding.switch3,
            binding.switch4,
            binding.switch5
        )

        val checkedSwitches = switches.filter { it.isChecked }

        if (checkedSwitches.size >= 4) {
            val remainingSwitch = switches.first { !checkedSwitches.contains(it) }
            remainingSwitch.isEnabled = false
            Toast.makeText(
                requireContext(), "Only 4 switches can be active at a time.", Toast.LENGTH_SHORT
            ).show()

        } else {
            switches.forEach { it.isEnabled = true }
        }
    }

    private fun updateBottomNavigation() {
        val menu: Menu = binding.bottomNavigation.menu
        menu.clear()
        addMenuItems(menu)
        selectFirstItemIfAvailable(menu)
    }

    private fun addMenuItems(menu: Menu) {
        if (!binding.switchEgo.isChecked) {
            menu.add(Menu.NONE, R.id.egoItem, Menu.NONE, "Ego").setIcon(R.drawable.ic_ego)
        }

        val switches = listOf(
            binding.switch1 to R.id.angerItem,
            binding.switch2 to R.id.disgustItem,
            binding.switch3 to R.id.joyItem,
            binding.switch4 to R.id.fearItem,
            binding.switch5 to R.id.sadnessItem
        )

        switches.filter { it.first.isChecked }
            .take(5)
            .forEach { (switch, itemId) ->
                menu.add(Menu.NONE, itemId, Menu.NONE, getMenuTitle(itemId)).setIcon(getMenuIcon(itemId))
            }
    }

    private fun getMenuTitle(itemId: Int): String {
        return when (itemId) {
            R.id.angerItem -> "Anger"
            R.id.disgustItem -> "Disgust"
            R.id.joyItem -> "Joy"
            R.id.fearItem -> "Fear"
            R.id.sadnessItem -> "Sadness"
            else -> ""
        }
    }

    private fun getMenuIcon(itemId: Int): Int {
        return when (itemId) {
            R.id.angerItem -> R.drawable.ic_anger
            R.id.disgustItem -> R.drawable.ic_disgust
            R.id.joyItem -> R.drawable.ic_joy
            R.id.fearItem -> R.drawable.ic_fear
            R.id.sadnessItem -> R.drawable.ic_sad
            else -> 0
        }
    }

    private fun selectFirstItemIfAvailable(menu: Menu) {
        if (menu.size() > 0) {
            binding.bottomNavigation.selectedItemId = menu.getItem(0).itemId
        }
    }

    private fun setupBottomNavigation() {
        binding.bottomNavigation.setOnNavigationItemSelectedListener { menuItem ->
            handleNavigationItemSelected(menuItem.itemId)
        }
    }

    private fun handleNavigationItemSelected(itemId: Int): Boolean {
        return when (itemId) {
            R.id.angerItem -> navigateToFragment(AngerFragment())
            R.id.disgustItem -> navigateToFragment(DisgustFragment())
            R.id.joyItem -> navigateToFragment(JoyFragment())
            R.id.fearItem -> navigateToFragment(FearFragment())
            R.id.disgustItem -> navigateToFragment(SadnessFragment())
            R.id.egoItem -> true
            else -> false
        }
    }

    private fun navigateToFragment(fragment: Fragment): Boolean {
        if (binding.switchEgo.isChecked) return false
        parentFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .addToBackStack(null)
            .commit()
        return true
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
