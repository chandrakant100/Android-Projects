package com.example.registrationfom

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.Calendar

class MainActivity : AppCompatActivity(){
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.click)
        val datePick = findViewById<TextView>(R.id.dob)

        val cal = Calendar.getInstance()
        val date = cal.get(Calendar.DAY_OF_MONTH)
        val month = cal.get(Calendar.MONTH)
        val year = cal.get(Calendar.YEAR)

        datePick.setOnClickListener {
            val dpd = DatePickerDialog(this, { _: DatePicker?, mYear: Int, mMonth: Int, mDay: Int ->
                datePick.text = ""+mDay+"/"+mMonth+1+"/"+mYear
            },year,month,date)

            dpd.show()
        }


        button.setOnClickListener {
            callActivity()
        }
    }
    @SuppressLint("WrongViewCast")
    private fun callActivity()
    {
        val textName = findViewById<EditText>(R.id.name)
        val dOB = findViewById<TextView>(R.id.dob)
        val aDD = findViewById<EditText>(R.id.add)

        val message1 = textName.text.toString()
        val message2 = dOB.text.toString()
        val message3 = aDD.text.toString()

        Intent(this,Details::class.java).also {

            it.putExtra("mess1",message1)
            it.putExtra("mess2",message2)
            it.putExtra("mess3",message3)
            startActivity(it)
        }
    }
}