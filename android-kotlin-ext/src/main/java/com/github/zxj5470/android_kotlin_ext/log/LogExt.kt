package com.github.zxj5470.android_kotlin_ext.log

import android.util.Log

/**
 * @param TAG String :the name of javaClass for Any
 * @param content String :the content(value) of Any
 */
inline fun Any.logE() = this.logTagE(this.javaClass.toString())

/**
 * @param TAG String : input your TAG
 */
inline fun Any.logTagE(TAG: String) = Log.e(TAG, this.toString())

/**
 * the methods below is as the same.
 * skip to introduce them.
 */
inline fun Any.logI() = this.logTagI(this.javaClass.toString())
inline fun Any.logTagI(TAG: String) = Log.i(TAG, this.toString())

inline fun Any.logD() = this.logTagD(this.javaClass.toString())
inline fun Any.logTagD(TAG: String) = Log.d(TAG, this.toString())

inline fun Any.logV() = this.logTagV(this.javaClass.toString())
inline fun Any.logTagV(TAG: String) = Log.v(TAG, this.toString())

inline fun Any.logW() = this.logTagW(this.javaClass.toString())
inline fun Any.logTagW(TAG: String) = Log.w(TAG, this.toString())

inline fun Any.logWTF() = this.logTagWTF(this.javaClass.toString())
inline fun Any.logTagWTF(TAG: String) = Log.wtf(TAG, this.toString())