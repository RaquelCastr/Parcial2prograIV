package com.example.parcial2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private val Especie = arrayOf("Perro Husky","Gato","Ave ")
    private val Color = arrayOf("Blanco con negro","Amarillo","Verde")
    private val Sexo = arrayOf("Femenino","Masculino","Masculino")
    private val Peso = arrayOf("4kg","2kg","0.5kg")

    fun seleccionarMascota(Vista: View){
        when(Vista.id){
            R.id.imageButPerro-> Toast.makeText(this,"Especie: " + Especie[0] + ", Color: " + Color [0] + ", Sexo: " + Sexo[0] + ", Peso: " + Peso[0], Toast.LENGTH_SHORT).show()
            R.id.imageButGato -> Toast.makeText(this,"Especie: " + Especie[1] + ", Color: " + Color [1] + ", Sexo: " + Sexo[1] + ", Peso: " + Peso[1], Toast.LENGTH_SHORT).show()
            R.id.imageButcotorro -> Toast.makeText(this,"Especie: " + Especie[2] + ", Color: " + Color [2] + ", Sexo: " + Sexo[2] + ", Peso: " + Peso[2], Toast.LENGTH_SHORT).show()

        }

    }
}