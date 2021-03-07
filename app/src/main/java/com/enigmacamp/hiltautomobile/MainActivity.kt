package com.enigmacamp.hiltautomobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.enigmacamp.hiltautomobile.data.model.*
import com.enigmacamp.hiltautomobile.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

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

  Langkah setup
  - Gradle dependecy implmentation
  - Buat startup android class yang meng-extend class Application, lalu berikan annotation
    @HiltAndroidApp
    Jangan lupa daftarkan di androidmanifest di application
  - Buat class2 yang akan dilakukan injection, dan class2 yang bisa meng-inject sebagai dependency

  Membuat Dependency Injection di HILT ada 3 cara
  1. Anotasi di constructor dengan @Inject
  2. Menggunakan anotasi @Binds di Hilt module
  3. Menggunakan anotasi @Provides di Hilt module

  - Buat package di
  - Buat class abstract, berikan anotasi @Module dari package dagger, dan @Installin ActivityComponent
  - Berikan anotasi @AndroidEntryPoint di class MainActivity


 */
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var car: Car

    @Inject
    @Named("Gas")
    lateinit var engine: Engine

    @Inject
    @Named("Diesel")
    lateinit var dieselEngine: Engine

    @Inject
    lateinit var audio: Equipment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            secondButton.setOnClickListener {
                car = Car(dieselEngine, audio)
                Log.d("Car", "Memory main activity: ${dieselEngine}")

                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                startActivity(intent)
            }
        }
    }
}