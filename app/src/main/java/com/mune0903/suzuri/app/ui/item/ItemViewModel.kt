package com.mune0903.suzuri.app.ui.item

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mune0903.suzuri.data.model.items.Items
import com.mune0903.suzuri.data.repository.SuzuriRepository
import kotlinx.coroutines.launch
import timber.log.Timber

class ItemViewModel(
    private val repository: SuzuriRepository
) : ViewModel() {

    private val _items = MutableLiveData<List<Items>>()
    val items: LiveData<List<Items>> = _items

    fun getItems() {
        viewModelScope.launch {
            runCatching {
                repository.getItems()
            }.onSuccess {
                _items.value = it
            }.onFailure {
                Timber.e(it)
            }
        }
    }
}