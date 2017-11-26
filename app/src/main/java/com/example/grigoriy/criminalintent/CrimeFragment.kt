package com.example.grigoriy.criminalintent

import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_crime.*

class CrimeFragment : Fragment() {

    lateinit var crime: Crime

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        crime = Crime()
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.fragment_crime, container, false)
    }

    override fun onViewCreated(view: View?, savedInstanceState: Bundle?) {
        crime_title.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(chars: CharSequence?, start: Int, before: Int, count: Int) {
//                TODO("not implemented")
            }

            override fun onTextChanged(chars: CharSequence?, start: Int, before: Int, count: Int) {
                crime.title = chars.toString()
            }

            override fun afterTextChanged(p0: Editable?) {
//                TODO("not implemented")
            }
        })
        crime_date.text = crime.date.toString()
        crime_date.isEnabled = false
        crime_solved.setOnCheckedChangeListener { _, isChecked ->
            crime.solved = isChecked
        }
    }
}
