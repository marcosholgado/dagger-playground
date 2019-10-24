package com.marcosholgado

import com.marcosholgado.core.di.CoreComponentProvider
import com.marcosholgado.daggerplayground.di.CoreComponent
import com.marcosholgado.daggerplayground.di.DaggerAppComponent
import com.marcosholgado.daggerplayground.di.DaggerCoreComponent
import com.marcosholgado.mymodule.DaggerMyComponent
import com.marcosholgado.mymodule.MyComponent
import com.marcosholgado.mymodule.MyComponentProvider
import dagger.android.DaggerApplication
import dagger.android.AndroidInjector

class MyApplication : DaggerApplication(), CoreComponentProvider, MyComponentProvider {
    private lateinit var coreComponent: CoreComponent
    private lateinit var myComponent: MyComponent

    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        return DaggerAppComponent
            .builder()
            .application(this)
            .coreComponent(provideCoreComponent())
            .myComponent(provideMyComponent())
            .build()
    }

    override fun provideCoreComponent(): CoreComponent {
        if (!this::coreComponent.isInitialized) {
            coreComponent = DaggerCoreComponent
                .builder()
                .build()
        }
        return coreComponent
    }

    override fun provideMyComponent(): MyComponent {
        if (!this::myComponent.isInitialized) {
            myComponent = DaggerMyComponent
                .builder()
                .coreComponent(provideCoreComponent())
                .build()
        }
        return myComponent
    }
}