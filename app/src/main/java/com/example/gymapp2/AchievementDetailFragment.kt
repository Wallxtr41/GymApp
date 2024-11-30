package com.example.gymapp2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.Glide


class AchievementDetailFragment : Fragment() {

    private lateinit var achievement: Achievement

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_achievement_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Retrieve the Achievement object from arguments
        arguments?.let {
            achievement = it.getSerializable("achievement") as Achievement
        }

        // Use the data in the Achievement object
        // For example, you can display it in TextViews or ImageViews in the layout
        val achievementName = view.findViewById<TextView>(R.id.achievement_name)
        val achievementDesc = view.findViewById<TextView>(R.id.achievement_desc)
        val achievementStatus = view.findViewById<TextView>(R.id.achievement_status)
        val achievementImage = view.findViewById<ImageView>(R.id.achievement_image)

        achievementName.text = achievement.name
        achievementDesc.text = achievement.description
        achievementStatus.text = achievement.status

        // Set the image using Glide or any other image loading library
        Glide.with(view.context)
            .load(achievement.imageResId)
            .into(achievementImage)
    }
}
