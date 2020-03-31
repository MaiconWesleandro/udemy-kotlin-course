package br.com.maicon.serie

import android.app.Activity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        //propriedades seek
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {

            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                // Display the current progress of SeekBar
                when (i) {

                    0 -> imageViewResult.setImageDrawable(null)

                    1 -> {
                        imageViewResult.setImageResource(R.drawable.pouco)
                        Toast.makeText(this@MainActivity, "Nota 1", Toast.LENGTH_SHORT).show()
                    }

                    2 -> {
                        imageViewResult.setImageResource(R.drawable.medio)
                        Toast.makeText(this@MainActivity, "Nota 2", Toast.LENGTH_SHORT).show()
                    }
                    3 -> {
                        imageViewResult.setImageResource(R.drawable.muito)
                        Toast.makeText(this@MainActivity, "Nota 3", Toast.LENGTH_SHORT).show()
                    }
                    4 -> {
                        imageViewResult.setImageResource(R.drawable.susto)
                        Toast.makeText(this@MainActivity, "Nota 3", Toast.LENGTH_SHORT).show()
                    }
                }
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
            }


        })

    }
}
