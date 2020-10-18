package com.example.cuentacuentos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_menu.*

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val btnCuentoUno = findViewById<ImageButton>(R.id.btnCuentoUno)
        val btnCuentoDos = findViewById<ImageButton>(R.id.btnCuentoDos)

        val bundle : Bundle? = intent.extras
        bundle?.let {
            val nombre = it.getString("dato1")
            val edad = it.getString("dato3")

            txtNombre.text = "Nombre : $nombre"
            txtEdad.text = "Edad : $edad"
        }

        btnCuentoUno.setOnClickListener {
            val intent = Intent(this,CuentoUno::class.java)
            startActivity(intent)
        }

        btnCuentoDos.setOnClickListener {
            val intent = Intent(this,CuentoDos::class.java)
            startActivity(intent)
        }


    }
}