package com.marcosholgado.daggerplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.marcosholgado.daggerplayground.di.DaggerMainComponent
import com.marcosholgado.daggerplayground.di.MyModule
import dagger.Lazy
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var expensiveObject: Lazy<ExpensiveObject>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerMainComponent.builder().myModule(MyModule()).build().inject(this)

        button.setOnClickListener {
            textView.text = "Size is ${expensiveObject.get().intArray?.size}"
        }
    }
}
