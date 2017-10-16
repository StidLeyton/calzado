package com.teda.toston.view

import android.os.Bundle
import com.teda.toston.R

class MainActivity : BaseView() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun displayHomeAsUp(): Boolean {
        return true
    }

    override val layoutResource: Int
        get() = R.layout.activity_main

}
