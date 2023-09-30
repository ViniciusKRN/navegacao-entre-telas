package com.example.saga

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {
    private var somatoria: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val intent = intent
        val dados = intent.extras

        if (dados != null) {
            somatoria = dados.getInt("soma")
        }

        val btnAcessar11 = findViewById<RadioButton>(R.id.btnAcessar11)
        btnAcessar11.setOnClickListener {
            val valorBotao = 5 // Valor específico para este botão
            somatoria += valorBotao
            abrirMainActivity4()
        }

        val btnAcessar12 = findViewById<RadioButton>(R.id.btnAcessar12)
        btnAcessar12.setOnClickListener {
            val valorBotao = 4
            somatoria += valorBotao
            abrirMainActivity4()
        }
        val btnAcessar13 = findViewById<RadioButton>(R.id.btnAcessar13)
        btnAcessar13.setOnClickListener {
            val valorBotao = 3
            somatoria += valorBotao
            abrirMainActivity4()
        }
        val btnAcessar14 = findViewById<RadioButton>(R.id.btnAcessar14)
        btnAcessar14.setOnClickListener {
            val valorBotao = 2
            somatoria += valorBotao
            abrirMainActivity4()
        }
        val btnAcessar15 = findViewById<RadioButton>(R.id.btnAcessar15)
        btnAcessar15.setOnClickListener {
            val valorBotao = 1
            somatoria += valorBotao
            abrirMainActivity4()
        }
    }

    private fun abrirMainActivity4() {
        val intent = Intent(this, MainActivity4::class.java)
        intent.putExtra("soma", somatoria)
        startActivity(intent)
    }
}