package com.rorono.retrofitjoke

import retrofit2.Call
import retrofit2.http.GET

interface JokeService {
     @GET("https://jsonplaceholder.typicode.com/posts/1")
    fun getJoke(): Call<JokeDTO>
}

interface  ServiceCallback {
    fun returnSuccess(data:JokeDTO)

    fun returnError(type:ErrorType)
}

enum class ErrorType {
    NO_CONNECTION,
    OTHER
}