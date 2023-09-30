package com.example.saga

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity5 : AppCompatActivity() {
    private var somatoria: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)

        val intent = intent
        val dados = intent.extras

        if (dados != null) {
            somatoria = dados.getInt("soma")
        }

        val btnAcessar21 = findViewById<RadioButton>(R.id.btnAcessar21)
        btnAcessar21.setOnClickListener {
            val valorBotao = 5 // Valor específico para este botão
            somatoria += valorBotao
            abrirMainActivity6()
        }

        val btnAcessar22 = findViewById<RadioButton>(R.id.btnAcessar22)
        btnAcessar22.setOnClickListener {
            val valorBotao = 4
            somatoria += valorBotao
            abrirMainActivity6()
        }
        val btnAcessar23 = findViewById<RadioButton>(R.id.btnAcessar23)
        btnAcessar23.setOnClickListener {
            val valorBotao = 3
            somatoria += valorBotao
            abrirMainActivity6()
        }
        val btnAcessar24 = findViewById<RadioButton>(R.id.btnAcessar24)
        btnAcessar24.setOnClickListener {
            val valorBotao = 2
            somatoria += valorBotao
            abrirMainActivity6()
        }
        val btnAcessar25 = findViewById<RadioButton>(R.id.btnAcessar25)
        btnAcessar25.setOnClickListener {
            val valorBotao = 1
            somatoria += valorBotao
            abrirMainActivity6()
        }
    }

    private fun abrirMainActivity6() {
        val intent = Intent(this, MainActivity6::class.java)
        intent.putExtra("soma", somatoria)
        startActivity(intent)
    }
}