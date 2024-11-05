package com.app.sampleandroidcompose.data.repostory

import com.app.sampleandroidcompose.data.model.ListResponse
import com.app.sampleandroidcompose.data.network.NetworkOperation

interface AppRepository {

    suspend fun getList(): NetworkOperation<List<ListResponse>>

}