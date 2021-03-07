package com.enigmacamp.hiltautomobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.enigmacamp.hiltautomobile.data.model.Car
import com.enigmacamp.hiltautomobile.data.model.Engine
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named

@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {
    private lateinit var car: Car

    @Inject
    @Named("Diesel")
    lateinit var dieselEngine: Engine

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        car = Car(dieselEngine)
        Log.d("Car", "Memory second activity: ${dieselEngine}")

    }
}