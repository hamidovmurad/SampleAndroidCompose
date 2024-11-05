package com.app.sampleandroidcompose.data.usecase

import com.app.sampleandroidcompose.data.model.ListResponse
import com.app.sampleandroidcompose.data.network.NetworkOperation
import com.app.sampleandroidcompose.data.repostory.AppRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


class GetListUseCase @Inject constructor(
    private val appRepository: AppRepository
) {

    operator fun invoke(): Flow<NetworkOperation<List<ListResponse>>> = flow {
            emit(appRepository.getList())
        }

}