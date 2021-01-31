package com.tutorials.snackbarolusturma

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonNormal.setOnClickListener { view ->
            Snackbar.make(view,"Merhaba",Snackbar.LENGTH_SHORT).show()

        }
        buttonGeriDonus.setOnClickListener { x ->
            Snackbar.make(x,"Mesaj silinsin mi?",Snackbar.LENGTH_SHORT)
                .setAction("EVET") { y ->
                    Snackbar.make(y,"Mesaj silindi",Snackbar.LENGTH_SHORT).show()
                }
                .show()
        }
        buttonOzel.setOnClickListener { z ->
            val sb = Snackbar.make(z,"İnternet Bağlantısı Yok",Snackbar.LENGTH_LONG)
            sb.setAction("Tekrar Dene") {

            }
            sb.setActionTextColor(Color.RED)
            sb.setTextColor(Color.BLUE)
            sb.setBackgroundTint(Color.WHITE)
            sb.show()
        }
    }
}