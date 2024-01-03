package com.example.projectrevisi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.projectrevisi.databinding.ActivityMainBinding
import com.example.projectrevisi.databinding.DetilBeritaBinding

class DetilBerita : AppCompatActivity() {

    private lateinit var binding: DetilBeritaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DetilBeritaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        if (intent.hasExtra("namanya") && intent.hasExtra("detailnya")) {
            val nama: String = intent.getStringExtra("namanya").toString()
            val detail: String = intent.getStringExtra("detailnya").toString()
            val foto: String = intent.getStringExtra("fotonya").toString()
            setDetil(foto, nama, detail)
        }
    }

    fun setDetil(foto: String, nama:String, detail:String) {
        val requesOp = RequestOptions()
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)

        binding.namaDetilBerita.text = detail
        Glide.with(this)
            .load(foto)
            .apply(requesOp)
            .centerCrop()
            .into(binding.fotoDetilBerita)
    }


}
