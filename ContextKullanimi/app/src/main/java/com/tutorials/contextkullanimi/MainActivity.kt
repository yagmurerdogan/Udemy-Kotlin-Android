package com.tutorials.contextkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            //context oluşturma 1.yöntem
            Toast.makeText(this,"Merhaba",Toast.LENGTH_LONG).show()
            //context oluşturma 2.yöntem
            Toast.makeText(this@MainActivity,"Merhaba",Toast.LENGTH_LONG).show()
            //context oluşturma 3.yöntem
            Toast.makeText(applicationContext,"Merhaba",Toast.LENGTH_LONG).show()
            
        }
    }
}