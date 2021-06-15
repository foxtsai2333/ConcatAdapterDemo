package com.tpisoftware.tpu2021test.adapter.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tpisoftware.tpu2021test.R

class ProductTitleHolder(v: View) : RecyclerView.ViewHolder(v) {
    val productNameText: TextView = v.findViewById(R.id.product_name_text)
    val productPriceText: TextView = v.findViewById(R.id.product_price_text)
}
