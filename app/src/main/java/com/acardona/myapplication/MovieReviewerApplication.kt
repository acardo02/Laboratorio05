package com.acardona.myapplication

import android.app.Application
import com.acardona.myapplication.data.movies
import com.acardona.myapplication.repositories.MovieRepository

class MovieReviewerApplication: Application() {
    val movieRepository: MovieRepository by lazy {
        MovieRepository(movies)
    }
}