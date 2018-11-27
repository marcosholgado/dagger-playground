package com.marcosholgado.daggerplayground

import android.app.Activity
import androidx.test.rule.ActivityTestRule

class MyActivityTestRule<T: Activity>(activityClass: Class<T>): ActivityTestRule<T>(activityClass) {

    var timestamp: Long = 0

    override fun beforeActivityLaunched() {
        timestamp = System.currentTimeMillis()
        super.beforeActivityLaunched()
    }

    override fun afterActivityLaunched() {
        super.afterActivityLaunched()
        timestamp = System.currentTimeMillis() - timestamp
    }
}

