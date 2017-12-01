package com.example.grigoriy.criminalintent

import java.util.*

object CrimeLab {
    var crimes = List(100, {
        val crime = Crime()
        crime.title = "Crime #$it"
        crime.solved = it % 2 == 0
        crime
    })

    fun getCrime(id: UUID) = crimes.single { it.id == id }

}