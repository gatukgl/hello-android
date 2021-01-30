package com.example.myandroid

import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myandroid.databinding.LayoutRecyclerViewItemBinding
import com.example.myandroid.kotlin.OddsModel

class OddsAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val oddses: ArrayList<OddsModel> = arrayListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val binding = LayoutRecyclerViewItemBinding
            .inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return OddsViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return oddses.count()
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is OddsViewHolder -> {
                holder.bind(oddses[position])
            }
        }
    }

    fun update(list: List<OddsModel>) {
        oddses.clear()
        oddses.addAll(list)
        notifyDataSetChanged()
    }

    class OddsViewHolder(private val binding: LayoutRecyclerViewItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(model: OddsModel) {
            binding.ivOdds.setImageResource(model.image)
            binding.tvName.text = model.name
        }
    }
}