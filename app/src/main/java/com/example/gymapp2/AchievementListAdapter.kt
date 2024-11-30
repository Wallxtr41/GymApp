package com.example.gymapp2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class AchievementListAdapter(var achievements: List<Achievement>) :
    RecyclerView.Adapter<AchievementListAdapter.ViewHolder>() {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.item_achievement, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val achievement = achievements[position]

        // Load image using your preferred image loading library (Glide, Picasso, etc.)
        // Example using Glide:
        // Glide.with(holder.itemView)
        //    .load(game.imageUrl)
        //    .into(holder.gameImage)

        holder.achievementCategory.text = achievement.category
        holder.achievementName.text = achievement.name
        holder.achievementDesc.text = achievement.description
        holder.achievementStatus.text = achievement.status

        // Set Image using Glide
        Glide.with(holder.itemView.context)
            .load(achievement.imageResId) // Can also use URL here if image is online
            .into(holder.achievementImage)

        holder.itemView.setOnClickListener {
            // Handle item click event
            val bundle = Bundle().apply {
                putSerializable("achievement", achievement) // Ensure Achievement class implements Serializable
            }

            // Navigate to AchievementDetailFragment
            it.findNavController().navigate(R.id.action_achievementFragment_to_achievementDetailFragment, bundle)

        }
    }

    override fun getItemCount(): Int = achievements.size



    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val achievementCategory: TextView = itemView.findViewById(R.id.achievement_category)
        val achievementName: TextView = itemView.findViewById(R.id.achievement_name)
        val achievementDesc: TextView = itemView.findViewById(R.id.achievement_desc)
        val achievementStatus: TextView = itemView.findViewById(R.id.achievement_status)
        val achievementImage: ImageView = itemView.findViewById(R.id.achievement_image)
    }
}

