package com.github.cjrvdev.kmpplayground.base

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.github.cjrvdev.kmpplayground.ui.themes.BaseTheme

@Composable
fun Screen(modifier: Modifier = Modifier, content: @Composable () -> Unit) {
    var isDarkMode = isSystemInDarkTheme()
    var colorScheme = if (isDarkMode) darkColorScheme() else lightColorScheme()

    BaseTheme() {
        Surface(
            modifier = Modifier.fillMaxSize(),
            content = content
        )
    }
}