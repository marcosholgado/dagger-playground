package com.marcosholgado.mymodule

import android.os.Bundle
import com.marcosholgado.core.ExpensiveObject
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class OtherActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var expensiveObject: ExpensiveObject

    @Inject
    lateinit var text: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_other)
    }
}
