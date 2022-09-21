package com.fox.diexample3.di

import android.content.Context
import com.fox.diexample3.presentation.MainActivity
import com.fox.diexample3.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component

@AppScope
@Component(modules = [DataModule::class, DomainModule::class, ViewModelModule::class])
interface AppComponent {

    fun inject(activity: MainActivity)

    fun inject(activity: MainActivity2)

//    fun activityComponentFactory(): ActivityComponent.Factory

    @Component.Factory
    interface AppComponentFactory {
        fun create(
            @BindsInstance context: Context
            ): AppComponent
    }

}