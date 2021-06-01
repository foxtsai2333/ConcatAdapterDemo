package com.tpisoftware.tpu2021test.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tpisoftware.tpu2021test.R
import com.tpisoftware.tpu2021test.adapter.viewholder.ProductFeatureHolder

class ProductFeatureAdapter(private val itemList: Array<String>) : RecyclerView.Adapter<ProductFeatureHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductFeatureHolder {
        return ProductFeatureHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.listitem_product_feature, parent, false))
    }

    override fun onBindViewHolder(holder: ProductFeatureHolder, position: Int) {
        itemList[position].let {
            holder.featureText.text = it
        }
    }

    override fun getItemCount(): Int = itemList.size
}
