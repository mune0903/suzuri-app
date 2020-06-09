package com.mune0903.suzuri.data

import android.content.Context
import androidx.core.content.edit
import com.mune0903.suzuri.data.model.Token
import com.mune0903.suzuri.data.remote.SuzuriClient
import retrofit2.Retrofit

class AuthRepositoryImpl(
    private val context: Context,
    private val retrofit: Retrofit
) : AuthRepository {

    private val client by lazy { retrofit.create(SuzuriClient::class.java) }
    private val tokenKey = "token"
    private val sharedPreferences = context.getSharedPreferences(tokenKey, Context.MODE_PRIVATE)

    override suspend fun getToken(
        grant_type: String,
        code: String,
        redirect_uri: String,
        client_id: String,
        client_secret: String
    ): Token {
        val request = mapOf(
            "grant_type"    to grant_type,
            "code"          to code,
            "redirect_uri"  to redirect_uri,
            "client_id"     to client_id,
            "client_secret" to client_secret
        )
        return client.getToken("application/x-www-form-urlencoded", request)
    }

    override fun saveToken(token: String) {
        sharedPreferences.edit {
            putString(tokenKey, token)
        }
    }
}