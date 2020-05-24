package edu.stanford.rkpandey.colorstatelistdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnOption1.setOnClickListener {
            btnOption1.isSelected = !btnOption1.isSelected
        }

        switchButtonEnable.setOnCheckedChangeListener { buttonView, isChecked ->
            btnOption1.isEnabled = isChecked
        }

    }

}
