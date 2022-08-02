package com.example.a3month6hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a3month6hw.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
binding.tvResult.text = intent.getStringExtra("key")
    }
}