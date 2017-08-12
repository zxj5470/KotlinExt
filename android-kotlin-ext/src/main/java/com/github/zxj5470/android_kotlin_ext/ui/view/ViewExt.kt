package com.github.zxj5470.android_kotlin_ext.ui.view

import android.app.Fragment
import android.view.View

inline var View.visible: Boolean
    set(value) {
        this.visibility = if (value) View.VISIBLE; else View.INVISIBLE
    }
    get() {
        return this.visibility == View.VISIBLE
    }


inline val Fragment.thisContext
    get()=activity.applicationContext!!

/**
 * reload operator +=
 * add a onClickListener
 * @param l View.OnClickListener :
 */
operator fun View.plusAssign(l: View.OnClickListener) {
    this.setOnClickListener(l)
}
operator fun View.plusAssign(l: (View)->Unit) {
    this.setOnClickListener(l)
}