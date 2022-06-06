package com.rorono.retrofitjoke

import com.google.gson.annotations.SerializedName

//DTO -> Data Transfer Object
data class JokeDTO(
    @SerializedName("title")
    private val title:String,
    @SerializedName("body")
    private val body:String
){
    fun toJoke() = Joke(title,body)
}
