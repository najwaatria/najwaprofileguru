package com.example.najwaprofiles

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class main2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var button1 =  findViewById<Button>(R.id.button3)
        button1.setOnClickListener{
            val intent1 = Intent (this, MainActivity::class.java)
            startActivity(intent1)
        }
    }
}