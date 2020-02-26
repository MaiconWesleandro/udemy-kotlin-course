package br.com.wesleandro.dailyphrases

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonPhrases.setOnClickListener {
            randomPhrases()
        }
    }

    fun randomPhrases(){
        var phrases = arrayOf("The ideal is to be happy, not perfect.",
            "SIt is your faith that makes you follow.",
            "If my intensity is defective, I’m glad it’s not perfect.",
            "Be and honor the person you are",
            "For those who feel little, I’m sorry.",
            "Never stop preserving what’s best in you.",
            "We exist to be happy.",
            "May we be free, happy and happy.",
            "Grateful soul exalts peace. ",
            "Feet on the floor, head held high and faith in life.")

        var generatePhrase = Random().nextInt(10)
        txtViewPhrases.text = phrases[generatePhrase]
    }
}
