package com.example.lab3dailytips.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3dailytips.R
import com.example.lab3dailytips.data.Tip

class TipAdapter(
    private val tips: List<Tip>,
    private val onItemClick: (Tip) -> Unit
) : RecyclerView.Adapter<TipViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tip, parent, false)
        return TipViewHolder(view)
    }

    override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
        val tip = tips[position]

        holder.tvDay.text = "День ${tip.day}"
        holder.tvTitle.text = tip.title
        holder.tvShortDesc.text = tip.shortDescription
        holder.imageTip.setImageResource(tip.imageResId)

        holder.itemView.setOnClickListener {
            onItemClick(tip)
        }
    }

    override fun getItemCount(): Int = tips.size
}