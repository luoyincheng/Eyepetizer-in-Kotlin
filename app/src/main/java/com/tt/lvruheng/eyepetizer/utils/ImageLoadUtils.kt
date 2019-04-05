package com.tt.lvruheng.eyepetizer.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.DrawableTransformation
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions
import com.bumptech.glide.request.RequestOptions
import com.tt.lvruheng.eyepetizer.R

/**
 * Created by lvruheng on 2017/7/6.
 */
class ImageLoadUtils {

    companion object {

        fun getRequestQptions1(): RequestOptions = RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .placeholder(R.drawable.ic_image_loading)
                .error(R.drawable.ic_empty_picture)

        fun getRequestQptions2(): RequestOptions = RequestOptions()
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .format(DecodeFormat.PREFER_ARGB_8888)
                .placeholder(R.drawable.ic_image_loading)
                .centerCrop()
                .error(R.drawable.ic_empty_picture)

        fun display(context: Context, imageView: ImageView?, url: String) {
            if (imageView == null) {
                throw IllegalArgumentException("argument error")
            }
            Glide.with(context)
                    .load(url)
                    .apply(getRequestQptions1())
                    .transition(DrawableTransitionOptions.withCrossFade())
                    .into(imageView)
        }

        fun displayHigh(context: Context, imageView: ImageView?, url: String) {
            if (imageView == null) {
                throw IllegalArgumentException("argument error")
            }
            Glide.with(context)
                    .asBitmap()
                    .load(url)
                    .apply(getRequestQptions2())
                    .into(imageView)
        }
    }

}