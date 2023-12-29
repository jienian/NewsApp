package com.nm.news.ui.presentation.onbarding

import androidx.annotation.DrawableRes
import com.nm.news.R
import java.io.FileDescriptor

data class Page (
    val title: String,
    val descriptor: String,
    @DrawableRes val image: Int,
)

val pages = listOf(
    Page(
        title = "我",
        descriptor = "Hi Nimyears",
        image = R.drawable.ic_splash
    ),
    Page(
        title = "旅游",
        descriptor = "景点塔",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "美食",
        descriptor = "甜心",
        image = R.drawable.onboarding3
    ),
)

