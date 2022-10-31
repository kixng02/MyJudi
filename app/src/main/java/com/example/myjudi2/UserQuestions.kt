package com.example.myjudi2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class UserQuestions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_questions)

        val SubmitButton=findViewById<Button>(R.id.SubmitButton)

        SubmitButton.setOnClickListener {
            val intent= Intent(this,feedbackPage::class.java)
            startActivity(intent)
            Toast.makeText(this, "Question submitted", Toast.LENGTH_SHORT).show()
        }
    }
}