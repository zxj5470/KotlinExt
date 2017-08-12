
# Kotlin Extensions in Android
[![building](https://img.shields.io/badge/build-passing-brightgreen.svg)]()
[![](https://jitpack.io/v/zxj5470/KotlinExt.svg)](https://jitpack.io/#zxj5470/KotlinExt)
## Guide
- Add it in your root build.gradle at the end of repositories:
````gradle
    allprojects {
        repositories {
            ...
            maven { url 'https://jitpack.io' }
        }
    }
````
- Step 2. Add the dependency    (Look at the number of icon)
[![](https://jitpack.io/v/zxj5470/KotlinExt.svg)](https://jitpack.io/#zxj5470/KotlinExt)
````gradle
    dependencies {
            compile 'com.github.zxj5470:KotlinExt:0.1.3'
    }
````

## Dependencies
```gradle
    //build.gradle (Project)
    ext.kotlin_version = '1.1.2-3'
    //build.gradle (Module)
    minSdkVersion 14
    compile "org.jetbrains.kotlin:kotlin-stdlib-jre7:$kotlin_version"
```
## Usage
- String
```kotlin
    "hello world".indicesOf("o")
    //return a list of Integer and contains `4` and `7`

    "hello world".countTimes("o")
    //return `2` Cuz letter `o` appear twice.
```
- Activity
```kotlin
    toast("Message")         //default make a Toast.LENGTH_SHORT
    toast("Message",false)   //make a Toast.LENGTH_LONG
    // Other params
    Context.toast(message: String,
                      longTime: Boolean = true,
                      gravity: Int = Gravity.CENTER,
                      xOffset: Int = 0,
                      yOffset: Int = 0)
```
- Log
```kotlin
    logE()
    logTagE(TAG:String)

    @param TAG: the class name of Any or by yourself
    @param content:the content(value) of Any by its `toString()`
    //Log.e(TAG,content)

    //you can use mathods as below
    logI(),logD(),logV()...
    logTagI(),logTagD(),logTagV()...
```
- View visible
```kotlin
    view.visible=false
    //all right.I forget to mind the status `GONE`
```
- View.setOnClickListener
```kotlin
    btn+={
        //todo
    }
```
~~see more in [samples](https://github.com/zxj5470/KotlinExt/blob/master/readme.md)     (has not been finished yet)~~