package com.example.myjudi2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class TVclclMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tvclcl_menu)

        val caseBtn=findViewById<ImageButton>(R.id.CasesBtn)
        val  infoBtn=findViewById<ImageButton>(R.id.InfoBtn)

        caseBtn.setOnClickListener{

            val intent= Intent(this,cclCases::class.java)
            startActivity(intent)
        }

        infoBtn.setOnClickListener {

            val intent=Intent(this,cclInfo::class.java)
            startActivity(intent)

        }
    }
}