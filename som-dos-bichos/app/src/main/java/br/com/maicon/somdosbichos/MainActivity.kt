package br.com.maicon.somdosbichos

import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageViewDog.setOnClickListener {
            som(R.raw.cao)
        }
        imageViewCat.setOnClickListener {
            som(R.raw.gato)
        }
        imageViewLion.setOnClickListener {
            som(R.raw.leao)
        }
        imageViewMonkey.setOnClickListener {
            som(R.raw.macaco)
        }
        imageViewSheep.setOnClickListener {
            som(R.raw.ovelha)
        }
        imageViewCow.setOnClickListener {
            som(R.raw.vaca)
        }
    }

    private fun som(id: Int) {
        MediaPlayer.create(this, id).start()
        //liberar recursos que estao sendo utilizados
        MediaPlayer.create(this, id).release()
    }


}
