package com.marcosholgado.daggerplayground.di

import dagger.Module
import dagger.Provides

@Module
class Feature2Module {
    @Provides
    fun provideInt() = 1
}