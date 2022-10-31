package com.example.myjudi2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class pplInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ppl_info)

        val ask=findViewById<TextView>(R.id.AskMeTV4)

        ask.setOnClickListener {

            val intent=Intent(this,UserQuestions::class.java)
            startActivity(intent)
        }
    }
}