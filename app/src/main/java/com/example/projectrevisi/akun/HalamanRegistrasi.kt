package com.example.projectrevisi.akun


import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.projectrevisi.databinding.RegistrasiBinding

class HalamanRegistrasi :AppCompatActivity() {
    private lateinit var binding: RegistrasiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RegistrasiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.regBtn.setOnClickListener {
            val nama = binding.regNama.getText().toString()
            val username = binding.regUsername.getText().toString()
            val pass = binding.regPass.getText().toString()

            val intent = Intent(this,HalamanLogin::class.java)
            intent.putExtra("Nama", nama)
            intent.putExtra("Username", username)
            intent.putExtra("Pass", pass)
            startActivity(intent)
        }
    }
}