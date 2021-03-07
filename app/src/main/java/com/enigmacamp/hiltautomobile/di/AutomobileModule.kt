package com.enigmacamp.hiltautomobile.di

import com.enigmacamp.hiltautomobile.data.model.Engine
import com.enigmacamp.hiltautomobile.data.model.GasolineEngine
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

/*
 Setiap module di install dalam sebuah Hilt Component melalu anotasi @InstallIn
 Hal ini dimaksudkan untuk menjaga salah injection
 */
@Module
@InstallIn(ActivityComponent::class)
abstract class AutomobileModule {
    @Binds
    abstract fun bindEngine(gasolineEngine: GasolineEngine): Engine
}