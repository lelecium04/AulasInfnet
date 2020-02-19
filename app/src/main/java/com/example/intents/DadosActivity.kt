package com.example.intents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_dados.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.textViewEmail
import kotlinx.android.synthetic.main.activity_main.textViewNome
import kotlinx.android.synthetic.main.activity_main.textViewTelefone

class DadosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados)

        var nome = intent.getStringExtra("nomeUsuario")
        var email = intent.getStringExtra("emailUsuario")
        var telefone = intent.getStringExtra("telefoneUsuario")

        textViewNome.text = nome
        textViewEmail.text = email
        textViewTelefone.text = telefone


    }
}
