package com.example.myandroid.navigation

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TwoModel(
    val name: String
) : Parcelable