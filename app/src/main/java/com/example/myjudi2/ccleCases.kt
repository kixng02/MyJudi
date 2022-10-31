package com.example.myjudi2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ccleCases : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ccle_cases)

        val cases2=findViewById<TextView>(R.id.cases2)

        cases2.setOnClickListener {
            val intent= Intent(this,MakhwebaneCase::class.java)
            startActivity(intent)
        }
    }
}