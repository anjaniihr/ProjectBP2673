package com.example.projectbp2673

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //instance
        val btnLogin:Button = findViewById(R.id.button2)
        val txtUsername:EditText = findViewById(R.id.editTextUser)
        val txtPassword:EditText = findViewById(R.id.editTextPassword)
        val logmodel = LoginModel()

        //input
        logmodel.username = txtUsername.text.toString()
        logmodel.password = txtPassword.text.toString()
        //event saat button login click
        btnLogin.setOnClickListener{
            //login check
            if(logmodel.loginCheck() == true){
                //call homepage
                val intent = Intent(this,HomeActivity::class.java)
                startActivity(intent)
            }else{
                Toast.makeText(this,"Login gagal, cek username dan password",
                Toast.LENGTH_SHORT).show()
            }
        }
    }
}