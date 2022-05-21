package com.example.firebaseyrecycleview

import android.content.ContentValues
import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.firebaseyrecycleview.Adaptador.PetAdapter
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    val db = Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        iniRecyclerView()
//
//        db.collection("pet")
//            .get()
//            .addOnSuccessListener { result ->
//                for (document in result) {
//                    Log.d(TAG, "${document.id} => ${document.data}")
//                }
//            }
//            .addOnFailureListener { exception ->
//                Log.w(TAG, "Error getting documents.", exception)
//            }
        val cargardatos=findViewById<Button>(R.id.bAgregarFragmento)
        cargardatos.setOnClickListener(){
            db.collection("pets").get().addOnSuccessListener {

            }
        }


    }

    fun iniRecyclerView(){
        val recyvlerView=findViewById<RecyclerView>(R.id.recyclePet)
        recyvlerView.layoutManager=LinearLayoutManager(this)
        recyvlerView.adapter=PetAdapter(PetProvider.petList)
    }
}