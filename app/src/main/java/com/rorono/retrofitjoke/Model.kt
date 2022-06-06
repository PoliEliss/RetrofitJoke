package com.rorono.retrofitjoke

import javax.security.auth.callback.Callback

interface Model {
    fun getJoke()

    fun init(callback: ResultCallback)

    fun clear()
}
interface ResultCallback{
    fun provideSuccess(data: Joke)
    fun provideError(error:JokeFailure)
}