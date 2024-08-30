package com.example.kekodswitchproject.ui

import android.os.Bundle
import android.view.Menu
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavOptions
import androidx.navigation.fragment.NavHostFragment
import com.example.kekodswitchproject.R
import com.example.kekodswitchproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    lateinit var menu: Menu


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        menu = binding.bottomNavigationView.menu


        menu.add(Menu.NONE, R.id.egoFragment, Menu.NONE, "Home").setIcon(R.drawable.ic_ego)


        binding.bottomNavigationView.visibility = View.GONE

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHostFragment.navController

        binding.bottomNavigationView.setOnItemSelectedListener { a ->
            costomNavigation(a.itemId, navController)
            true
        }
    }

    fun setBottomNavigationVisibility(visible: Boolean) {
        binding.bottomNavigationView.visibility = if (visible) View.VISIBLE else View.GONE
    }


}

fun costomNavigation(id: Int, navController: NavController) {

    val navOptions = NavOptions.Builder()
        .setLaunchSingleTop(true)
        .setPopUpTo(
            navController.graph.findStartDestination().id,
            false,
            saveState = true
        )
        .setRestoreState(true)
        .build()

    navController.navigate(id, null, navOptions)
}