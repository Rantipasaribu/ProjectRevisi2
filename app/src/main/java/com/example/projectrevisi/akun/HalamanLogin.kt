package com.example.projectrevisi.akun

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction
import com.example.projectrevisi.Home
import com.example.projectrevisi.MainActivity
import com.example.projectrevisi.R
import com.example.projectrevisi.databinding.LoginBinding

//import com.example.projectrevisi.fragments.Home

class HalamanLogin: AppCompatActivity(){
    private lateinit var binding: LoginBinding
    lateinit var home: Home

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.logRegis.setOnClickListener {
            val intent = Intent(this,HalamanRegistrasi::class.java)
            startActivity(intent)
        }
        binding.logBtn.setOnClickListener {
            if(intent.hasExtra("nama")){
                val nama: String = this.intent.getStringExtra("nama").toString()
                val username: String = this.intent.getStringExtra("username").toString()
                val pass: String = this.intent.getStringExtra("pass").toString()
                login(nama, pass, username)
            }
            else{
                Toast.makeText(this,"akun belum ada", Toast.LENGTH_SHORT).show()
            }
        }
    }
    fun login(namaBaru:String, usernameBaru: String ,passBaru:String){

        val username = binding.logUsername.getText().toString()
        val pass = binding.logPass.getText().toString()

        if (username == usernameBaru) {
            if (passBaru == pass) {
                val intent = Intent(this,MainActivity::class.java)
                intent.putExtra("nama", namaBaru)

                startActivity(intent)
                Toast.makeText(this, "anda berhasil login", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this,"password salah", Toast.LENGTH_SHORT).show()
            }
        }
        else{
            Toast.makeText(this,"username salah", Toast.LENGTH_SHORT).show()
        }
    }

}