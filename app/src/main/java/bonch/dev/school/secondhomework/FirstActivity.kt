package bonch.dev.school.secondhomework

import android.content.Intent
import android.os.Bundle

import android.view.KeyEvent
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity



class FirstActivity : AppCompatActivity() {
    private lateinit var counterButton: Button
    private lateinit var textView: TextView
    private lateinit var textField: TextView
    private  lateinit var indicatorButton: Button
    private lateinit var nextActivityButton: Button
    private  var counter = Counter()
    var indButtonPressed = false



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)


        counterButton =  findViewById(R.id.counter_button)
        indicatorButton = findViewById(R.id.indicator_button)
        nextActivityButton = findViewById(R.id.next_activity_button)
        textView = findViewById(R.id.counter_text_view)
        textField = findViewById(R.id.text_field)
        var gettText = textField.text

        nextActivityButton.setOnClickListener({
            val intent = Intent(this@FirstActivity, SecondActivity::class.java)
            intent.putExtra("TAP_KEY", counter.currentCount)
            intent.putExtra("IND KEY", indButtonPressed)
            intent.putExtra("TEXT", gettText.toString() )

            startActivity(intent)

        })
        indicatorButton.setOnClickListener({
            indicatorButton.isClickable = false
            indButtonPressed = true
        })





        val tapAmount = savedInstanceState?.get("TAP_AMOUNT") ?: 0
        textView.setText("$tapAmount taps")
        counter = Counter()
        counterButton.setOnClickListener({
            counter.increment()
            textView.setText("${counter.currentCount} taps") })
    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("TAP_AMOUNT", counter.currentCount)
    }

}

