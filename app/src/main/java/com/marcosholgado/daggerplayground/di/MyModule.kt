package com.marcosholgado.daggerplayground.di

import com.marcosholgado.daggerplayground.BigObject
import dagger.Module
import dagger.Provides

@Module
class MyModule {

    @Provides
    fun provideExpensiveObject(): BigObject = BigObject()

}