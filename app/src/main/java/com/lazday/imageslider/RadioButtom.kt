package com.example.androiddasar

import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.lazday.imageslider.R

class RadioButtom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setupListener()
    }

    fun setupListener() {
        val radioButton = findViewById<RadioButton>(R.id.radio)
        radioButton.setOnCheckedChangeListener { radio, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, radioButton.text, Toast.LENGTH_SHORT).show()
            }
        }

        val radioGroup = findViewById<RadioButton>(R.id.radio1)
        radioGroup.setOnCheckedChangeListener { group, isChecked ->
            if (isChecked) {
                Toast.makeText(applicationContext, radioGroup.text, Toast.LENGTH_SHORT).show()
            }
        }
    }
}