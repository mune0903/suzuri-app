package com.mune0903.suzuri.app.di

import com.facebook.stetho.okhttp3.StethoInterceptor
import com.mune0903.suzuri.app.ui.auth.AuthViewModel
import com.mune0903.suzuri.app.ui.item.ItemViewModel
import com.mune0903.suzuri.data.repository.AuthRepository
import com.mune0903.suzuri.data.repository.AuthRepositoryImpl
import com.mune0903.suzuri.data.remote.BASE_API_URL
import com.mune0903.suzuri.data.remote.BASE_OAUTH_URL
import com.mune0903.suzuri.data.repository.SuzuriRepository
import com.mune0903.suzuri.data.repository.SuzuriRepositoryImpl
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory
import java.util.concurrent.TimeUnit

object Modules {

    val apiModule = module {
        factory {
            OkHttpClient()
                .newBuilder()
                .connectTimeout(15, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .readTimeout(15, TimeUnit.SECONDS)
                .addNetworkInterceptor(StethoInterceptor())
                .build()
        }

        factory {
            Moshi.Builder()
                .add(KotlinJsonAdapterFactory())
                .build()
        }

        factory(named("auth")) {
            Retrofit.Builder()
                .client(get())
                .addConverterFactory(MoshiConverterFactory.create(get()))
                .baseUrl(BASE_OAUTH_URL)
                .build()
        }

        factory(named("api")) {
            Retrofit.Builder()
                .client(get())
                .addConverterFactory(MoshiConverterFactory.create(get()))
                .baseUrl(BASE_API_URL)
                .build()
        }
    }

    val repositoryModule = module {
        single<AuthRepository> { AuthRepositoryImpl(androidContext(), get(named("auth"))) }
        single<SuzuriRepository> { SuzuriRepositoryImpl(androidContext(), get(named("api")))}
    }

    val viewModelModule = module {
        viewModel { AuthViewModel(get()) }
        viewModel { ItemViewModel(get()) }
    }
}