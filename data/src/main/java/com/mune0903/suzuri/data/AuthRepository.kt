package com.mune0903.suzuri.data

import com.mune0903.suzuri.data.model.Token

interface AuthRepository {
    suspend fun getToken(
        grant_type: String,
        code: String,
        redirect_uri: String,
        client_id: String,
        client_secret: String
    ): Token

    fun saveToken(token: String)
}