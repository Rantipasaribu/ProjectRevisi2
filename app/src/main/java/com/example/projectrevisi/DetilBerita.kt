package com.example.projectrevisi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.projectrevisi.databinding.ActivityMainBinding
import com.example.projectrevisi.databinding.FragmentDetilBeritaBinding

class DetilBerita : AppCompatActivity() {

    private lateinit var binding: FragmentDetilBeritaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentDetilBeritaBinding.inflate(layoutInflater)
        val view = binding.root

        if (intent.hasExtra("namanya")) {
            val nama: String = intent.getStringExtra("namanya").toString()
            val foto: String = intent.getStringExtra("fotonya").toString()
            setDetil(foto, nama)
        }
    }

     fun setDetil(foto: String, nama: String) {
        val requesOp = RequestOptions()
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)

        binding.namaDetilBerita.text = nama
        Glide.with(this)
            .load(foto)
            .apply(requesOp)
            .centerCrop()
            .into(binding.fotoDetilBerita)
    }
}
