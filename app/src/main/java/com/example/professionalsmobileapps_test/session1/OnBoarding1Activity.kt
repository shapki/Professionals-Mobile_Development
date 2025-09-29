package com.example.professionalsmobileapps_test.session1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.professionalsmobileapps_test.databinding.OnBoarding1Binding

class OnBoarding1Activity : AppCompatActivity() {

    private lateinit var binding: OnBoarding1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = OnBoarding1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setupClickListeners()
    }

    private fun setupClickListeners() {
        binding.skipButton.setOnClickListener {
            val intent = Intent(this, OnBoarding3Activity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }

        binding.nextButton.setOnClickListener {
            val intent = Intent(this, OnBoarding2Activity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }
    }
}