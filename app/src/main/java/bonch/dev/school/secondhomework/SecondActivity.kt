package bonch.dev.school.secondhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

private lateinit var textView: TextView
class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        textView = findViewById(R.id.textViewSecond)

        val counterValue = intent.getIntExtra("TAP_KEY", 0)
        val indicatorValue = intent.getBooleanExtra("IND KEY", false)
        val textValue = intent.getStringExtra("TEXT")

        textView.setText("Indicator: ${indicatorValue}\n\nButton was tapped ${counterValue} times\n\n${textValue}")
    }
}