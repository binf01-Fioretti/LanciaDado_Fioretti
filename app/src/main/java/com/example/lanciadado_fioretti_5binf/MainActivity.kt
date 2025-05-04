package com.example.lanciadado_fioretti_5binf

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.lanciadado_fioretti_5binf.R
import com.example.lanciadado_fioretti_5binf.secondActivity
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnroll = findViewById<Button>(R.id.buttonLancia)
        btnroll.setOnClickListener {
            val mioToast = Toast.makeText(this, "DADO LANCIATO", Toast.LENGTH_LONG)
            mioToast.show()

            val mioRandom = estraiNumero()
            lanciaIntent(mioRandom)
        }
        var txtTitle = findViewById<TextView>(R.id.textViewTitle)
        var imgView = findViewById<ImageView>(R.id.ImageViewDado)
    }

    private fun estraiNumero(): Int {
        return (1..6).random()
    }

    private fun lanciaIntent(mioRandom: Int){
        val mioIntent = Intent(this, secondActivity::class.java)
        mioIntent.putExtra("NUMERO", mioRandom)
        startActivity(mioIntent)
    }
}