package com.tpisoftware.tpu2021test.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tpisoftware.tpu2021test.R
import com.tpisoftware.tpu2021test.adapter.viewholder.ProductImageHolder

class ProductImageAdapter(private val itemList: Array<String>) : RecyclerView.Adapter<ProductImageHolder>() {
    private val TAG = ProductImageAdapter::class.java.simpleName
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductImageHolder {
        return ProductImageHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.listitem_product_image, parent, false))
    }

    override fun onBindViewHolder(holder: ProductImageHolder, position: Int) {
        val item = itemList[position]
        holder.productImage.apply {
            val id = (this.parent as ViewGroup).context.let {
                it.resources.getIdentifier(item, "drawable", it.packageName)
            }
            if (id != 0) {
                setImageResource(id)
            } else {
                Log.e(TAG, "onBindViewHolder: fail to get image resource id from name")
            }
        }
    }

    override fun getItemCount(): Int = itemList.size
}
