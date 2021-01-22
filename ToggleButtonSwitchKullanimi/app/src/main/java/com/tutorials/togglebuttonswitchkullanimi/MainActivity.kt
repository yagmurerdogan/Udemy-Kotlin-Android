package com.tutorials.togglebuttonswitchkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        switch1.setOnCheckedChangeListener { buttonView, isChecked ->

            if(isChecked){
                Log.e("Switch","on")
            }else{
                Log.e("Switch","off")
            }
        }

        toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->

            if(isChecked){
                Log.e("Toggle Button","on")
            }else{
                Log.e("Toggle Button","off")
            }
        }

        button.setOnClickListener {
            val switchDurum = switch1.isChecked
            val toggleButtonDurum = toggleButton.isChecked

            Log.e("Switch Durum",switchDurum.toString())
            Log.e("ToggleButton Durum",toggleButtonDurum.toString())
        }


    }
}