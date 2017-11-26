package com.example.grigoriy.criminalintent

import java.util.*

data class Crime(val id: UUID = UUID.randomUUID(), var title: String?="", var date: Date = Date(), var solved: Boolean?=false)