package com.app.sampleandroidcompose.data.repostory

import com.app.sampleandroidcompose.data.model.ListResponse
import com.app.sampleandroidcompose.data.network.NetworkOperation
import com.app.sampleandroidcompose.data.services.AppService
import javax.inject.Inject

class AppRepositoryImpl @Inject constructor(
    private val appService: AppService
): AppRepository {


    override suspend fun getList(): NetworkOperation<List<ListResponse>> {
        return appService.getList().run {
            if (isSuccessful) {
                NetworkOperation.Success(data = body() ?: emptyList())
            } else {
                NetworkOperation.Failure(reason = "Error")
            }
        }
    }

}