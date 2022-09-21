package com.fox.diexample3.di

import androidx.lifecycle.ViewModel
import com.fox.diexample3.presentation.MainViewModel
import com.fox.diexample3.presentation.MainViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {

    @IntoMap
    @ViewModelKey(MainViewModel::class)
    @Binds
    fun bindMainViewModel(Impl: MainViewModel): ViewModel

    @IntoMap
    @ViewModelKey(MainViewModel2::class)
    @Binds
    fun bindMainViewModel2(Impl: MainViewModel2): ViewModel
}