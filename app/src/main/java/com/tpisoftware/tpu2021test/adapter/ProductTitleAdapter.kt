package com.tpisoftware.tpu2021test.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tpisoftware.tpu2021test.R
import com.tpisoftware.tpu2021test.adapter.viewholder.ProductTitleHolder

class ProductTitleAdapter(private val itemList: Array<String>) : RecyclerView.Adapter<ProductTitleHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductTitleHolder {
        return ProductTitleHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.listitem_product_title, parent, false))
    }

    override fun onBindViewHolder(holder: ProductTitleHolder, position: Int) {
        val item = itemList[position]
        // 偷懶把 name 跟 price 混在一起
        val texts = item.split(" ")
        holder.apply {
            productNameText.text = texts[0]
            productPriceText.text = texts[1]
        }
    }

    override fun getItemViewType(position: Int): Int {
        return R.layout.listitem_product_title
    }

    override fun getItemCount(): Int = itemList.size
}
