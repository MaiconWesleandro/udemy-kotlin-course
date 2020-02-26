package br.com.wesleandro.randomnumber

    import androidx.appcompat.app.AppCompatActivity
    import android.os.Bundle
    import android.view.View
    import android.widget.TextView
    import kotlinx.android.synthetic.main.activity_main.*
    import java.util.*

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

            buttonGenerate.setOnClickListener { drawNumber() }
        }

        fun drawNumber() {
            var numberDraw = Random().nextInt(11)
            txtViewNumber.text = "Number draw is: $numberDraw"
        }

}
