package com.example.poduct_and_catagories

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import org.w3c.dom.Text

class customProductRecyler(var context:Context,var productList:List<Products>): RecyclerView.Adapter<customProductRecyler.ProductHolder>() {
    inner class ProductHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var productName=itemView.findViewById<TextView>(R.id.productName)
        var productPrice=itemView.findViewById<TextView>(R.id.productPrice)
        var productImage=itemView.findViewById<ImageView>(R.id.productImage)
        fun productBinding(context: Context,products: Products){
            productName.text=products.productName
            productPrice.text=products.productPrice
            var resourceId=context.resources.getIdentifier(products.productImage,"drawable",context.packageName)
            productImage.setImageResource(resourceId)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
       val view=LayoutInflater.from(context).inflate(R.layout.product_custom_view,null)
        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return productList.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.productBinding(context,productList[position])
    }
}