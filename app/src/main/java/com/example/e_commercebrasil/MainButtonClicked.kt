package com.example.e_commercebrasil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainButtonClicked : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_EcommerceBrasil_NoActionBar)
        setContentView(R.layout.activity_main_button_clicked)
    }
}