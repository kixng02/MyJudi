package com.example.myjudi2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TVmilMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tvmil_menu)

        val caBtn=findViewById<ImageButton>(R.id.CasesBtn)
        val inBtn=findViewById<ImageButton>(R.id.InfoBtn)


        caBtn.setOnClickListener {

            val intent=Intent(this,mmlCases::class.java)
            startActivity(intent)
        }

        inBtn.setOnClickListener {

            val intent=Intent(this,mmlInfo::class.java)
            startActivity(intent)
        }

    }
}