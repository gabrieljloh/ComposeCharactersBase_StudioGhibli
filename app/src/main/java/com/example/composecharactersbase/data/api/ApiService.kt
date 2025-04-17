package com.example.composecharactersbase.data.api

import android.telecom.Call
import com.example.composecharactersbase.data.model.StdGhibliModel
import retrofit2.http.GET

interface ApiService {
    @GET("/people/{id}")
    fun getPeople(): Call<StdGhibliModel>
}