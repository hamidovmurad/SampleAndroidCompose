package com.app.sampleandroidcompose.data.network

sealed interface NetworkOperation<T> {
    data class Loading<T>(val placeholder: T? = null): NetworkOperation<T>
    data class Success<T>(val data: T): NetworkOperation<T>
    data class Failure<T>(val reason: String): NetworkOperation<T>
}