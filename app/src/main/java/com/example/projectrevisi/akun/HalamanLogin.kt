package com.example.projectrevisi.akun

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.projectrevisi.Home
import com.example.projectrevisi.MainActivity
import com.example.projectrevisi.databinding.LoginBinding

class HalamanLogin : AppCompatActivity() {
    private lateinit var binding: LoginBinding
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        sharedPreferences = getSharedPreferences("AkunData", Context.MODE_PRIVATE)

        binding.logRegis.setOnClickListener {
            val intent = Intent(this, HalamanRegistrasi::class.java)
            startActivity(intent)
        }
        binding.loginUser.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.logBtn.setOnClickListener {
            // Ambil data akun dari SharedPreferences
            val usernameBaru = sharedPreferences.getString("Username", "")
            val passBaru = sharedPreferences.getString("Pass", "")

            val username = binding.logUsername.text.toString()
            val pass = binding.logPass.text.toString()

            if (username == usernameBaru && pass == passBaru) {
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("usernamebaru", usernameBaru)
                startActivity(intent)
                Toast.makeText(this, "Anda berhasil login", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Username atau password salah", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
