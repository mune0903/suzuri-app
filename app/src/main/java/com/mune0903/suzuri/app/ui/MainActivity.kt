package com.mune0903.suzuri.app.ui

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mune0903.suzuri.app.R
import com.mune0903.suzuri.app.ui.item.ItemsFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container, ItemsFragment.newInstance(), ItemsFragment.TAG)
            .commit()
    }

    companion object {
        fun createIntent(activity: Activity) = Intent(activity, MainActivity::class.java)
    }
}