package com.mune0903.suzuri.app.ui.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mune0903.suzuri.app.CLIENT_ID
import com.mune0903.suzuri.app.CLIENT_SECRET
import com.mune0903.suzuri.app.GRANT_TYPE
import com.mune0903.suzuri.app.REDIRECT_URI
import com.mune0903.suzuri.data.repository.AuthRepository
import com.mune0903.suzuri.data.model.Token
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import timber.log.Timber

class AuthViewModel(
    private val repository: AuthRepository
) : ViewModel() {

    private val _token = MutableLiveData<Token>()
    val token: LiveData<Token> = _token

    fun isLogin(): Boolean {
        return repository.isLogin()
    }

    fun getToken(code: String) {
        viewModelScope.launch {
            runCatching {
                repository.getToken(GRANT_TYPE, code, REDIRECT_URI, CLIENT_ID, CLIENT_SECRET)
            }.onSuccess {
                _token.value = it
            }.onFailure {
                Timber.e(it)
            }
        }
    }

    fun saveToken(token: String) {
        repository.saveToken(token)
    }

    override fun onCleared() {
        super.onCleared()
        viewModelScope.cancel()
    }
}