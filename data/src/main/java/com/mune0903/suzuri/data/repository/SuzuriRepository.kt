package com.mune0903.suzuri.data.repository

import com.mune0903.suzuri.data.model.items.Items

interface SuzuriRepository {
    suspend fun getItems(): List<Items>
}