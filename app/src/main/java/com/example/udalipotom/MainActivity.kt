package com.example.udalipotom

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.udalipotom.databinding.ActivityMainBinding
import com.example.udalipotom.ui.adpater.AdapterCounter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val adapter: AdapterCounter by lazy { AdapterCounter(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.viewPager.adapter = adapter
        binding.dotsIndicator.attachTo(binding.viewPager)
    }
}