package com.example.gymapp2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class AchievementDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.item_achievement, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Retrieve data from arguments
        val name = arguments?.getString("name")
        val category = arguments?.getString("category")
        val description = arguments?.getString("description")
        val status = arguments?.getString("status")
        val image = arguments?.getString("image")

        // Set the data to views
        view.findViewById<TextView>(R.id.achievement_name_detail).text = name
        view.findViewById<TextView>(R.id.achievement_category_detail).text = category
        view.findViewById<TextView>(R.id.achievement_desc_detail).text = description
        view.findViewById<TextView>(R.id.achievement_status_detail).text = status
    }
}