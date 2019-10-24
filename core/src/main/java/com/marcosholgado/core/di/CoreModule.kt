package com.marcosholgado.daggerplayground.di

import com.marcosholgado.core.ExpensiveObject
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CoreModule {
    @Provides
    fun provideExpensiveObject(): ExpensiveObject = ExpensiveObject()
}