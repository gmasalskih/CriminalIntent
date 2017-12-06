package com.example.grigoriy.criminalintent.controller

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.grigoriy.criminalintent.Crime
import com.example.grigoriy.criminalintent.CrimeActivity
import com.example.grigoriy.criminalintent.R
import com.example.grigoriy.criminalintent.utils.toFormattedString
import kotlinx.android.synthetic.main.list_item_crime.view.*

class CrimeAdapter(private val crimes: List<Crime>) : RecyclerView.Adapter<CrimeAdapter.CrimeViewHolder>() {
    override fun onBindViewHolder(holder: CrimeViewHolder?, position: Int) {
        holder?.bindView(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): CrimeViewHolder {
        val view = LayoutInflater.from(parent?.context).inflate(R.layout.list_item_crime, parent, false)
        return CrimeViewHolder(view)
    }

    override fun getItemCount() = crimes.size

    inner class CrimeViewHolder(private var view: View) : RecyclerView.ViewHolder(view) {

        fun bindView(position: Int) {
            var crime = crimes[position]
            view.crime_title.text = crime.title
            view.crime_date.text = crime.date.toFormattedString()
            view.crime_solved.visibility = if (crime.solved!!) View.VISIBLE else View.GONE
            view.setOnClickListener {
                view.context.startActivity(CrimeActivity.newIntent(view.context, crime.id))
            }
        }
    }
}