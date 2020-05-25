package br.com.maicon.minhasanotacoes

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inicia variavel sharedPreferences
        val sharedPreferences: SharedPreferences = getSharedPreferences("ARQUIVO_PREFERENCIA", 0)

        //verifica se existe texto salvo
        if (sharedPreferences.contains("text")) {
            textInputBackgroundText.setText(sharedPreferences.getString("text", " "))
        }

        imageViewButtonSave.setOnClickListener {
            val edit = sharedPreferences.edit()
            edit.putString("text", textInputBackgroundText.text.toString())
            edit.apply()
            Toast.makeText(this, "Anotação gravada com sucesso!", Toast.LENGTH_SHORT).show()
        }
    }
}
