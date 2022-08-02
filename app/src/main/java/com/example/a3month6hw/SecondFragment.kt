package com.example.a3month6hw

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a3month6hw.databinding.FragmentSecondBinding

class SecondFragment : Fragment(), onClickListen {
private lateinit var binding: FragmentSecondBinding
private lateinit var adapter: SecondAdapter
private lateinit var data: ArrayList<Music>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        loadData()
adapter = SecondAdapter(data, this)
        binding.recyclerView.adapter = adapter
    }

    private fun loadData() {
data  = ArrayList()
        data.apply {
            add(Music(1,"Blank Space", "Taylor Swift",   "3:22"));
            add(Music(2,"Watch me", "Silento",  "5:36"));
            add(Music(3,"Earned it", "The Weekend",  "4:51"));
            add(Music(4,"The Hills", "The Weekend",   "3:41"));
            add(Music(5,"Writing's On The Wall", "Sam Smith, Jimmy Nape",   "5:33"));
        }
    }

    override fun onClick(music: Music) {

val intent: Intent = Intent(activity, SecondActivity::class.java)
        intent.putExtra("key", music.name)
        startActivity(intent)
    }

}