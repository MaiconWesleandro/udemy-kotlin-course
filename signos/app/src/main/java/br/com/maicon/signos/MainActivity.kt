package br.com.maicon.signos

import android.app.Activity
import android.os.Bundle
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    private val arraySignos = arrayOf(
        "Áries",
        "Touro",
        "Gêmeos",
        "Câncer",
        "Leão",
        "Virgem",
        "Libra",
        "Escorpião",
        "Sagitário",
        "Capricórnio",
        "Aquário",
        "Peixes"

    )
    private val arrayMessage = arrayOf(
        "Impulsivo, o ariano não pensa muito sobre seus atos.",
        "Teimoso, o taurino é determinado e protetor.",
        "Espontâneo e um pouco instável, o geminiano é uma verdadeira caixinha de surpresas.",
        "Família é a palavra-chave para o canceriano.",
        "Este é signo que veio para brilhar.",
        "Perspicaz e inteligente, o virginiano está acostumado com o sucesso, por isso se cobra muito, assim como aos demais.",
        "O libriano gosta do que é belo e harmonioso.",
        "Determinado, o escorpiano vai até o fim para conquistar os seus objetivos.",
        "Um signo de bem com a vida, que está sempre em busca de ação e que vive rodeado de amigos.",
        "Com paciência, ele se mostra um amigo leal e um companheiro fiel.",
        "Independente, o aquariano preza muito por sua liberdade.",
        "Este é o signo mais romântico do zodíaco. "
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,arraySignos)
        listViewPrimary.adapter = arrayAdapter

        //se um item for clicado
        listViewPrimary.setOnItemClickListener{
            parent, view, position, id ->

            //Toast exibindo informações do signo
            Toast.makeText(this,arrayMessage[position], Toast.LENGTH_SHORT).show()
        }

    }
}

