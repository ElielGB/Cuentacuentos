package com.example.cuentacuentos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnComenzar = findViewById<Button>(R.id.btnComenzar)

        btnComenzar.setOnClickListener {
            val intent = Intent(this,Acceso::class.java)
            startActivity(intent)
        }
    }
}