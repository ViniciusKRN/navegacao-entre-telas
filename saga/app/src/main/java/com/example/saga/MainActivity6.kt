package com.example.saga

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity6 : AppCompatActivity() {
    private var somatoria: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        val intent = intent
        val dados = intent.extras

        if (dados != null) {
            somatoria = dados.getInt("soma")
        }

        val btnAcessar26 = findViewById<RadioButton>(R.id.btnAcessar26)
        btnAcessar26.setOnClickListener {
            val valorBotao = 5 // Valor específico para este botão
            somatoria += valorBotao
            abrirMainActivity7()
        }

        val btnAcessar27 = findViewById<RadioButton>(R.id.btnAcessar27)
        btnAcessar27.setOnClickListener {
            val valorBotao = 4
            somatoria += valorBotao
            abrirMainActivity7()
        }
        val btnAcessar28 = findViewById<RadioButton>(R.id.btnAcessar28)
        btnAcessar28.setOnClickListener {
            val valorBotao = 3
            somatoria += valorBotao
            abrirMainActivity7()
        }
        val btnAcessar29 = findViewById<RadioButton>(R.id.btnAcessar29)
        btnAcessar29.setOnClickListener {
            val valorBotao = 2
            somatoria += valorBotao
            abrirMainActivity7()
        }
        val btnAcessar30 = findViewById<RadioButton>(R.id.btnAcessar30)
        btnAcessar30.setOnClickListener {
            val valorBotao = 1
            somatoria += valorBotao
            abrirMainActivity7()
        }
    }

    private fun abrirMainActivity7() {
        val intent = Intent(this, MainActivity7::class.java)
        intent.putExtra("soma", somatoria)
        startActivity(intent)
    }
}

