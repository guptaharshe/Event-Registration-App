package com.example.eventreg

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val ethead=findViewById<TextView>(R.id.ethead)
        val etevent=findViewById<EditText>(R.id.etevent)
        val etname=findViewById<EditText>(R.id.etname)
        val etreg=findViewById<EditText>(R.id.etreg)
        val etcat=findViewById<EditText>(R.id.etcat)
        val etdate=findViewById<EditText>(R.id.etdate)
        val btncheck=findViewById<Button>(R.id.btncheck)


        btncheck.setOnClickListener {
            val event = etevent.text.toString().trim()
            val name = etname.text.toString().trim()
            val reg = etreg.text.toString().trim()
            val cat = etcat.text.toString().trim()
            val date = etdate.text.toString().trim()

            if (event.isEmpty() || name.isEmpty() || reg.isEmpty() || cat.isEmpty() || date.isEmpty()) {
                Toast.makeText(this, "Please fill all the details", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            Toast.makeText(this, "Registration Successful on $date", Toast.LENGTH_SHORT).show()
        }
    }
}