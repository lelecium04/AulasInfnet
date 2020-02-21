package com.example.intents.Activity

import android.app.Activity
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

            startActivityForResult(intt, 10)

        }

        imageViewTw.setOnClickListener{
            var intt = Intent(this, ListaImagens::class.java)

            startActivityForResult(intt, 5)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(resultCode == Activity.RESULT_OK){
            when(requestCode){
                10 ->{
                    var retorno = data!!.getStringExtra("resultado")
                }
                5 ->{
                    var fotoPerfil = data!!.getIntExtra("imagem", R.drawable.twitter)
                    imageViewTw.setImageResource(fotoPerfil)
                }
            }
        }
    }
}
