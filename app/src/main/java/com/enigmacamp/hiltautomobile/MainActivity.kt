package com.enigmacamp.hiltautomobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/*
 Mengimplementasikan dependency injection, memberikan keuntungan sebagai berikut
  - Code yang reuseable
  - Mempermudah refactoring
  - Mempermudah testing

  Beberapa catatan:
  - butuh pemahaman yang kuat terkait konsep OOP
  - DI di Android, melakukan proses code generation, lebih tepatnya class genertion,
  kadang untuk yang pertama kali belajar, cukup sulit dipahami
  - Beberapa code kadang perlu ekstra pemahaman

 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}