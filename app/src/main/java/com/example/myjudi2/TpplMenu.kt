package com.example.myjudi2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class TpplMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tppl_menu)

        val InfoBtn=findViewById<ImageButton>(R.id.InfoBtn)
        val CasesBtn=findViewById<ImageButton>(R.id.CasesBtn)

        InfoBtn.setOnClickListener {
            val intent=Intent(this,pplInfo::class.java)
            startActivity(intent)
        }

        CasesBtn.setOnClickListener {
            val intent=Intent(this,pplCases::class.java)
            startActivity(intent)
        }


    }
}