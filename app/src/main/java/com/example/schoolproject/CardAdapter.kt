package com.example.schoolproject

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.schoolproject.databinding.CardBinding
import com.example.schoolproject.dataclass.Card


class CardAdapter(private val context:Context,private  val  cards:MutableList<Card>):
RecyclerView.Adapter<CardAdapter.CardViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        val binding = CardBinding.inflate(layoutInflater,parent,false)
        val cardViewHolder = CardViewHolder(binding)
        return  cardViewHolder
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
      holder.bind(cards[position])
    }

    override fun getItemCount(): Int {
       return cards.size
    }
    inner  class CardViewHolder(private val binding: CardBinding):
            RecyclerView.ViewHolder(binding.root){
                fun bind(card: Card){
                    binding.name.text= card.name

                }
            }
}