package com.fox.diexample3.data.datasource

import com.fox.diexample3.data.network.ApiService
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : RemoteDataSource {
    override fun method() {
        apiService.method()
    }
}