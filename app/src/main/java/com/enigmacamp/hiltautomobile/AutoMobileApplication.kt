package com.enigmacamp.hiltautomobile

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

/*
  Ketika kita membuat code yang menggunakan fitur DI, sebenarnya ada 2 komponen utama
  - Class yang memiliki dependency terhadap class lain
  - Class yang bisa di-inject sebagai dependency
 */
@HiltAndroidApp
class AutoMobileApplication : Application() {
}