package com.marcosholgado.daggerplayground.di

import com.marcosholgado.mymodule.Feature1Module
import com.marcosholgado.mymodule.OtherActivity
import dagger.Subcomponent
import dagger.android.AndroidInjector

@Subcomponent(modules = [Feature1Module::class])
interface OtherActivitySubcomponent: AndroidInjector<OtherActivity> {
    @Subcomponent.Builder
    abstract class Builder: AndroidInjector.Builder<OtherActivity>()
}