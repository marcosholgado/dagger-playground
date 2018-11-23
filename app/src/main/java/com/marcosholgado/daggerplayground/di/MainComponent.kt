package com.marcosholgado.daggerplayground.di

import com.marcosholgado.daggerplayground.MainActivity
import dagger.Component

@Component(modules = [MyModule::class])
interface MainComponent {
    fun inject(mainActivity: MainActivity)
}