package com.raithavarta.app.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.raithavarta.app.R
import com.raithavarta.app.model.Tip

class TipAdapter(private val tips: List<Tip>) :
    RecyclerView.Adapter<TipAdapter.TipViewHolder>() {

    class TipViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val image: ImageView = view.findViewById(R.id.tipImage)
        val title: TextView = view.findViewById(R.id.tipTitle)
        val description: TextView = view.findViewById(R.id.tipDescription)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TipViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_tip, parent, false)

        return TipViewHolder(view)
    }

    override fun onBindViewHolder(holder: TipViewHolder, position: Int) {
        val tip = tips[position]

        holder.image.setImageResource(tip.image)
        holder.title.text = tip.title
        holder.description.text = tip.description
    }

    override fun getItemCount(): Int = tips.size
}
