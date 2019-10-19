package bonch.dev.school.secondhomework

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_in.view.*


class FragmentIn: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val view = inflater.inflate(R.layout.fragment_in, container, false)

        var textViewSecond: TextView = view.findViewById(R.id.textViewsecond)
        textViewSecond.setText("${arguments?.getInt("TAP", 0)} taps")
        return view
    }
}