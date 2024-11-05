package com.app.sampleandroidcompose.data.services

import com.app.sampleandroidcompose.data.model.ListResponse
import retrofit2.Response
import retrofit2.http.GET

interface AppService {

    @GET("demos/marvel/")
    suspend fun getList(): Response<List<ListResponse>>

}