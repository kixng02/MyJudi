package com.example.myjudi2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class pplCases : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ppl_cases)

        val TVCase1=findViewById<TextView>(R.id.TVCase1)

        TVCase1.setOnClickListener {
            val intent= Intent(this,JohnsonCase::class.java)
            startActivity(intent)
        }
    }
}