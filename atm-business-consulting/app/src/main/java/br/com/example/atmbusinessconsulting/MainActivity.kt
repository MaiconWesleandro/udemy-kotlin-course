package br.com.example.atmbusinessconsulting

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonClient.setOnClickListener {
            val intent = Intent(this, detailsClient::class.java)
            startActivity(intent)
        }

        buttonCompany.setOnClickListener {
            val intent = Intent(this, detailsCompany::class.java)
            startActivity(intent)
        }

        buttonService.setOnClickListener {
            val intent = Intent(this, detailsServices::class.java)
            startActivity(intent)
        }

        buttonContact.setOnClickListener {
            val intent = Intent(this, detailsContact::class.java)
            startActivity(intent)
        }
    }
}
