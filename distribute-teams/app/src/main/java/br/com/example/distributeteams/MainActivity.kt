package br.com.example.distributeteams

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.sax.StartElementListener
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonNext.setOnClickListener {

            //go to next activity
            val intent = Intent(applicationContext, Teams::class.java)
            //send values
            intent.putExtra("player1", editTextPlay1.text.toString())
            intent.putExtra("player2", editTextPlay2.text.toString())
            intent.putExtra("player3", editTextPlay3.text.toString())
            intent.putExtra("player4", editTextPlay4.text.toString())
            intent.putExtra("player5", editTextPlay5.text.toString())
            startActivity(intent)
        }
    }
}
