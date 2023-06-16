package com.example.retrofitnewsme.api

data class NewsApiJSON(
    val news: List<New>,
    val page: Int,
    val status: String
)