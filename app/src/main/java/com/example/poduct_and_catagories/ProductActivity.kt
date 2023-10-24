package com.example.poduct_and_catagories

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ProductActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)
        var catagoryName=intent.getStringExtra(EXTRA_CATAGORY)
        var Adapter=customProductRecyler(this,dataServices.catagoryType(catagoryName))
        var recyclerView=findViewById<RecyclerView>(R.id.recyclerView2)
        var Manager=GridLayoutManager(this,2)
        recyclerView.adapter=Adapter
        recyclerView.layoutManager=Manager

    }
}