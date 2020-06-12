package com.mune0903.suzuri.data.remote

import com.mune0903.suzuri.data.model.Token
import com.mune0903.suzuri.data.model.items.Items
import retrofit2.http.*

interface SuzuriClient {
    @GET(GET_ITEMS_URL)
    fun getItems(@Header(HEADER_NAME_API) header: String): List<Items>

    @FormUrlEncoded
    @POST(POST_TOKEN_URL)
    suspend fun getToken(
        @Header(HEADER_NAME_TOKEN) header: String,
        @FieldMap body: Map<String, String>
    ): Token
}