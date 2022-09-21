package com.fox.diexample3.data.datasource

import com.fox.diexample3.data.database.Database
import javax.inject.Inject

class LocalDataSourceImpl @Inject constructor(
    private val database: Database
) : LocalDataSource {
    override fun method() {
        database.method()
    }
}