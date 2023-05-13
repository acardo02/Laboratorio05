package com.acardona.myapplication.ui.movie.billboard.recyclerview

import androidx.recyclerview.widget.RecyclerView
import com.acardona.myapplication.data.model.MovieModel
import com.acardona.myapplication.databinding.MovieItemBinding

class MovieRecyclerViewHolder(private val binding: MovieItemBinding ) : RecyclerView.ViewHolder(binding.root) {
    fun bind(movie: MovieModel, clickListener : (MovieModel) -> Unit ) {
        binding.titleTextView.text = movie.name
        binding.qualificationTextView.text = movie.qualification

        binding.movieCard.setOnClickListener {
            clickListener(movie)
        }
    }

}