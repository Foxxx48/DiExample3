package com.fox.diexample3.di

import com.fox.diexample3.data.repository.RepositoryImpl
import com.fox.diexample3.domain.Repository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: RepositoryImpl): Repository
}