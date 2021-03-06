package com.rorono.retrofitjoke

interface JokeFailure {
    fun getMessage():String
}
class NoConnection(private val resourceManager: ResourceManager):JokeFailure{
    override fun getMessage() = resourceManager.getString(R.string.no_connection)

}

class ServiceUnavailable(private val resourceManager: ResourceManager):JokeFailure {
    override fun getMessage()=resourceManager.getString(R.string.service_unavailable)
}