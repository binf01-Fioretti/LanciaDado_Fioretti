package com.example.lanciadado_fioretti_5binf

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class thirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_third)

        val risultato = intent.getBooleanExtra("RISULTATO", false)
        val txtRisultato = findViewById<TextView>(R.id.textViewRisultato)

        if(risultato){
            txtRisultato.text = "Complimenti hai vinto"
        }
        else{
            txtRisultato.text = "Mi dispiace hai perso"
        }
    }
}