package com.marcosholgado.daggerplayground.di

import com.marcosholgado.daggerplayground.MainActivity
import com.marcosholgado.mymodule.Feature1Module
import com.marcosholgado.mymodule.OtherActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBindingModule {
    @ContributesAndroidInjector
    abstract fun mainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [Feature1Module::class])
    abstract fun otherActivity(): OtherActivity
}