package com.github.zxj5470.android_kotlin_ext.ui.activity

import android.content.Context
import android.view.Gravity
import android.view.View
import android.widget.Toast

inline fun Context.toast(message: String, longTime: Boolean = true) {
    Toast.makeText(this, message, if (longTime) Toast.LENGTH_LONG else Toast.LENGTH_SHORT).show()
}

inline fun Context.toast(message: String,
                  longTime: Boolean = true,
                  gravity: Int = Gravity.CENTER,
                  xOffset: Int = 0,
                  yOffset: Int = 0) {
    val toast = Toast(this)
    toast.duration = if (longTime) Toast.LENGTH_LONG else Toast.LENGTH_SHORT
    toast.setText(message)
    toast.setGravity(gravity, xOffset, yOffset)
    toast.show()
}

/**
 * @reference https://github.com/KotlinThree/AndroidExtension/blob/master/library/src/main/kotlin/com/kotlinthree/andex/widget/ToastEX.kt
 *
/*
fun Toast.makeView(customeView: View, gravity: Int = Gravity.CENTER, xOff: Int = 0,
                   yOff: Int = 0, duration: Int = Toast.LENGTH_LONG): Toast {
    this.view = customeView
    setGravity(gravity, xOff, yOff)
    setDuration(duration)
    return this
}
*/
 * */