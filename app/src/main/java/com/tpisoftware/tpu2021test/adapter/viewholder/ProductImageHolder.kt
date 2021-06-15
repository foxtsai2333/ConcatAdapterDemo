package com.tpisoftware.tpu2021test.adapter.viewholder

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.tpisoftware.tpu2021test.R

class ProductImageHolder(v: View) : RecyclerView.ViewHolder(v) {
    val productImage: ImageView = v.findViewById(R.id.product_image)
}
