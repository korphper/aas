package com.jayeandon.wws

import android.content.Context
import android.widget.Toast

object TestLibrary {
    fun showToast(context: Context, message: String): Unit {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}