package com.example.myjudi2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class cclInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ccl_info)


        val askMe=findViewById<TextView>(R.id.AskMeTV22)


        askMe.setOnClickListener {

            val intent=Intent(this,UserQuestions::class.java)
            startActivity(intent)
        }
    }
}