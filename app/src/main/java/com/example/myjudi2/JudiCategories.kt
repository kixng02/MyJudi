package com.example.myjudi2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class JudiCategories : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_judi_categories)

        val Tppl=findViewById<TextView>(R.id.TVppl)
        val TVcle=findViewById<TextView>(R.id.TVcle)
        val TVclcl=findViewById<TextView>(R.id.TVclcl)
        val TVmil=findViewById<TextView>(R.id.TVmil)



        Tppl.setOnClickListener {

            val intent= Intent(this,TpplMenu::class.java)
            startActivity(intent)
        }


         TVcle.setOnClickListener {

             val intent=Intent(this,TVcleMenu::class.java)
             startActivity(intent)

         }


        TVclcl.setOnClickListener {


            val intent=Intent(this,TVclclMenu::class.java)
            startActivity(intent)
        }

        TVmil.setOnClickListener {

            val intent=Intent(this,TVmilMenu::class.java)
            startActivity(intent)
        }


    }
}