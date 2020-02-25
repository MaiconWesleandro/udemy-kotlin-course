package br.com.example.headsortails

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_play.*
import kotlin.random.Random

class Play : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_play)

        val dados: Bundle? = intent.extras
        val number = dados?.getInt("random")

        if (number == 0) {
            imageViewResult.setImageResource(R.drawable.moeda_cara)
        } else {
            imageViewResult.setImageResource(R.drawable.moeda_coroa)
        }

        //Se botão voltar for clicado
        imageViewPrevious.setOnClickListener {
            finish()
        }
    }
}

