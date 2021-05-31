package com.tpisoftware.tpu2021test.adapter.viewholder

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.tpisoftware.tpu2021test.R

class ProductFeatureHolder(v: View) : RecyclerView.ViewHolder(v) {
    val featureIcon: ImageView = v.findViewById(R.id.feature_icon)
    val featureText: ImageView = v.findViewById(R.id.feature_text)
}