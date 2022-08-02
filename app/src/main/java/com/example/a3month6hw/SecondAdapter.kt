package com.example.a3month6hw

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.a3month6hw.databinding.ItemMusicBinding

class SecondAdapter(private val data: ArrayList<Music>,
                    private var onClick: onClickListen
                    ) : RecyclerView.Adapter<SecondAdapter.SFViewHolder>() {

  fun setOnClick(onClick: onClickListen){
      this.onClick = onClick
  }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SFViewHolder {
        var binding: ItemMusicBinding =
            ItemMusicBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SFViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SFViewHolder, position: Int) {
       holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    inner class SFViewHolder(private var binding: ItemMusicBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(music: Music) {
            binding.tvName.text = music.name
            binding.tvCompositor.text = music.compositor
            binding.tvNumber.text = music.number.toString()
            binding.tvClock.text = music.clock
            binding.root.setOnClickListener{
onClick.onClick(data[adapterPosition])
            }
        }

    }
}