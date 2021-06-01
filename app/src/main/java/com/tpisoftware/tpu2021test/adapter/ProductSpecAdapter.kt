package com.tpisoftware.tpu2021test.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tpisoftware.tpu2021test.R
import com.tpisoftware.tpu2021test.adapter.viewholder.ProductSpecHolder

class ProductSpecAdapter(private val itemList: Array<String>) : RecyclerView.Adapter<ProductSpecHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductSpecHolder {
        return ProductSpecHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.listitem_product_spec, parent, false))
    }

    override fun onBindViewHolder(holder: ProductSpecHolder, position: Int) {
        itemList[position].let {
            holder.specText.text = it
        }
    }

    override fun getItemCount(): Int = itemList.size
}
