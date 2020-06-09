package com.mune0903.suzuri.common

import android.widget.ImageView
import com.bumptech.glide.Glide
import androidx.databinding.BindingAdapter

@BindingAdapter("app:image")
fun loadImage(v: ImageView, url: String?) {
    Glide
        .with(v.context)
        .load(url)
        .centerCrop()
        .into(v)
}