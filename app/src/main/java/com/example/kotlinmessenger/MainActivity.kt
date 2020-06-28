package com.example.kotlinmessenger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val regUsername = register_username.text.toString()
        val regEmail = register_email.text.toString()
        val regPassword = register_password.text.toString()

        register_register_button.setOnClickListener {
            val regUsername = register_username.text.toString()
            val regEmail = register_email.text.toString()
            val regPassword = register_password.text.toString()

            Log.d("MessageTest", "The button got hit, son. Username is: $regUsername and the password is: $regPassword")
        }

        register_already_have_account.setOnClickListener {
            //Launch login activity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}
