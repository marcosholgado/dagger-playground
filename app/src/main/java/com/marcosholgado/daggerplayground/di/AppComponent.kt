package com.marcosholgado.daggerplayground.di

import android.app.Application
import com.marcosholgado.MyApplication
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.BindsInstance

@Component(modules = [AppModule::class,
    ActivityBindingModule::class,
    AndroidSupportInjectionModule::class],
    dependencies = [CoreComponent::class]
)
@AppScope
interface AppComponent : AndroidInjector<MyApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): AppComponent.Builder
        fun coreComponent(coreComponent: CoreComponent): AppComponent.Builder
        fun build(): AppComponent
    }
}