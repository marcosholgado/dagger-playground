package com.marcosholgado.daggerplayground.di

import com.marcosholgado.mymodule.OtherActivity
import dagger.android.AndroidInjector
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.Binds
import dagger.Module


@Module(subcomponents = [OtherActivitySubcomponent::class])
abstract class OtherActivityModule {
    @Binds
    @IntoMap
    @ClassKey(OtherActivity::class)
    internal abstract fun bindMainActivityInjectorFactory(
        builder: OtherActivitySubcomponent.Builder
    ): AndroidInjector.Factory<*>
}