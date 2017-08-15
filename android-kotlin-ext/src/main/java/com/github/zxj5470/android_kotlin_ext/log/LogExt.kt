package com.github.zxj5470.android_kotlin_ext.log

import android.util.Log

/**
 * @param TAG String :the name of javaClass for Any [this.javaClass.toString()]
 * @param content String :the content(value) of Any [this.toString()]
 */
inline fun Any.logE(TAG: String=this.javaClass.toString()) = Log.e(TAG, this.toString())

/**
 * the methods below is as the same.
 * skip to introduce them.
 */
inline fun Any.logI(TAG: String=this.javaClass.toString()) = Log.i(TAG, this.toString())

inline fun Any.logD(TAG: String=this.javaClass.toString()) = Log.d(TAG, this.toString())

inline fun Any.logV(TAG: String=this.javaClass.toString()) = Log.v(TAG, this.toString())

inline fun Any.logW(TAG: String=this.javaClass.toString()) = Log.w(TAG, this.toString())

inline fun Any.logWTF(TAG: String=this.javaClass.toString()) = Log.wtf(TAG, this.toString())
