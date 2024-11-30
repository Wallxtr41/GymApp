package com.example.gymapp2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainFragment : Fragment() {


    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: AchievementListAdapter

    private val dummyGames: List<Achievement> = listOf(
        Achievement("Workout","Run","Run 10 km","Pending"),
        Achievement("Rest","Sleep","Sleep 7 hours","Done")

    )


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Initialize RecyclerView
        recyclerView = view.findViewById(R.id.achievement_recycler_view)
        adapter = AchievementListAdapter(dummyGames)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = adapter
    }

}