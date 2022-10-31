package com.example.myjudi2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class mmlInfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mml_info)

        val askMeTv=findViewById<TextView>(R.id.AskMeTV3)


        askMeTv.setOnClickListener {

            val intent= Intent(this,UserQuestions::class.java)
            startActivity(intent)
        }
    }
}