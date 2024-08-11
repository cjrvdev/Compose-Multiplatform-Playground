package com.github.cjrvdev.kmpplayground.ui.themes

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

@Composable
fun BaseTheme(content: @Composable () -> Unit) {
    //val typography = Typography().defaultFontFamily(IbercajaFontFamily())

    val colorScheme = if (isSystemInDarkTheme()) darkColorScheme() else lightColorScheme()

    MaterialTheme(
        content = content,
        // typography = typography,
        colorScheme = colorScheme
    )
}
