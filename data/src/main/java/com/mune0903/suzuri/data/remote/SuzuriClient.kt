package com.mune0903.suzuri.data.remote

import com.mune0903.suzuri.data.model.Token
import retrofit2.http.*

interface SuzuriClient {
    @POST(POST_TOKEN_URL)
    @FormUrlEncoded
    suspend fun getToken(
        @Header(HEADER_NAME) header: String,
        @FieldMap body: Map<String, String>
    ): Token
}