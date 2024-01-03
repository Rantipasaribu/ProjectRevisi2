package com.example.projectrevisi.akun

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projectrevisi.databinding.RegistrasiBinding

class HalamanRegistrasi : AppCompatActivity() {
    private lateinit var binding: RegistrasiBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RegistrasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = getSharedPreferences("AkunData", Context.MODE_PRIVATE)

        binding.regBtn.setOnClickListener {
            val username = binding.regUsername.text.toString()
            val pass = binding.regPass.text.toString()

            // Simpan data akun ke SharedPreferences
            with(sharedPreferences.edit()) {
                putString("Username", username)
                putString("Pass", pass)
                apply()
            }

            val intent = Intent(this, HalamanLogin::class.java)
            startActivity(intent)
        }
    }
}
