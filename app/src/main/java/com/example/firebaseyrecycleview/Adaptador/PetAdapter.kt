package com.example.firebaseyrecycleview.Adaptador

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.firebaseyrecycleview.Pet
import com.example.firebaseyrecycleview.R

class PetAdapter(private val petList:List<Pet>):RecyclerView.Adapter<PetViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PetViewHolder {
        val layoutInflater=LayoutInflater.from(parent.context)
        return PetViewHolder(layoutInflater.inflate(R.layout.view_pet_single,parent,false))
    }

    override fun onBindViewHolder(holder: PetViewHolder, position: Int) {
        val item=petList[position]
        holder.Render(item)
    }

    override fun getItemCount(): Int {
         return petList.size
    }
}