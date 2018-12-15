package com.marcosholgado.daggerplayground.di

import com.marcosholgado.core.di.FeatureScope
import com.marcosholgado.daggerplayground.MainActivity
import dagger.Component

@Component(modules = [Feature2Module::class], dependencies = [CoreComponent::class])
@FeatureScope
interface Feature2Component {
    fun inject(mainActivity: MainActivity)
}