package com.example.intents.Activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intents.Model.Usuario
import com.example.intents.R
import kotlinx.android.synthetic.main.activity_main.textViewEmail
import kotlinx.android.synthetic.main.activity_main.textViewNome
import kotlinx.android.synthetic.main.activity_main.textViewTelefone

class DadosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dados)

        var usuario = intent.getSerializableExtra("usuario") as Usuario

        if (usuario.nome.isEmpty()){
            textViewNome.text = "Nome não Informado"
        }else{
            textViewNome.text = usuario.nome
        }

        if (usuario.email.isEmpty()){
            textViewEmail.text = "E-Mail não Informado"
        }else{
            textViewEmail.text = usuario.email
        }

        if (usuario.telefone.isEmpty()){
            textViewTelefone.text = "Telefone não Informado"
        }else{
            textViewTelefone.text = usuario.telefone
        }
    }
}
