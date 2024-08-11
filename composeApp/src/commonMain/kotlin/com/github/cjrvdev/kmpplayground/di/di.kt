package com.github.cjrvdev.kmpplayground.di

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.context.startKoin
import org.koin.core.module.Module
import org.koin.dsl.KoinAppDeclaration
import org.koin.dsl.module


val appModule = module {
    single<HttpClient> {
        HttpClient {
            install(ContentNegotiation) {
                json(json = Json {
                    coerceInputValues = true
                    ignoreUnknownKeys = true
                })
            }
        }
    }
}

val viewModelsModule = module {

}

expect val nativeModule: Module

fun initKoin(config: KoinAppDeclaration? = null) {
    startKoin() {
        config?.invoke(this)
        modules(appModule, viewModelsModule, nativeModule)
    }
}