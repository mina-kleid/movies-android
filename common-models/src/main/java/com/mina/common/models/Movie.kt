package com.mina.common.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
public data class Movie constructor(
    val title: String,
    val director: String,
    val year: String,
    val description: String,
    val rating: String,
    val posterUrl: String
    ): Parcelable