package com.marcosholgado.daggerplayground

import android.content.Intent
import android.os.Bundle
import com.marcosholgado.core.ExpensiveObject
import com.marcosholgado.mymodule.MyObject
import com.marcosholgado.mymodule.OtherActivity
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var expensiveObject: ExpensiveObject

    @Inject
    lateinit var otherObject: OtherObject

    @Inject
    lateinit var myObject: MyObject

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {
            startActivity(Intent(this, OtherActivity::class.java))
        }
    }
}
