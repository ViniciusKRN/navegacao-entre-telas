package com.example.saga

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.content.Intent

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var somatorio = 0
        val dados = Bundle()
        dados.putInt("soma", somatorio)


        val btnAcessar = findViewById<RadioButton>(R.id.btnAcessar)
        btnAcessar.setOnClickListener {

            val valorBotao = 0
            val intent = Intent(this, MainActivity2::class.java)

            startActivity(intent)
        }
        val btnAcessar2 = findViewById<RadioButton>(R.id.btnAcessar2)
        btnAcessar2.setOnClickListener {
            val valorBotao = 2

            val intent = Intent(this, MainActivity2::class.java)

            startActivity(intent)
        }
        val btnAcessar3 = findViewById<RadioButton>(R.id.btnAcessar3)
        btnAcessar3.setOnClickListener {

            val valorBotao = 4
            val intent = Intent(this, MainActivity2::class.java)

            startActivity(intent)
        }
        val btnAcessar4 = findViewById<RadioButton>(R.id.btnAcessar4)
        btnAcessar4.setOnClickListener {

            val valorBotao = 8
            val intent = Intent(this, MainActivity2::class.java)

            startActivity(intent)
        }
        val btnAcessar5 = findViewById<RadioButton>(R.id.btnAcessar5)
        btnAcessar5.setOnClickListener {

            val valorBotao = 10
            val intent = Intent(this, MainActivity2::class.java)

            startActivity(intent)
        }


    }
}

