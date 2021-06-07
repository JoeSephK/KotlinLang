package com.joseph.kotlinlang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Kotlinlang2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlinlang2)
        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener() {
            val intent = Intent(this, Kotlinlang1::class.java)
            startActivity(intent)

        }
    }
}