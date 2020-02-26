package br.com.example.headsortails

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        imageViewPlay.setOnClickListener {
            val intent = Intent(this, Play::class.java)

            //Gerar Número aleatório
            val numberRandom = java.util.Random().nextInt(2)

            //Enviar número para a proxima activity
            intent.putExtra("random", numberRandom)

            startActivity(intent)
        }
    }
}
