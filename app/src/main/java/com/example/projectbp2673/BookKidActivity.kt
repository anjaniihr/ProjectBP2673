package com.example.projectbp2673

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.Fragment

class BookKidActivity : AppCompatActivity() {
    lateinit var binding:ActivityBookKidBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_kid)

        val btnFairy: Button = findViewById(R.id.buttonFairy)
        val btnFable: Button = findViewById(R.id.buttonFable)
        val btnScience: Button = findViewById(R.id.buttonScience)

        binding = ActivityBookKidBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFairy.setOnClickListener{
            replaceFragment(FairyFragment())
        }
        binding.btnFable.setOnClickListener{
            replaceFragment(FableFragment())
        }
        binding.btnScience.setOnClickListener{
            replaceFragment(ScienceFragment())
        }
    }
    private fun replaceFragment(frg: Fragment){
        val fragmentManager = supportFragmentManager
        val fragmentTrx = fragmentManager.beginTransaction()
        fragmentTrx.replace(R.id.fragmentKidBook, frg)
        fragmentTrx.commit()
    }
}