package br.com.example.distributeteams

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_final.*
import java.util.*
import kotlin.collections.ArrayList

class Final : AppCompatActivity() {

    //function to shuffle teams
    fun shuffleArray(list: ArrayList<String?>): ArrayList<String?> {
        var aux = ""

        var random = Random().nextInt(5)
        var random1 = Random().nextInt(5)

        aux = list[random].toString()

        list[random] = list[random1]
        list[random1] = aux

        random = Random().nextInt(5)
        random1 = Random().nextInt(5)
        aux = list[random].toString()

        list[random] = list[random1]
        list[random1] = aux

        random = Random().nextInt(5)
        random1 = Random().nextInt(5)
        aux = list[random].toString()

        list[random] = list[random1]
        list[random1] = aux

        return list
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_final)

        //variable to receive values
        val dados: Bundle? = intent.extras

        //assigning values to players
        textViewResultPlay1.text = dados?.getString("player1")
        textViewResultPlay2.text = dados?.getString("player2")
        textViewResultPlay3.text = dados?.getString("player3")
        textViewResultPlay4.text = dados?.getString("player4")
        textViewResultPlay5.text = dados?.getString("player5")

        //array of teams
        val arrayTeams = arrayListOf(dados?.getString("team1"), dados?.getString("team2"), dados?.getString("team3"), dados?.getString("team4"), dados?.getString("team5"))

        //function to shuffle teams
        val arrayResult =  shuffleArray(arrayTeams)


        //assigning values teams
        textViewResultTeam1.text = arrayResult[0]
        textViewResultTeam2.text = arrayResult[1]
        textViewResultTeam3.text = arrayResult[2]
        textViewResultTeam4.text = arrayResult[3]
        textViewResultTeam5.text = arrayResult[4]

    }
}
