package com.marcosholgado.mymodule

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.marcosholgado.core.ExpensiveObject
import dagger.android.AndroidInjection
import javax.inject.Inject

class OtherActivity : AppCompatActivity() {

    @Inject
    lateinit var expensiveObject: ExpensiveObject

    @Inject
    lateinit var text: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        AndroidInjection.inject(this)
        setContentView(R.layout.activity_other)
    }
}
