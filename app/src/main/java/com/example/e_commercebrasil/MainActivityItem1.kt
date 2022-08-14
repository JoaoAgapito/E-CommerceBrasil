package com.example.e_commercebrasil

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.widget.Button
import android.widget.Toast
import com.example.e_commercebrasil.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivityItem1 : AppCompatActivity() {
        private lateinit var button1 : Button
        private lateinit var carbutton: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setTheme(R.style.Theme_EcommerceBrasil_NoActionBar)
        setContentView(R.layout.activity_main_item1)

        button1 = findViewById(R.id.buttonItem1)
        carbutton = findViewById(R.id.btn_floating)

        button1.setOnClickListener {
            Toast.makeText(this,"Produto adicionado ao carrinho", Toast.LENGTH_LONG).show()
        }

        carbutton.setOnClickListener {
            layoutInflater.inflate(1, parent, false)
        }



    }
}

private fun LayoutInflater.inflate(mainSlotItem: Int, parent: Activity?, b: Boolean) {
    when (1) {
        1 -> {
            val intent = Intent(this@MainActivity, MainActivityItem1::class.java)
            startActivity(intent)
}
