package com.tutorials.spinnerkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val ulkeler = ArrayList<String>()

    private lateinit var veriAdaptoru:ArrayAdapter<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ulkeler.add("Türkiye")
        ulkeler.add("İtalya")
        ulkeler.add("Almanya")
        ulkeler.add("Japonya")
        ulkeler.add("Çin")
        ulkeler.add("Portekiz")
        ulkeler.add("İspanya")

        veriAdaptoru = ArrayAdapter(this,android.R.layout.simple_list_item_1
        ,android.R.id.text1, ulkeler)

        spinner.adapter = veriAdaptoru

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(applicationContext, "Seçilen Ülke: ${ulkeler[position]}",Toast.LENGTH_LONG).show()
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }

        buttonGoster.setOnClickListener {
            Toast.makeText(applicationContext, "Ülke: ${ulkeler[spinner.selectedItemPosition]}",Toast.LENGTH_LONG).show()
        }
    }
}