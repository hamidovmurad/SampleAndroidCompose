package com.app.sampleandroidcompose.di

import com.app.sampleandroidcompose.data.repostory.AppRepository
import com.app.sampleandroidcompose.data.repostory.AppRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class BindModule {


    @Singleton
    @Binds
    abstract fun bindAppRepository(repositoryImpl: AppRepositoryImpl): AppRepository

}