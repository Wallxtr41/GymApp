package com.example.gymapp2

import androidx.fragment.app.viewModels
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class AchievementFragment : Fragment() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AchievementListAdapter

    private val dummyAchievement: List<Achievement> = listOf(
        Achievement("Workout","Run","Run 10 km","Pending",R.drawable.gym_image),
        Achievement("Rest","Sleep","Sleep 7 hours","Done",R.drawable.gym_image)

    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_achievement, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize RecyclerView
        recyclerView = view.findViewById(R.id.achievement_recycler_view)
        adapter = AchievementListAdapter(dummyAchievement)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter
    }

}

