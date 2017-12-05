package com.example.grigoriy.criminalintent

import android.content.Context
import android.content.Intent
import java.util.*

class CrimeActivity : SingleFragmentActivity() {
    override fun createFragment() = CrimeFragment.newInstance(intent.getSerializableExtra(EXTRA_CRIME_ID) as UUID)

    companion object {
        private val EXTRA_CRIME_ID = "com.bignerdranch.android.criminalintent.crime_id"
        fun newIntent(packageContext: Context, crimeId:UUID): Intent {
            val intent = Intent(packageContext, CrimeActivity::class.java)
            intent.putExtra(EXTRA_CRIME_ID, crimeId)
            return intent
        }
    }


}
