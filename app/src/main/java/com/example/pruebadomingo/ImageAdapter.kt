package com.example.pruebadomingo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.viewpager.widget.PagerAdapter

class ImageAdapter(private val context: Context) : PagerAdapter() {

    private val imageIds = intArrayOf(R.drawable.image1, R.drawable.image2, R.drawable.image3)

    override fun getCount(): Int {
        return imageIds.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.image_layout, container, false)
        val imageView: ImageView = view.findViewById(R.id.imageView)
        imageView.setImageResource(imageIds[position])
        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}
