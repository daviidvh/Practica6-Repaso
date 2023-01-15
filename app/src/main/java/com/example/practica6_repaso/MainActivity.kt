package com.example.practica6_repaso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var activo=false
        var boton=findViewById<Button>(R.id.buttonComenzar)
        var eD1=findViewById<EditText>(R.id.editText)


        boton.setOnClickListener() {
            eD1.setOnFocusChangeListener { x, foco ->
                if(foco)
                        boton.text="Finalizar"
                else{
                    boton.text="Comenzar"
                    }
            }
        }
/*
        if (findViewById<EditText>(R.id.editText).text.toString().contentEquals("Wayne"))
            findViewById<ImageView>(R.id.batman).isVisible=true
*/
    }
}