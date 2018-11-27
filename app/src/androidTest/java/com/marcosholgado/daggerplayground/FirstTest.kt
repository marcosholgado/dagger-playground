package com.marcosholgado.daggerplayground

import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.LargeTest
import com.google.common.truth.Truth.assertWithMessage
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
@LargeTest
class FirstTest {
    @get:Rule
    val activityRule = MyActivityTestRule(MainActivity::class.java)

    @Test
    fun startUpTest() {
        assertWithMessage("Start up time was ${activityRule.timestamp}").that(activityRule.timestamp)
            .isLessThan(100)
    }
}