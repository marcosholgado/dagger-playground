package com.marcosholgado.mymodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.marcosholgado.core.ExpensiveObject
import com.marcosholgado.core.di.CoreInjectHelper
import javax.inject.Inject

class OtherActivity : AppCompatActivity() {

    @Inject
    lateinit var expensiveObject: ExpensiveObject

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)

        DaggerFeature1Component
            .builder()
            .coreComponent(CoreInjectHelper.provideCoreComponent(applicationContext))
            .build()
            .inject(this)
    }
}
