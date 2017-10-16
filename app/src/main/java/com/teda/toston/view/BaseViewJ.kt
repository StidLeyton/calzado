package com.teda.toston.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.app.AppCompatDelegate
import android.support.v7.widget.Toolbar
import butterknife.ButterKnife

/**
 * Created by anime on 15/10/2017.
 */

abstract class BaseViewJ : AppCompatActivity() {

    protected var toolbar: Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResource)
        ButterKnife.bind(this)
        if (toolbar != null) {
            setSupportActionBar(toolbar)
            if (displayHomeAsUp() && supportActionBar != null) {
                supportActionBar!!.setDisplayHomeAsUpEnabled(true)
            }
        }
    }

    protected abstract val layoutResource: Int

    protected abstract fun displayHomeAsUp(): Boolean


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    companion object {

        init {
            AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        }
    }

}
