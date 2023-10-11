package com.example.projectbp2673

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val btnMore: Button = findViewById(R.id.menu4)
        val btnKid: Button = findViewById(R.id.menu1)
        val rvBuku: Button = findViewById(R.id.recycleViewBuku)

        rvBuku.layoutManager = LinearLayoutManager(this)

    }
}