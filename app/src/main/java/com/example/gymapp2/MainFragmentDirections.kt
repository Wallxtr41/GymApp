package com.example.gymapp2

import androidx.navigation.NavController

enum class FragmentName{
    Achievement,Profile,Main
}

class MainFragmentDirections(private val navController: NavController) {

    fun navigateToDestination(from: FragmentName, to: FragmentName) {
        when (from) {
            FragmentName.Profile -> navigateFromProfile(to)
            FragmentName.Achievement -> navigateFromAchievement(to)
            FragmentName.Main -> navigateFromMain(to)
        }
    }

    private fun navigateFromProfile(to: FragmentName) {
        when (to) {
            FragmentName.Profile -> println("Already In Profile")
            FragmentName.Achievement -> navController.navigate(R.id.action_profileFragment_to_achievementFragment)
            FragmentName.Main -> navController.navigate(R.id.action_profileFragment_to_mainFragment)
        }
    }

    private fun navigateFromAchievement(to: FragmentName) {
        when (to) {
            FragmentName.Achievement -> println("Already in Achievement")
            FragmentName.Profile -> navController.navigate(R.id.action_achievementFragment_to_profileFragment)
            FragmentName.Main -> navController.navigate(R.id.action_achievementFragment_to_mainFragment)
        }
    }

    private fun navigateFromMain(to: FragmentName) {
        when (to) {
            FragmentName.Main -> println("Already in Main")
            FragmentName.Achievement -> navController.navigate(R.id.action_mainFragment_to_achievementFragment)
            FragmentName.Profile -> navController.navigate(R.id.action_mainFragment_to_profileFragment)
        }
    }

}