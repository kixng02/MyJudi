package com.example.myjudi2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ccleInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ccle_info)

        val askmeTv = findViewById<TextView>(R.id.AskMeTV3)

        askmeTv.setOnClickListener {

         askmeTv.setOnClickListener {

             val intent=Intent(this,UserQuestions::class.java)
             startActivity(intent)
         }
        }
    }
}