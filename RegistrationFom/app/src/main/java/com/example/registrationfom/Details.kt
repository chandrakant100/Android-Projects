package com.example.registrationfom

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Details : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val message1 = intent.getStringExtra("mess1")
        val message2 = intent.getStringExtra("mess2")
        val message3 = intent.getStringExtra("mess3")

        findViewById<TextView>(R.id.textview1).apply {
             text = "Name: $message1"
        }
        findViewById<TextView>(R.id.textview2).apply {
            text = "DOB: $message2"
        }
        findViewById<TextView>(R.id.textview3).apply {
            text = "Address: $message3"
        }
    }
}