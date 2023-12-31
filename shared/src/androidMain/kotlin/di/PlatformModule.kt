package di

import io.ktor.client.engine.android.*
import org.koin.core.module.Module
import org.koin.dsl.module

actual fun platformModule(): Module = module {
    single { Android.create() }
}