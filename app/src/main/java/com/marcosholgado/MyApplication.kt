package com.marcosholgado

import android.app.Application
import com.marcosholgado.core.di.CoreComponentProvider
import com.marcosholgado.daggerplayground.di.CoreComponent
import com.marcosholgado.daggerplayground.di.DaggerCoreComponent

class MyApplication : Application(), CoreComponentProvider {

    private lateinit var coreComponent: CoreComponent

    override fun provideCoreComponent(): CoreComponent {
        if (!this::coreComponent.isInitialized) {
            coreComponent = DaggerCoreComponent
                .builder()
                .build()
        }
        return coreComponent
    }
}