package com.fox.diexample3

import android.app.Application
import com.fox.diexample3.di.DaggerAppComponent


class App: Application() {

    val myComponent by lazy { DaggerAppComponent.factory()
        .create(this)

    }


}