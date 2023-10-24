package com.example.poduct_and_catagories

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView=findViewById<RecyclerView>(R.id.catagoryRecyclerView)
        var Adapter=catagoryCustomAdapter(this,dataServices.catagoriesList){

        }
        recyclerView.adapter=Adapter
        var manager=LinearLayoutManager(this)
        recyclerView.layoutManager=manager

    }
}