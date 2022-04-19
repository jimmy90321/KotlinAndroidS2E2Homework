package com.jerrystudio.s2e2homework

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.jerrystudio.s2e2homework.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()

        binding.btnSubmit.setOnClickListener {
            val text = binding.etInput.text?.toString() ?: ""
            binding.tvOutput.text = text
        }
    }
}