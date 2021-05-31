package com.tpisoftware.tpu2021test.adapter.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tpisoftware.tpu2021test.R

class ProductSpecHolder(v: View) : RecyclerView.ViewHolder(v) {
    val specText: TextView = v.findViewById(R.id.product_spec_text)
}