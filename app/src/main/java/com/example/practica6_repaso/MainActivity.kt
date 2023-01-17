package com.example.practica6_repaso

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    @SuppressLint("ResourceType", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var boton=findViewById<Button>(R.id.buttonComenzar)
        var eD1=findViewById<EditText>(R.id.editText)
        var logo=findViewById<ImageView>(R.id.batman)

        boton.setOnClickListener() {
            boton.setText("Finalizar")
            eD1.visibility = View.VISIBLE
            logo.visibility
            if (eD1.text.toString().equals("Wayne")){
            }else if (eD1.text.toString().equals("Joker")){
                boton.setBackgroundColor(Color.parseColor("#d22bed"))

            }
        }

    }
}