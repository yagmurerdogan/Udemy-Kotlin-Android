package com.tutorials.popupmenuolusturma

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.widget.PopupMenu
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        menuAc.setOnClickListener {
            val popup = PopupMenu(this@MainActivity,menuAc)
            popup.menuInflater.inflate(R.menu.popup_menu,popup.menu)

            popup.setOnMenuItemClickListener { item ->
                when(item.itemId) {
                    R.id.action_sil -> {
                        Toast.makeText(applicationContext,"Sil seçildi",Toast.LENGTH_SHORT).show()
                        true
                    }

                    R.id.action_düzenle -> {
                        Toast.makeText(applicationContext,"Düzenşe seçildi",Toast.LENGTH_SHORT).show()
                        false
                    }
                    else -> false
                }
            }
            popup.show()
        }
    }
}