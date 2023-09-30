package com.example.saga

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity8 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main8)

        val resultadoTextView = findViewById<TextView>(R.id.resultadoTextView)

        val soma = intent.getIntExtra("soma", 0 )

        var resultado = ""
        if (soma > 0) {
            if (soma < 18) {
                resultado = "Conservador"
            } else if (soma < 33) {
                resultado = "Moderado"
            } else if (soma < 46) {
                resultado = "Agressivo"
            } else if (soma >= 46) {
                resultado = "Superagressivo"
            }

            resultadoTextView.text = "Pontos: $soma, Resultado: $resultado"
        } else {
            resultadoTextView.text = "Pontos não foram definidos corretamente."
        }
    }
}














