package com.marcosholgado.core.di

import com.marcosholgado.daggerplayground.di.CoreComponent

interface CoreComponentProvider {
    fun provideCoreComponent(): CoreComponent
}