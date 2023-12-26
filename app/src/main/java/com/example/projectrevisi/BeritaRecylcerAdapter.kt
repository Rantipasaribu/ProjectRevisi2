package com.example.projectrevisi

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.projectrevisi.databinding.FragmentHomeBinding

class BeritaRecylcerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private var items : List<ListObjBerita> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BeritaViewHolder {
        val binding = FragmentHomeBinding.inflate(LayoutInflater.from(parent.context),
            parent, false)

        return BeritaViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder){
            is BeritaViewHolder -> {
                holder.bind(items.get(position))
                holder.klik.setOnClickListener{
                    holder.kalau_diklik(items.get(position))
                }
            }
        }
    }
    fun submitList(listBerita: List<ListObjBerita>) {
        items = listBerita
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class BeritaViewHolder constructor(val binding: FragmentHomeBinding) :
            RecyclerView.ViewHolder(binding.root) {

        val foto_berita: ImageView = binding.gambarBerita
        val nama_berita: TextView = binding.namaBerita
        val detail_berita: TextView = binding.detailBerita
        var klik: RelativeLayout = binding.rlKlikListBerita

        fun bind(listObjBerita: ListObjBerita) {
            nama_berita.setText(listObjBerita.namaBerita)
            detail_berita.setText(listObjBerita.detailBerita)

            val requestOp = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .placeholder(R.drawable.ic_launcher_background)

            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOp)
                .load(listObjBerita.gambarBerita)
                .into(foto_berita)
        }

        fun kalau_diklik(get: ListObjBerita) {
            Toast.makeText(
                itemView.context, "Kamu memilih : ${get.namaBerita}",
                Toast.LENGTH_SHORT
            )
                .show()

            val intent = Intent(itemView.context, DetilBerita::class.java)
            intent.putExtra("namanya", get.namaBerita)
            intent.putExtra("detailnya", get.detailBerita)
            intent.putExtra("fotonya", get.gambarBerita)
            itemView.context.startActivity(intent)

        }
    }
}