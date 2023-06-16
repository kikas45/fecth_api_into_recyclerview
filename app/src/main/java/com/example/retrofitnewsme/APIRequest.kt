package com.example.retrofitnewsme

import com.example.retrofitnewsme.api.NewsApiJSON
import retrofit2.http.GET

interface APIRequest {
    @GET("/v1/latest-news?language=en&apiKey=Pgt9u_oDwERVatBnBVDJiwY5wE-YP9mDqt23YlRPJhAPhIq6")

    suspend fun getNews(): NewsApiJSON

}