package com.example.myjudi2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val Cmail= findViewById<EditText>(R.id.C_id)
        val Cpassword=findViewById<EditText>(R.id.Cpassword)
        val forgotPassword=findViewById<TextView>(R.id.forgotPassword)
        val LoginBtn=findViewById<Button>(R.id.LoginBtn)
        val SignUp=findViewById<TextView>(R.id.SignUp)


        SignUp.setOnClickListener {
            val intent = Intent(this, RegisterUser::class.java)
            startActivity(intent)
        }

        forgotPassword.setOnClickListener {
            val intent = Intent(this, RecoverPassword::class.java)
            startActivity(intent)
        }


        LoginBtn.setOnClickListener {
            val intent = Intent(this, Homepage::class.java)
            startActivity(intent)

        }
    }
}