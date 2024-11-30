package com.example.gymapp2

import android.content.Context
import android.content.res.Resources
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AchievementViewModel(context: Context) : ViewModel() {
    // TODO: Implement the ViewModel
    private val resources: Resources = context.resources

    private val _achievement = MutableLiveData<Achievement>()
    val achievement: LiveData<Achievement> = _achievement

    // Dummy game data
    private val dummyAchievement = Achievement(
        "Rest","Run","Desc","Pending",R.drawable.gym_image
    )

    // Initialize game data
    init {
        _achievement.value = dummyAchievement
    }
}