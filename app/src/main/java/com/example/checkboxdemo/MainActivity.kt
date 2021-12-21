package com.example.checkboxdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var c1: CheckBox
    private lateinit var c2: CheckBox
    private lateinit var c3: CheckBox
    private lateinit var tv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        c1 = findViewById(R.id.checkBox)
        c2 = findViewById(R.id.checkBox2)
        c3 = findViewById(R.id.checkBox3)
        tv = findViewById(R.id.orderTotal)
    }

    fun click() {
        var menuTotal = 0
        if (c1.isChecked) {
            Toast.makeText(this, "Pizza Selected", Toast.LENGTH_SHORT).show()
            menuTotal += 10
        }
        if (c2.isChecked) {
            Toast.makeText(this, "Coke Selected", Toast.LENGTH_SHORT).show()
            menuTotal += 5
        }
        if (c3.isChecked) {
            Toast.makeText(this, "Burger Selected", Toast.LENGTH_SHORT).show()
            menuTotal +=10
        }
        Toast.makeText(this,"Total is $$menuTotal", Toast.LENGTH_LONG).show()
        "Order total: $$menuTotal".also { tv.text = it }
    }
}