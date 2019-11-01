package com.example.responsi_321

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        loginbtn.setOnClickListener {
            val email = user.text.toString()
            val password = pass.text.toString()
            if (email.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please Insert Email and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if (email == "dananghk321@gmail.com" || password == "danang321") {
                val intent = Intent(this, Home_Activity::class.java)
                startActivity(intent)
            }
        }

        create.setOnClickListener{
            val intent = Intent (this, Activity_register::class.java)
            startActivity(intent)
        }
    }
}
