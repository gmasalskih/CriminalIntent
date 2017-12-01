package com.example.grigoriy.criminalintent

import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grigoriy.criminalintent.controller.CrimeAdapter
import kotlinx.android.synthetic.main.fragment_crime_list.view.*

class CrimeListFragment : Fragment() {

    private lateinit var crimeRecyclerView: RecyclerView

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        val view = LayoutInflater.from(activity).inflate(R.layout.fragment_crime_list, container, false)
        crimeRecyclerView = view.crime_recycler_view
        crimeRecyclerView.layoutManager = LinearLayoutManager(activity)
        updateUI()
        return view
    }

    private fun updateUI() {
        crimeRecyclerView.adapter = CrimeAdapter(CrimeLab.crimes, activity)
    }
}