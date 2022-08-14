package com.example.e_commercebrasil

import androidx.annotation.StringRes

data class MainItem(
    val id: Int,
    val drawableId: Int,
    @StringRes val textString: Int,
    val price: Int,
    val color: Int,
)
