package com.rorono.retrofitjoke

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Api {

    val retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/posts/1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}


