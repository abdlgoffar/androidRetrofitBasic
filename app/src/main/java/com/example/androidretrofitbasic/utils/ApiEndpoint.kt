package com.example.androidretrofitbasic.utils

import retrofit2.http.GET

interface ApiEndpoint {

    @GET("photos")
    fun getPhotos()

}