package com.example.traintastings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class FirstActivity : AppCompatActivity() {
    lateinit var explore:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        explore = findViewById(R.id.btn_go)
        explore.setOnClickListener {
            val intent = Intent(this, registraion::class.java)
            startActivity(intent)
        }
    }
}