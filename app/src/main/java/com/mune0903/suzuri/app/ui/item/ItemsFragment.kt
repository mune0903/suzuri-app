package com.mune0903.suzuri.app.ui.item

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import org.koin.androidx.viewmodel.ext.android.viewModel

class ItemsFragment : Fragment() {

    private val viewModel: ItemViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("aaa")
        viewModel.apply {
            getItems()
            items.observe(this@ItemsFragment, Observer {
                println(it)
            })
        }
    }

    companion object {
        val TAG: String = ItemsFragment::class.java.simpleName
        @JvmStatic
        fun newInstance() = ItemsFragment()
    }
}