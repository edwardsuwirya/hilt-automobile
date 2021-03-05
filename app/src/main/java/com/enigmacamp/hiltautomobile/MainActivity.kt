package com.enigmacamp.hiltautomobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.enigmacamp.hiltautomobile.data.model.Car
import com.enigmacamp.hiltautomobile.data.model.GasolineEngine

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

 */
class MainActivity : AppCompatActivity() {
    private lateinit var car: Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gasolineEngine = GasolineEngine()
        car = Car(gasolineEngine)
        Log.d("Car", car.onCarStart())
        Log.d("Car", car.onCarStop())
        Log.d("Car", car.onRefillFuel())
    }
}