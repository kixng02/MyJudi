package com.example.myjudi2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Homepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homepage)

        var btn1 = findViewById<Button>(R.id.btn1)
        var btn2 = findViewById<Button>(R.id.btn2)
        var btn3 = findViewById<Button>(R.id.btn3)
        var btn4 = findViewById<Button>(R.id.btn4)



        btn1.setOnClickListener {

            val intent= Intent(this,JudiCategories::class.java)
            startActivity(intent)
        }

        btn2.setOnClickListener {

            val intent= Intent(this,JudiStream::class.java)
            startActivity(intent)
        }

        btn3.setOnClickListener {

            val intent= Intent(this,JudiAmmends::class.java)
            startActivity(intent)
        }

        btn4.setOnClickListener {

            val intent= Intent(this,JudiPetitions::class.java)
            startActivity(intent)
        }

    }
}