package com.example.intents.Activity

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intents.R
import kotlinx.android.synthetic.main.activity_lista_imagens.*

class ListaImagens : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_imagens)

        var intt = Intent()

        imageViewIfood.setOnClickListener{
            var id  =  R.drawable.ifood
            intt.putExtra("imagem", id)
            setResult(Activity.RESULT_OK, intt)
            finish()
        }

        imageViewAndroid.setOnClickListener{
            var id  =  R.drawable.ic_launcher_foreground
            intt.putExtra("imagem", id)
            setResult(Activity.RESULT_OK, intt)
            finish()
        }



    }


}
