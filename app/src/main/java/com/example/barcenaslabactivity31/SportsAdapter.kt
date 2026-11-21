package com.example.barcenaslabactivity31

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.barcenaslabactivity31.databinding.ItemSportBinding

data class SportItem(
    val name: String,
    val actionId: Int
)

class SportsAdapter(
    private val sportsList: List<SportItem>
) : RecyclerView.Adapter<SportsAdapter.SportViewHolder>() {

    class SportViewHolder(val binding: ItemSportBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SportViewHolder {
        val binding = ItemSportBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return SportViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SportViewHolder, position: Int) {
        val sport = sportsList[position]
        holder.binding.tvSportName.text = sport.name
        holder.itemView.setOnClickListener { view ->
            view.findNavController().navigate(sport.actionId)
        }
    }

    override fun getItemCount(): Int = sportsList.size
}
