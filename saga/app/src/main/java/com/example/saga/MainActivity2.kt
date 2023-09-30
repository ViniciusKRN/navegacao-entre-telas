package com.example.saga

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    private var somatoria: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = intent
        val dados = intent.extras

        if (dados != null) {
            somatoria = dados.getInt("soma")
        }

        val btnAcessar6 = findViewById<RadioButton>(R.id.btnAcessar6)
        btnAcessar6.setOnClickListener {
            val valorBotao = 5 // Valor específico para este botão
            somatoria += valorBotao
            abrirMainActivity3()
        }

        val btnAcessar7 = findViewById<RadioButton>(R.id.btnAcessar7)
        btnAcessar7.setOnClickListener {
            val valorBotao = 4
            somatoria += valorBotao
            abrirMainActivity3()
        }
        val btnAcessar8 = findViewById<RadioButton>(R.id.btnAcessar8)
        btnAcessar8.setOnClickListener {
            val valorBotao = 3
            somatoria += valorBotao
            abrirMainActivity3()
        }
        val btnAcessar9 = findViewById<RadioButton>(R.id.btnAcessar9)
        btnAcessar9.setOnClickListener {
            val valorBotao = 2
            somatoria += valorBotao
            abrirMainActivity3()
        }
        val btnAcessar10 = findViewById<RadioButton>(R.id.btnAcessar10)
        btnAcessar10.setOnClickListener {
            val valorBotao = 1
            somatoria += valorBotao
            abrirMainActivity3()
        }
    }

    private fun abrirMainActivity3() {
        val intent = Intent(this, MainActivity3::class.java)
        intent.putExtra("soma", somatoria)
        startActivity(intent)
    }
}