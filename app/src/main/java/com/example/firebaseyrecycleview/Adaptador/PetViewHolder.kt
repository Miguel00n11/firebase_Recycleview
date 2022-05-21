package com.example.firebaseyrecycleview.Adaptador

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.firebaseyrecycleview.Pet
import com.example.firebaseyrecycleview.R

class PetViewHolder(view:View):RecyclerView.ViewHolder(view) {

    val petNombre=view.findViewById<TextView>(R.id.tvNombre)
    val petEdad=view.findViewById<TextView>(R.id.tvEdad)
    val petColor=view.findViewById<TextView>(R.id.tvColor)

    fun Render(petModelo: Pet){
        petNombre.text=petModelo.nombre
        petEdad.text=petModelo.age.toString()
        petColor.text=petModelo.color

    }

}