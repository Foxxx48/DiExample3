package com.fox.diexample3.data.repository

import com.fox.diexample3.data.datasource.LocalDataSource
import com.fox.diexample3.data.datasource.RemoteDataSource
import com.fox.diexample3.data.mapper.Mapper
import com.fox.diexample3.domain.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val mapper: Mapper,
    private val localDataSource: LocalDataSource,
    private val remoteDataSource: RemoteDataSource
) : Repository {
    override fun method() {
        mapper.method()
        localDataSource.method()
        remoteDataSource.method()
    }
}