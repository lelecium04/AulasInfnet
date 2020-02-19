package com.example.intents.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.intents.Model.Usuario
import com.example.intents.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var nome = editTextNome.text

        BotaoConfirma.setOnClickListener {
            Toast.makeText(
            this,
            "Bem vindo ${nome.toString()}",
            Toast.LENGTH_SHORT
        ).show()
            var intt = Intent(this, DadosActivity::class.java)

            var usuario = Usuario(
                editTextNome.text.toString(),
                editTextEmail.text.toString(),
                editTextTelefone.text.toString()
            )

            intt.putExtra("usuario", usuario)
            startActivity(intt)

        }
    }



}
