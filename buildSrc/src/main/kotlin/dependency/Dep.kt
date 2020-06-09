package dependency

object Dep {
    object Versions {
        val rxKotlin = "3.0.0"
        val okHttp = "4.7.2"
        val rxAndroid = "3.0.0"
        val threeTenAbp = "1.2.0"
        val timber = "4.7.1"
        val stetho = "1.5.1"
        val retrofit = "2.9.0"
        val moshi = "1.9.2"
        val groupie = "2.3.0"
        val lifecycle = "2.2.0"
        val recyclerView = "28.0.0"
        val glide = "4.11.0"
        val navigation = "2.2.2"
        val epoxy = "3.11.0"
        val koin = "2.1.5"
        val coroutine = "1.3.7"
    }

    val rxKotlin = "io.reactivex.rxjava3:rxkotlin:${Versions.rxKotlin}"
    val okHttp = "com.squareup.okhttp3:okhttp:${Versions.okHttp}"
    val rxAndroid = "io.reactivex.rxjava3:rxandroid:${Versions.rxAndroid}"
    val threeTenAbp = "com.jakewharton.threetenabp:threetenabp:${Versions.threeTenAbp}"
    val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    val stetho = "com.facebook.stetho:stetho-okhttp3:${Versions.stetho}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofitAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    val moshi = "com.squareup.moshi:moshi-kotlin:${Versions.moshi}"
    val retrofitMoshiConverter = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    val retrofitRxJavaAdapter = "com.squareup.retrofit2:adapter-rxjava2:${Versions.retrofit}"
    val groupie = "com.xwray:groupie:${Versions.groupie}"
    val groupieKotlin = "com.xwray:groupie-kotlin-android-extensions:${Versions.groupie}"
    val groupieDatabinding = "com.xwray:groupie-databinding:${Versions.groupie}"
    val viewModel = "androidx.lifecycle:lifecycle-viewmodel:${Versions.lifecycle}}"
    val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecycle}"
    val recyclerView = "com.android.support:recyclerview-v7:${Versions.recyclerView}"
    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    val glideAnnotation = "com.github.bumptech.glide:compiler:${Versions.glide}"
    val navigationFragment = "androidx.navigation:navigation-fragment-ktx:${Versions.navigation}"
    val navigationUi = "androidx.navigation:navigation-ui-ktx:${Versions.navigation}"
    val navigationGradlePlugin = "androidx.navigation:navigation-safe-args-gradle-plugin:${Versions.navigation}"
    val epoxy = "com.airbnb.android:epoxy:${Versions.epoxy}"
    val epoxyDataBinding = "com.airbnb.android:epoxy-databinding:${Versions.epoxy}"
    val epoxyProcessor = "com.airbnb.android:epoxy-processor:${Versions.epoxy}"
    val koinAndroid = "org.koin:koin-android:${Versions.koin}"
    val koinAndroidScope = "org.koin:koin-androidx-scope:${Versions.koin}"
    val koinViewModel = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    val coroutineCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutine}"
    val coroutineAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutine}"
}