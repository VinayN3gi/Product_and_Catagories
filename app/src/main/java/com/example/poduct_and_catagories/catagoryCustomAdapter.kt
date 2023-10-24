package com.example.poduct_and_catagories

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class catagoryCustomAdapter(var context: Context,var catagoryList:List<catagories>,var itemClick:(catagories)->Unit): RecyclerView.Adapter<catagoryCustomAdapter.catagoryHolder>() {
    /*passing variables context which will be of type context and categoryList of type
    list of categories class
    creating a onclick listener which will take in type category */
    inner class catagoryHolder(itemView: View,itemClick: (catagories) -> Unit):RecyclerView.ViewHolder(itemView){
        var catgoryName=itemView.findViewById<TextView>(R.id.catagoryTitle)
        var catgoryImage=itemView.findViewById<ImageView>(R.id.catagoryImage)
        // creating a binding function to bind list to custom adapter
        fun catagoryBinding(context:Context,cata: catagories){
            catgoryName.text=cata.catagoryName
            var resourceId=context.resources.getIdentifier(cata.catagoryImage,"drawable",context.packageName)
            catgoryImage.setImageResource(resourceId)
            itemView.setOnClickListener{itemClick(cata)}
        }
    }

    @SuppressLint("InflateParams")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): catagoryHolder {
        /*Create a variable categoryView which will inflate the custom created layout
        passing the variable as a view parameter*/
        val catagoryView=LayoutInflater.from(context).inflate(R.layout.catagory_custom_view,null)
        return catagoryHolder(catagoryView,itemClick)

    }

    override fun getItemCount(): Int {
        return catagoryList.count()
    }

    override fun onBindViewHolder(holder: catagoryHolder, position: Int) {
        holder.catagoryBinding(context,catagoryList[position])
    }
}