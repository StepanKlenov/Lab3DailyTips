package com.example.lab3dailytips.ui.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.lab3dailytips.R
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3dailytips.data.Tip

class TipViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val imageTip: ImageView = itemView.findViewById(R.id.image_tip)
    val tvDay: TextView = itemView.findViewById(R.id.tv_day)
    val tvTitle: TextView = itemView.findViewById(R.id.tv_title)
    val tvShortDesc: TextView = itemView.findViewById(R.id.tv_short_desc)


}