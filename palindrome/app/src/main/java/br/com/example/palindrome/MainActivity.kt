package br.com.example.palindrome

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCheck.setOnClickListener {
            val textEdited = editTextInput.text.toString()
            val messageEmpty = "fill in the field above"

            if (textEdited.equals("")) {
                textViewResult.text = messageEmpty
            } else {
                if (palindrome(textEdited)) {
                    textViewResult.text = textEdited.plus(" is a palindrome")
                } else {
                    textViewResult.text = textEdited.plus(" is not a palindrome")
                }
            }
        }
    }

    fun palindrome(word: String): Boolean {
        var final = ""

        for (char in word.length - 1 downTo 0) {
            final += word[char]
        }
        return word == final
    }
}
