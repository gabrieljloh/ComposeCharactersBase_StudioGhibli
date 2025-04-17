package com.example.composecharactersbase.data.repository

import com.example.composecharactersbase.data.api.ApiService

class StdGhibliRepository(private val apiService: ApiService) {
    fun getPeople() = apiService.getPeople()
}