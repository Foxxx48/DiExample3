package com.fox.diexample3.di

import com.fox.diexample3.data.datasource.LocalDataSource
import com.fox.diexample3.data.datasource.LocalDataSourceImpl
import com.fox.diexample3.data.datasource.RemoteDataSource
import com.fox.diexample3.data.datasource.RemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {

    @AppScope
    @Binds
    fun bindRemoteData(impl: RemoteDataSourceImpl): RemoteDataSource

    @AppScope
    @Binds
    fun bindLocalData(impl: LocalDataSourceImpl): LocalDataSource
}