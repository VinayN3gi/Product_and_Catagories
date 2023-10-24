package com.example.poduct_and_catagories

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Telephony.Sms.Intents
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView=findViewById<RecyclerView>(R.id.catagoryRecyclerView)
        var Adapter=catagoryCustomAdapter(this,dataServices.catagoriesList){
            item->
                var productIntent= Intent(this,ProductActivity::class.java).apply{
                    putExtra(EXTRA_CATAGORY,item.catagoryName)
                }
                startActivity(productIntent)


        }
        recyclerView.adapter=Adapter
        var manager=LinearLayoutManager(this)
        recyclerView.layoutManager=manager

    }
}