package com.mune0903.suzuri.data.model

data class Token(
    val access_token: String,
    val scope: String,
    val token_type: String,
    val created_at: Int
)