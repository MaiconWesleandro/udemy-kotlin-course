package br.com.maicon.corpersonalizada

import android.annotation.SuppressLint
import android.content.SharedPreferences
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("ResourceAsColor")
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inicia variavel sharedPreferences
        val sharedPreferences: SharedPreferences = getSharedPreferences("ARQUIVO_PREFERENCIA", 0)

        //verifica se já existe a variavel e altera a cor caso necessario
        if (sharedPreferences.contains("num")) {
            altercolor(sharedPreferences.getInt("num", 0))
        }
        val edit = sharedPreferences.edit()
        var aux: Int = 0
        buttonSave.setOnClickListener {

            when (radioGroupPrimary.checkedRadioButtonId) {
                radioButtonBlue.id -> {
                    aux = getColor(R.color.radioButtonColorBlue)
                    altercolor(aux)
                }
                radioButtonOrange.id -> {
                    aux = getColor(R.color.radioButtonColorOrange)
                    altercolor(aux)
                }
                radioButtonGreen.id -> {
                    aux = getColor(R.color.radioButtonColorGreen)
                    altercolor(aux)
                }
            }
            edit.putInt("num", aux)
            edit.apply()
        }

    }

    //funcao que altera cor
    fun altercolor(int: Int) {
        buttonSave.setTextColor(int)
        constraintBackground.setBackgroundColor(int)
    }
}


