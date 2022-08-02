package com.example.a3month6hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.container_one, MainFragment()).commit()
        supportFragmentManager.beginTransaction().add(R.id.container_two, SecondFragment()).commit()
    }
}