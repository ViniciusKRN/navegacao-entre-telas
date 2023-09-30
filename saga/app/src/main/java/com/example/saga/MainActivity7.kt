package com.example.saga

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity7 : AppCompatActivity() {
    private var somatoria: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main7)

        val intent = intent
        val dados = intent.extras

        if (dados != null) {
            somatoria = dados.getInt("soma")
        }

        val btnAcessar31 = findViewById<RadioButton>(R.id.btnAcessar31)
        btnAcessar31.setOnClickListener {
            val valorBotao = 5 // Valor específico para este botão
            somatoria += valorBotao
            abrirMainActivity8()
        }

        val btnAcessar32 = findViewById<RadioButton>(R.id.btnAcessar32)
        btnAcessar32.setOnClickListener {
            val valorBotao = 4
            somatoria += valorBotao
            abrirMainActivity8()
        }
        val btnAcessar33 = findViewById<RadioButton>(R.id.btnAcessar33)
        btnAcessar33.setOnClickListener {
            val valorBotao = 3
            somatoria += valorBotao
            abrirMainActivity8()
        }
        val btnAcessar34 = findViewById<RadioButton>(R.id.btnAcessar34)
        btnAcessar34.setOnClickListener {
            val valorBotao = 2
            somatoria += valorBotao
            abrirMainActivity8()
        }
        val btnAcessar35 = findViewById<RadioButton>(R.id.btnAcessar35)
        btnAcessar35.setOnClickListener {
            val valorBotao = 1
            somatoria += valorBotao
            abrirMainActivity8()
        }
    }

    private fun abrirMainActivity8() {
        val intent = Intent(this, MainActivity8::class.java)
        intent.putExtra("soma", somatoria)
        startActivity(intent)
    }
}