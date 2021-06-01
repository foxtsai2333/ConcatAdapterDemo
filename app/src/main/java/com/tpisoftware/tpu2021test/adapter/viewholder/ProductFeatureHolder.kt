package com.tpisoftware.tpu2021test.adapter.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tpisoftware.tpu2021test.R

class ProductFeatureHolder(v: View) : RecyclerView.ViewHolder(v) {
    val featureIcon: ImageView = v.findViewById(R.id.feature_icon)
    val featureText: TextView = v.findViewById(R.id.feature_text)
}