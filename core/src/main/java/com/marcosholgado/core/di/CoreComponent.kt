package com.marcosholgado.daggerplayground.di

import com.marcosholgado.core.ExpensiveObject
import dagger.Component
import javax.inject.Singleton

@Component(modules = [CoreModule::class])
interface CoreComponent {
    fun getExpensiveObject(): ExpensiveObject
}