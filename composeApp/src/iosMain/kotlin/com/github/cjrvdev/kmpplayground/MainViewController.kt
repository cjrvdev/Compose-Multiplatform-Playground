package com.github.cjrvdev.kmpplayground

import androidx.compose.ui.window.ComposeUIViewController

import androidx.compose.ui.window.ComposeUIViewController
import com.github.cjrvdev.kmpplayground.di.initKoin

fun MainViewController() = ComposeUIViewController(
    configure = {
        initKoin()
    }
) {
    App()
}