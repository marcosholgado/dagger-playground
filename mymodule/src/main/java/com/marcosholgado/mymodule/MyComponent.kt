package com.marcosholgado.mymodule

import com.marcosholgado.daggerplayground.di.CoreComponent
import dagger.Component

@Component(modules = [Feature1Module::class], dependencies = [CoreComponent::class])
interface MyComponent {
    fun getMyObject(): MyObject
}