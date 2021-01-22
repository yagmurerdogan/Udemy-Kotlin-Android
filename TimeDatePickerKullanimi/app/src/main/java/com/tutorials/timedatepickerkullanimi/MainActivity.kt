package com.tutorials.timedatepickerkullanimi

import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editTextSaat.setOnClickListener{
            val calender = Calendar.getInstance()
            val saat = calender.get(Calendar.HOUR_OF_DAY)
            val dakika = calender.get(Calendar.MINUTE)

            val timePicker = TimePickerDialog(this@MainActivity,TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->

                editTextSaat.setText("$hourOfDay:$minute")

            },saat,dakika,true)

            timePicker.setTitle("Saat Seçiniz")
            timePicker.setButton(DialogInterface.BUTTON_POSITIVE,"AYARLA",timePicker)
            timePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"İPTAL",timePicker)
            timePicker.show()
        }

        editTextTarih.setOnClickListener{

            val calender = Calendar.getInstance()
            val yil = calender.get(Calendar.YEAR)
            val ay = calender.get(Calendar.MONTH)
            val gun = calender.get(Calendar.DAY_OF_MONTH)

            val datePicker = DatePickerDialog(this@MainActivity,DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->

                editTextTarih.setText("$dayOfMonth/${month+1}/$year")

            },yil,ay,gun)

            datePicker.setTitle("Tarih Seçiniz")
            datePicker.setButton(DialogInterface.BUTTON_POSITIVE,"AYARLA",datePicker)
            datePicker.setButton(DialogInterface.BUTTON_NEGATIVE,"İPTAL",datePicker)
            datePicker.show()

        }
    }
}