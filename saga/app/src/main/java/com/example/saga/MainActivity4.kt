package com.example.saga

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {
    private var somatoria: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val intent = intent
        val dados = intent.extras

        if (dados != null) {
            somatoria = dados.getInt("soma")
        }

        val btnAcessar16 = findViewById<RadioButton>(R.id.btnAcessar16)
        btnAcessar16.setOnClickListener {
            val valorBotao = 5 // Valor específico para este botão
            somatoria += valorBotao
            abrirMainActivity5()
        }

        val btnAcessar17 = findViewById<RadioButton>(R.id.btnAcessar17)
        btnAcessar17.setOnClickListener {
            val valorBotao = 4
            somatoria += valorBotao
            abrirMainActivity5()
        }
        val btnAcessar18 = findViewById<RadioButton>(R.id.btnAcessar18)
        btnAcessar18.setOnClickListener {
            val valorBotao = 3
            somatoria += valorBotao
            abrirMainActivity5()
        }
        val btnAcessar19 = findViewById<RadioButton>(R.id.btnAcessar19)
        btnAcessar19.setOnClickListener {
            val valorBotao = 2
            somatoria += valorBotao
            abrirMainActivity5()
        }
        val btnAcessar20 = findViewById<RadioButton>(R.id.btnAcessar20)
        btnAcessar20.setOnClickListener {
            val valorBotao = 1
            somatoria += valorBotao
            abrirMainActivity5()
        }
    }

    private fun abrirMainActivity5() {
        val intent = Intent(this, MainActivity5::class.java)
        intent.putExtra("soma", somatoria)
        startActivity(intent)
    }
}