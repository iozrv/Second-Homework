package bonch.dev.school.secondhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AbsListView
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_fragment2.view.*

class Fragment_Activity : AppCompatActivity() {

    val fm = supportFragmentManager
    private lateinit var counterButton: Button
    private lateinit var textView: TextView
    private lateinit var indicatorButton: Button
    private lateinit var textField: TextView
    private lateinit var newFragmentButton: Button
    private var counter = Fcounter()
    var fragmentIn = FragmentIn()
    var indButtonPresed = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment2)
        var bundle = Bundle()
        counterButton = findViewById(R.id.counter_button)
        textView = findViewById(R.id.counter_text_view)
        indicatorButton = findViewById(R.id.indicator_button)
        textField = findViewById(R.id.text_field)
        newFragmentButton = findViewById(R.id.new_fragment_button)

        counter = Fcounter()
        fragmentIn = FragmentIn()



        counterButton.setOnClickListener({
            counter.increment()
            textView.setText("${counter.currentCount} taps")
        })

        indicatorButton.setOnClickListener({
            indicatorButton.isClickable = false
            indButtonPresed = true
        })

       newFragmentButton.setOnClickListener({
           var x = 1
           bundle.putInt("TAP", x)
           fm.beginTransaction()
               .add(R.id.placeForFragment, fragmentIn)
               .commit()

       })












    }




}
