package bonch.dev.school.secondhomework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import bonch.dev.school.secondhomework.fragments.FragmentFirst
import bonch.dev.school.secondhomework.fragments.FragmentSecond

class FragmentActivity : AppCompatActivity() {
    val fm = supportFragmentManager
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
        val fragmentFirst = FragmentFirst()
        fm.beginTransaction()
            .add(R.id.fragment, fragmentFirst)
            .commit()
    }
        fun replaceFragment(){
            val fragmentSecond = FragmentSecond()
            fm.beginTransaction()
                .replace(R.id.fragment, fragmentSecond)
                .addToBackStack("fragment_first")
                .commit()
        }
}
