package com.example.gymapp2

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment

class MainActivity : AppCompatActivity() {

    private lateinit var navController: NavController;
    private lateinit var fragControl: MainFragmentDirections;

    private lateinit var mainButton: Button;
    private lateinit var profileButton: Button;
    private lateinit var achievementButton: Button;
    private var currentFragment: FragmentName = FragmentName.Main;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        try {
            this.supportActionBar!!.hide()
        } catch (e: NullPointerException) {}


        setContentView(R.layout.activity_main)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.myNavHostFragment) as NavHostFragment
        navController = navHostFragment.navController
        fragControl = MainFragmentDirections(navController)

        mainButton = findViewById(R.id.mainButton);
        profileButton = findViewById(R.id.profileButton);
        achievementButton = findViewById(R.id.achievementButton);


        profileButton.setOnClickListener {
            fragControl.navigateToDestination(currentFragment, FragmentName.Profile);
            currentFragment = FragmentName.Profile;
        }
        achievementButton.setOnClickListener {
            fragControl.navigateToDestination(currentFragment, FragmentName.Achievement);
            currentFragment = FragmentName.Achievement;
        }
        mainButton.setOnClickListener {
            fragControl.navigateToDestination(currentFragment, FragmentName.Main);
            currentFragment = FragmentName.Main;
        }

    }
}