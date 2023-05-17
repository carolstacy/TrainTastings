package com.example.traintastings

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.widget.Button
import android.widget.EditText
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class registraion : AppCompatActivity() {
    lateinit var gotolog:TextView
    lateinit var edtMail:EditText
    lateinit var edtPass:EditText
    lateinit var edtName:EditText
    lateinit var registre:Button
    private lateinit var auth:FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registraion)

        //View Binding
        edtMail = findViewById(R.id.edt_email)
        edtPass = findViewById(R.id.edt_pass)
        registre = findViewById(R.id.btn_reg)
        auth = Firebase.auth

        gotolog = findViewById(R.id.txt_gotolog)
        gotolog.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

        registre.setOnClickListener {
            SignUpUser()
        }

        val password = findViewById<EditText>(R.id.edt_pass)
        val showpass = findViewById<Switch>(R.id.switch_showpass)

        showpass.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                password.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
            } else {
                password.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
            }
        }
    }

    private fun SignUpUser(){
        val email = edtMail.text.toString()
        val pass = edtPass.text.toString()
        if (email.isBlank() || pass.isBlank()) {
            Toast.makeText(this, "Please fill in all the field",Toast.LENGTH_LONG).show()
            return
        }
        auth.createUserWithEmailAndPassword(email, pass).addOnCompleteListener(this){
            if (it.isSuccessful){
                Toast.makeText(this, "Account created successfully", Toast.LENGTH_LONG).show()
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish()
            } else {
                Toast.makeText(this, "Failed to create account", Toast.LENGTH_LONG).show()
            }
        }
    }
}