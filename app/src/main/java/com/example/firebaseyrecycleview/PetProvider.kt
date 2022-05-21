package com.example.firebaseyrecycleview

import android.content.ContentValues.TAG
import android.util.Log
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class PetProvider {
    companion object{


        val db = Firebase.firestore


        fun cargar(){
            db.collection("users")
                .get()
                .addOnSuccessListener {
                    direction.setText(it.get("Direccion") as String?)
//                telefono.setText(it.get("Telefono") as String?)
//
        }

//        Recuerar.setOnClickListener(){
//            db.collection("users").document(email).get().addOnSuccessListener{
//                direction.setText(it.get("Direccion") as String?)
//                telefono.setText(it.get("Telefono") as String?)
//
//            }




        val petList= listOf<Pet>(
            Pet(
                 "Rino",
                1,
            "negro"
            ),
            Pet(
                "scud",
                3,
                "blanco"
            ),
            Pet(
                "scud",
                3,
                "hola"
            )


        )
    }
}