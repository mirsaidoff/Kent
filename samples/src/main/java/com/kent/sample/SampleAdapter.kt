package com.kent.sample

import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import androidx.recyclerview.widget.RecyclerView
import com.kent.layouts.*
import com.kent.layouts.viewgroup.frameLayout

/**
 * Created by abduaziz on 2020-02-24 at 13:42.
 */

class SampleAdapter : RecyclerView.Adapter<SampleAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(parent.context.frameLayout {
            layoutParams = ViewGroup.LayoutParams(matchParent, dip(56))
            padding = dip(16)
            setRippleEffect()

            textView {
                layoutParams = FrameLayout.LayoutParams(wrapContent, wrapContent)
                text = "Hello, World!"
            }
        })
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 100
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}