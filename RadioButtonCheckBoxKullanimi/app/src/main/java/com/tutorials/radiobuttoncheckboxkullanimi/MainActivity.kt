package com.tutorials.radiobuttoncheckboxkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            val javaDurum = checkBoxJava.isChecked
            val kotlinDurum = checkBoxKotlin.isChecked
            val barcelonaDurum = radioButtonBarcelona.isChecked
            val realMadridDurum = radioButtonRealMadrid.isChecked

            Log.e("Java Durum",javaDurum.toString())
            Log.e("Kotlin Durum",kotlinDurum.toString())
            Log.e("Barcelona Durum",barcelonaDurum.toString())
            Log.e("Real Madrid Durum",realMadridDurum.toString())

            radioButtonBarcelona.setOnCheckedChangeListener { buttonView, isChecked ->
                if(isChecked){
                    Toast.makeText(applicationContext,"TEBRİKLER!",Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}