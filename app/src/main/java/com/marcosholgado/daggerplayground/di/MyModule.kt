package com.marcosholgado.daggerplayground.di

import com.marcosholgado.daggerplayground.ExpensiveObject
import dagger.Module
import dagger.Provides

@Module
class MyModule {

    @Provides
    fun provideExpensiveObject(): ExpensiveObject = ExpensiveObject()

}