package com.pascaline.beautysalon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pascaline.beautysalon.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding:ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupBottomNav()
    }
    fun setupBottomNav() {
        binding.bnvHome.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home -> {
                    val transaction = supportFragmentManager.beginTransaction().replace(R.id.fcvHome, HomeFragment()).commit()
                    true }

                R.id.product -> {
                    val transaction = supportFragmentManager.beginTransaction().replace(R.id.fcvHome, ProductFragment()).commit()
                    true }

                R.id.service -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome, ServiceFragment()).commit()
                    true }

                R.id.book -> {
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome, BookFragment()).commit()
                    true }

                else -> false


            }
        }
    }


}