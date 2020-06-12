package com.mune0903.suzuri.app.ui.auth

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.navigation.fragment.navArgs
import com.mune0903.suzuri.app.AUTH_URL
import com.mune0903.suzuri.app.ui.MainActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class AuthFragment : Fragment() {

    private val viewModel: AuthViewModel by viewModel()
    private val args: AuthFragmentArgs by navArgs()

    override fun onStart() {
        super.onStart()
        viewModel.apply {
            token.observe( this@AuthFragment, Observer {
                it?.let {
                    saveToken(it.access_token)
                    println("tokenは" + it.access_token)
                    transitToMainActivity()
                }
            })
        }

        if (viewModel.isLogin()) {
            transitToMainActivity()
            return
        }

        args.code?.let {
            viewModel.getToken(it)
        } ?: run {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(AUTH_URL))
            startActivity(intent)
        }
    }

    private fun transitToMainActivity() {
        val intent = MainActivity.createIntent(requireActivity())
        startActivity(intent)
        requireActivity().finish()
    }
}