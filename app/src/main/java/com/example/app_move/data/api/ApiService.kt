package com.example.app_move.data.api

import com.example.app_move.data.model.ListResponse
import com.example.app_move.data.model.MovieResponse
import com.example.app_move.data.model.TvShowResponse
import com.example.app_move.utils.API_KEY
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET("movie/now_playing?api_key=$API_KEY")
    fun getMovies(): Call<ListResponse<MovieResponse>>

    @GET("tv/airing_today?api_key=$API_KEY")
    fun getTvShow(): Call<ListResponse<TvShowResponse>>
}