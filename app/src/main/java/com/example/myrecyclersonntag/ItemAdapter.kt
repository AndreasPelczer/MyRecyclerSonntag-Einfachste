package com.example.myrecyclersonntag

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter (
    private val itemList:List<Item>
):RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item=itemList[position]
        holder.titleTextView.text=item.title
        holder.descriptionTextView.text=item.description
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    inner class ViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val titleTextView:TextView=itemView.findViewById(R.id.titleTextView)
        val descriptionTextView:TextView=itemView.findViewById(R.id.descriptionTextView)
    }


}