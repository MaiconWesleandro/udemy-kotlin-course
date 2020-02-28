package br.com.example.distributeteams

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_teams.*

class Teams : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teams)

        //recebendo values
        val dados: Bundle? = intent.extras
        val player1 = dados?.getString("player1")
        val player2 = dados?.getString("player2")
        val player3 = dados?.getString("player3")
        val player4 = dados?.getString("player4")
        val player5 = dados?.getString("player5")

        buttonNext2.setOnClickListener {

            val intent = Intent(applicationContext, Final::class.java)

            //send players values
            intent.putExtra("player1", player1)
            intent.putExtra("player2", player2)
            intent.putExtra("player3", player3)
            intent.putExtra("player4", player4)
            intent.putExtra("player5", player5)

            //send teams values
            intent.putExtra("team1", editTextTeam1.text.toString())
            intent.putExtra("team2", editTextTeam2.text.toString())
            intent.putExtra("team3", editTextTeam3.text.toString())
            intent.putExtra("team4", editTextTeam4.text.toString())
            intent.putExtra("team5", editTextTeam5.text.toString())

            startActivity(intent)
        }

    }
}
