package io.liaojie1314.databinding.adapter

import android.graphics.drawable.Drawable
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import io.liaojie1314.databinding.R


class Test {
    companion object {
        @BindingAdapter(value = ["imageUrl", "placeHolder"], requireAll = false)
        @JvmStatic
        fun test(imageView:ImageView,imageUrl:String,placeHolder:Drawable) {
            Glide.with(imageView.context)
                .load(imageUrl)
                .placeholder(placeHolder)
                .into(imageView)
        }
    }
}