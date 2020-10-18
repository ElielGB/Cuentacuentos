package com.example.cuentacuentos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_acceso.*


class Acceso : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_acceso)

        val btnIniciar = findViewById<Button>(R.id.btnIniciar)

        btnIniciar.setOnClickListener {

            val campoNombre = campoNombre.getText().toString()
            val campoApellidos = campoApellidos.getText().toString()
            val campoEdad = campoEdad.getText().toString()
            val campoSexo = campoSexo.getText().toString()

            if(campoNombre.isEmpty()){
                Toast.makeText(this,"Debes ingresar tu nombre",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if(campoApellidos.isEmpty()){
                Toast.makeText(this,"Debes ingresar tus apellidos",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if(campoEdad.isEmpty()){
                Toast.makeText(this,"Debes ingresar tu edad",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            if(campoSexo.isEmpty()){
                Toast.makeText(this,"Debes ingresar la letra que indice tu sexo (F o M)",Toast.LENGTH_LONG).show()
                return@setOnClickListener
            }

            val bundle = Bundle()
            bundle.apply {
                putString("dato1",campoNombre)
                putString("dato2",campoApellidos)
                putString("dato3",campoEdad)
                putString("dato4",campoSexo)

            }

            val intent = Intent(this,Menu::class.java).apply {
                putExtras(bundle)
            }
            startActivity(intent)

        }
    }
}