package br.com.example.alcoholorgasoline

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculate.setOnClickListener { calculateBestOption()}

    }

    fun calculateBestOption() {
        var priceAlcohol = editTextAlcohol.text.toString()
        var priceGasoline = editTextGasoline.text.toString()
        var resultErro = ""

        if (validation(priceAlcohol, priceGasoline)) {
            val resultGasoline = "It is better to use Gasoline"
            val resultAlcohol = "It is better to use alcohol"

            textViewMessageErro.text = resultErro

            if ((priceAlcohol.toDouble() / priceGasoline.toDouble()) >= 0.7) {
                textViewChoose.text = resultGasoline
            } else {
                textViewChoose.text = resultAlcohol
            }

        } else {
            resultErro = "Fill in all fields"
            textViewMessageErro.text = resultErro
        }

    }
    fun validation(priceAlcohol: String, priceGasoline: String): Boolean {
        var boxValidated = true

        if(priceAlcohol == null || priceAlcohol.equals("")){
            boxValidated = false
        }else if(priceGasoline == null || priceGasoline.equals("")){
            boxValidated = false
        }

        return boxValidated
    }
}










