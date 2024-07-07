package com.example.app_move.utils

import androidx.recyclerview.widget.DiffUtil
import com.example.app_move.data.model.MovieResponse

class MovieCallback(private val oldItem: List<MovieResponse>, private val newItem: List<MovieResponse>): DiffUtil.Callback() {
    override fun getOldListSize(): Int = oldItem.size

    override fun getNewListSize(): Int = newItem.size

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldItem[oldItemPosition].id == newItem[newItemPosition].id

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean =
        oldItem[oldItemPosition].id == newItem[newItemPosition].id
}