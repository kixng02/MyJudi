package com.example.myjudi2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TVcleMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tvcle_menu)

        val cBtn=findViewById<ImageButton>(R.id.CasesBtn)
         val iBtn=findViewById<ImageButton>(R.id.InfoBtn)


        cBtn.setOnClickListener {

            val intent= Intent(this,ccleCases::class.java)
            startActivity(intent)
        }


        iBtn.setOnClickListener {
            val intent=Intent(this,ccleInfo::class.java)
            startActivity(intent)
        }
    }
}