package com.mune0903.suzuri.app

import android.app.Application
import com.facebook.stetho.Stetho
import com.mune0903.suzuri.app.di.Modules.apiModule
import com.mune0903.suzuri.app.di.Modules.repositoryModule
import com.mune0903.suzuri.app.di.Modules.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import timber.log.Timber

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(listOf(
                apiModule, repositoryModule, viewModelModule
            ))
        }

        if (BuildConfig.DEBUG) {
            Stetho.initializeWithDefaults(this)
            Timber.plant(Timber.DebugTree())
        }
    }
}