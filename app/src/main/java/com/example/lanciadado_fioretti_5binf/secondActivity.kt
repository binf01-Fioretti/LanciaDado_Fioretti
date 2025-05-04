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
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        val btnRisultato = findViewById<Button>(R.id.buttonRisultato)
        btnRisultato.setOnClickListener {
            val mioToast = Toast.makeText(this, "RISULTATO", Toast.LENGTH_LONG)
            mioToast.show()
        }
        var txtNumber = findViewById<TextView>(R.id.textViewNumber)
        var imgView = findViewById<ImageView>(R.id.ImageViewDado)
        val mioRandom = intent.getIntExtra("NUMERO", -1)
        }

        private fun lanciaIntent(mioRandom: Int){
            val mioIntent = Intent(this, secondActivity::class.java)
            mioIntent.putExtra("NUMERO", mioRandom)
            startActivity(mioIntent)
        }
    }
