package com.marcosholgado.daggerplayground.di

import com.marcosholgado.daggerplayground.OtherObject
import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideOtherObject() = OtherObject()
}