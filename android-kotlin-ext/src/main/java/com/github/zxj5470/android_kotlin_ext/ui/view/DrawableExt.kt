package com.github.zxj5470.android_kotlin_ext.ui.view

import android.graphics.drawable.Drawable
import android.support.v4.graphics.drawable.DrawableCompat

/**
 * @param color Int: Color Value...
 */
fun Drawable.changeToColor(color:Int): Drawable {
    val tempDrawable= DrawableCompat.wrap(this)
    DrawableCompat.setTint(tempDrawable,color)
    return tempDrawable
}