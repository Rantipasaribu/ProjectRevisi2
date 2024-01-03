package com.example.projectrevisi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.projectrevisi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var beritaAdapter: BeritaRecylcerAdapter
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
        tambahDataSet()
        replaceFragment(Home())

        binding.bottomNavigationView.setOnNavigationItemSelectedListener {

            when (it.itemId) {

                R.id.home -> replaceFragment(Home())
                R.id.grafik -> replaceFragment(Grafik())
                R.id.tentang -> replaceFragment(Tentang())

                else -> {

                }
            }

            true
        }
    }

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,fragment)
        fragmentTransaction.commit()
    }

    private fun tambahDataSet(){
        val data = SumberBerita.buatSetData()
        beritaAdapter.submitList(data)

    }

    private fun initRecyclerView() {
        binding.recylerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            val spacingAtas = DekorasiSpasiGambar(20)
            addItemDecoration(spacingAtas)
            beritaAdapter = BeritaRecylcerAdapter()
            adapter = beritaAdapter
        }
    }

}