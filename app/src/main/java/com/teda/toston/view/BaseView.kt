package com.teda.toston.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar

/**
 * Created by anime on 15/10/2017.
 */
abstract class BaseView : AppCompatActivity() {

    var toolbar: Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layoutResource)
        if (toolbar != null) {
            setSupportActionBar(toolbar)
            if (displayHomeAsUp() && supportActionBar != null) {
                supportActionBar!!.setDisplayHomeAsUpEnabled(true)
            }
        }
    }

    abstract val layoutResource: Int

    abstract fun displayHomeAsUp(): Boolean

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

//    companion object {
//        init {
//            AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
//        }
//    }
}