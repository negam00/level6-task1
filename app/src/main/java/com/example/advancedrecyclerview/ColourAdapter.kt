package com.example.advancedrecyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_colour.view.*

class ColourAdapter(private val colours: List<ColourItem>) :
    RecyclerView.Adapter<ColourAdapter.ViewHolder>() {

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_colour, parent, false)
        )
    }

    override fun getItemCount(): Int  = colours.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) = holder.bind(colours[position])

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(colourItem: ColourItem){
            Glide.with(context).load(colourItem.getImageUrl()).into(itemView.ivColour)
        }
    }

}