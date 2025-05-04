package com.example.lanciadado_fioretti_5binf

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class secondActivity : AppCompatActivity() {

    private lateinit var txtNumber: TextView
    private lateinit var imgDice: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val btnRisultato = findViewById<Button>(R.id.buttonRisultato)
        btnRisultato.setOnClickListener {
            val mioToast = Toast.makeText(this, "RISULTATO", Toast.LENGTH_LONG)
            mioToast.show()
        }

        txtNumber = findViewById<TextView>(R.id.textViewNumber)
        imgDice = findViewById<ImageView>(R.id.ImageViewDado)
        val randomNumber = intent.getIntExtra("NUMERO", -1)

        txtNumber.text = randomNumber.toString()
        val imgDiceResources = when(randomNumber){
            1 -> R.drawable.dice_face_1
            2 -> R.drawable.dice_face_2
            3 -> R.drawable.dice_face_3
            4 -> R.drawable.dice_face_4
            5 -> R.drawable.dice_face_5
            else -> {R.drawable.dice_face_6}
        }
        imgDice.setImageResource(imgDiceResources)

        }
    }
