package com.pascaline.beautysalon

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pascaline.beautysalon.databinding.FragmentProductBinding
import com.pascaline.beautysalon.databinding.ProductListItemBinding
import com.squareup.picasso.Picasso

class ProductsAdapter<T:Any>(var ProductList:List<Class<T>>):RecyclerView.Adapter<ProductViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        var binding=ProductListItemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return ProductViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        var currentProduct=ProductList.get(position)
//        var OilList=ProductList.toList<HairOil>()
        if (ProductList is List<HairOil> ){
        Picasso.get().load(currentProduct.image)
            .resize(150,150)
            .centerCrop()
//            .networkPolicy(NetworkPolicy.OFFLINE)
            .into(holder.binding.imgPro)    }
    }

    override fun getItemCount(): Int {
         return ProductList.size
    }
}
class ProductViewHolder(var binding: ProductListItemBinding):RecyclerView.ViewHolder(binding.root)
