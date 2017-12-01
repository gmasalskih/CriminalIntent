package com.example.grigoriy.criminalintent.controller

import android.content.Context
import android.graphics.Color
import android.support.annotation.ColorLong
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.grigoriy.criminalintent.Crime
import com.example.grigoriy.criminalintent.R
import kotlinx.android.synthetic.main.list_item_crime.view.*

class CrimeAdapter(private val crimes: List<Crime>, private val context: Context) : RecyclerView.Adapter<CrimeAdapter.CrimeViewHolder>() {
    override fun onBindViewHolder(holder: CrimeViewHolder?, position: Int) {
        holder?.bindView(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CrimeViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.list_item_crime, parent, false)
        val superView = LayoutInflater.from(context).inflate(R.layout.list_item_super_crime, parent, false)
        return CrimeViewHolder(view)
    }

    override fun getItemCount() = crimes.size

    inner class CrimeViewHolder(private var view: View) : RecyclerView.ViewHolder(view) {

        fun bindView(position: Int) {
            var crime = crimes.get(position)
            view.crime_title.text = crime.title
            view.crime_date.text = crime.date.toString()
            view.setOnClickListener {
                Toast.makeText(context, crime.title, Toast.LENGTH_SHORT).show()
            }
        }
    }
}