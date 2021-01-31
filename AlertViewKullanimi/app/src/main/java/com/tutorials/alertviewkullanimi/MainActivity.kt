package com.tutorials.alertviewkullanimi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.alert_tasarim.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonNormal.setOnClickListener {
            val ad = AlertDialog.Builder(this@MainActivity)
            ad.setMessage("Mesaj")
            ad.setTitle("Başlık")
            ad.setIcon(R.drawable.resim)

            ad.setPositiveButton("Tamam") { dialogInterface, i ->
                Toast.makeText(applicationContext,"Tamam Tıklanıldı",Toast.LENGTH_SHORT).show()

            }
            ad.setNegativeButton("İptal") { dialogInterface, i ->
                Toast.makeText(applicationContext,"İptale Tıklanıldı",Toast.LENGTH_SHORT).show()

            }
            ad.create().show()
        }

        buttonOzel.setOnClickListener {
            val tasarim = layoutInflater.inflate(R.layout.alert_tasarim,null)
            val editText = tasarim.findViewById(R.id.editTextAlert) as EditText


            val ad = AlertDialog.Builder(this@MainActivity)
            ad.setMessage("Mesaj")
            ad.setTitle("Başlık")
            ad.setIcon(R.drawable.resim)

            ad.setView(tasarim)

            ad.setPositiveButton("Kaydet") { dialogInterface, i ->
                val alinanVeri = editTextAlert.text.toString()
                Toast.makeText(applicationContext,"Alınan Veri: ${alinanVeri}",Toast.LENGTH_SHORT).show()

            }
            ad.setNegativeButton("İptal") { dialogInterface, i ->
                Toast.makeText(applicationContext,"İptale Tıklanıldı",Toast.LENGTH_SHORT).show()

            }
            ad.create().show()

        }
    }
}