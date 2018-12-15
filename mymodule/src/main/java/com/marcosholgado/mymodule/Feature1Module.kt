package com.marcosholgado.mymodule

import dagger.Module
import dagger.Provides

@Module
class Feature1Module {
    @Provides
    fun provideString() = "test"
}