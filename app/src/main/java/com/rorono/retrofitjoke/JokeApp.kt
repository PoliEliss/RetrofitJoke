package com.rorono.retrofitjoke

import android.app.Application
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

class JokeApp : Application() {

    lateinit var viewModel: ViewModel
    val retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/posts/1")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    private val api: JokeService by lazy { retrofit.create(JokeService::class.java) }

}