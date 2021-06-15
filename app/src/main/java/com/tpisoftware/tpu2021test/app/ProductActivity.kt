package com.tpisoftware.tpu2021test.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.tpisoftware.tpu2021test.R
import com.tpisoftware.tpu2021test.adapter.ProductFeatureAdapter
import com.tpisoftware.tpu2021test.adapter.ProductImageAdapter
import com.tpisoftware.tpu2021test.adapter.ProductSpecAdapter
import com.tpisoftware.tpu2021test.adapter.ProductTitleAdapter
import com.tpisoftware.tpu2021test.databinding.ActivityProductBinding

class ProductActivity : AppCompatActivity() {

    lateinit var binding: ActivityProductBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProductBinding.inflate(LayoutInflater.from(this))
        setContentView(binding.root)
        init()
    }

    private fun init() {
        // 從字串陣列取值
        val image = resources.getStringArray(R.array.product_image)
        val title = resources.getStringArray(R.array.product_title)
        val spec = resources.getStringArray(R.array.product_spec)
        val feature = resources.getStringArray(R.array.product_feature)
        // 產生 adapter
        val imageAdapter = ProductImageAdapter(image)
        val titleAdapter = ProductTitleAdapter(title)
        val specAdapter = ProductSpecAdapter(spec)
        val featureAdapter = ProductFeatureAdapter(feature)
        // 連在一起
        //val concatAdapter = ConcatAdapter(imageAdapter, titleAdapter, specAdapter, featureAdapter)
        // 共用 cache pool
        val config = ConcatAdapter.Config.Builder().setIsolateViewTypes(false).build()
        val concatAdapter = ConcatAdapter(config, imageAdapter, titleAdapter, specAdapter, featureAdapter)
        // 設定 recyclerview
        binding.productRecyclerview.apply {
            layoutManager = LinearLayoutManager(
                this@ProductActivity,
                LinearLayoutManager.VERTICAL,
                false)
            isNestedScrollingEnabled = false
            adapter = concatAdapter
        }
    }
}

