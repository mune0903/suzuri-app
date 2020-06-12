package com.mune0903.suzuri.data.repository

import android.content.Context
import com.mune0903.suzuri.data.model.items.Items
import com.mune0903.suzuri.data.remote.SuzuriClient
import retrofit2.Retrofit

class SuzuriRepositoryImpl(
    private val context: Context,
    private val retrofit: Retrofit
) : SuzuriRepository {

    private val client by lazy { retrofit.create(SuzuriClient::class.java) }
    private val sharedPreference = context.getSharedPreferences("token", Context.MODE_PRIVATE)

    override suspend fun getItems(): List<Items> {
        println("oppai${sharedPreference.getString("token", "")}")
        return client.getItems("Bearer ${sharedPreference.getString("token", "")}")
    }
}