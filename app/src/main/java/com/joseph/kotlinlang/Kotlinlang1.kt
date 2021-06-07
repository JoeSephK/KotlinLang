package com.joseph.kotlinlang

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button

class Kotlinlang1 : AppCompatActivity() {
    private var TIME_OUT:Long = 4000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlinlang1)
        val button= findViewById<Button>(R.id.button)
        button.setOnClickListener(){
         val intent= Intent (this,Kotlinlang2::class.java)
            startActivity(intent)

        }

    }

}
