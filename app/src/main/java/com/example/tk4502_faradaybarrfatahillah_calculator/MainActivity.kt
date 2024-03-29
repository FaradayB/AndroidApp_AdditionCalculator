package com.example.tk4502_faradaybarrfatahillah_calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etBil1 = findViewById<EditText>(R.id.et_bil1) //mengambil data dari id et_bil1
        val etBil2 = findViewById<EditText>(R.id.et_bil2) //mengambil data dari id et_bil2
        val btnAdd = findViewById<Button>(R.id.bt_add) //mengambil data dari bt_add
        val tvHasilAdd = findViewById<TextView>(R.id.tv_hasilAdd) //mengambil data dari tv)hasilAdd

        btnAdd.setOnClickListener {
            val num1 = etBil1.text.toString().toInt() //mengubah data et_bil1 menjadi string dan kemudian int
            val num2 = etBil2.text.toString().toInt() //mengubah data et_bil2 menjadi string dan kemudian int

            val res = num1 + num2 //menambahkan hasil angka dan menaruh kedalam sebuah variabel
            tvHasilAdd.setText("$res") //menampilkan hasil dengan menetapkan text baru
        }
    }
}