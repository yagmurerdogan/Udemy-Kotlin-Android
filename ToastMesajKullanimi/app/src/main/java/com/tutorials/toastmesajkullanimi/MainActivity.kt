package com.tutorials.toastmesajkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonNormal.setOnClickListener {
            Toast.makeText(applicationContext,"Merhaba",Toast.LENGTH_LONG).show()
        }

        buttonOzel.setOnClickListener {
            val tasarim = layoutInflater.inflate(R.layout.toast_tasarim,null)
            val textViewMesaj = tasarim.findViewById(R.id.textViewMesaj) as TextView
            textViewMesaj.text = "Merhaba Özel Mesaj"

            val toastOzel = Toast(applicationContext)
            toastOzel.setGravity(Gravity.CENTER_HORIZONTAL or Gravity.CENTER_VERTICAL,0,0)
            toastOzel.duration = Toast.LENGTH_LONG
            toastOzel.show()
        }
    }
}