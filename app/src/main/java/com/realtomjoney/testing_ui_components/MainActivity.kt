package com.realtomjoney.testing_ui_components

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.realtomjoney.testing_ui_components.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setBindings()

        binding.button.setOnClickListener {
            binding.textView.text = "Kotlin"
        }
    }

    private fun setBindings() {
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}