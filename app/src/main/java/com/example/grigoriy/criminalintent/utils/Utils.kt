package com.example.grigoriy.criminalintent.utils

import java.util.*

fun Date.toFormattedString()= android.text.format.DateFormat.format("dd.MM.yyyy hh:mm", this)