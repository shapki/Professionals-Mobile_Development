package com.example.professionalsmobileapps_test.session1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.professionalsmobileapps_test.databinding.OnBoarding3Binding

class OnBoarding3Activity : AppCompatActivity() {

    private lateinit var binding: OnBoarding3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = OnBoarding3Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}