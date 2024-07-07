package com.example.app_move.ui.tvshow

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.app_move.data.client.ApiClient
import com.example.app_move.data.model.ListResponse
import com.example.app_move.data.model.TvShowResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class TvViewModel: ViewModel() {
    private val tvshow = MutableLiveData<List<TvShowResponse>>()

    fun setTvShow(){
        ApiClient.instance.getTvShow()
            .enqueue(object : Callback<ListResponse<TvShowResponse>> {
                override fun onResponse(
                    call: Call<ListResponse<TvShowResponse>>,
                    response: Response<ListResponse<TvShowResponse>>
                ) {
                    if (response.isSuccessful){
                        tvshow.postValue(response.body()?.results)
                    }
                }

                override fun onFailure(call: Call<ListResponse<TvShowResponse>>, t: Throwable) {
                    Log.d(this@TvViewModel::class.java.simpleName
                        , t.message.toString())
                }

            })
    }

    fun getMovies() = tvshow

}