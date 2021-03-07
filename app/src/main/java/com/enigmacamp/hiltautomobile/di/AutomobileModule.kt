package com.enigmacamp.hiltautomobile.di

import com.enigmacamp.hiltautomobile.data.model.DieselEngine
import com.enigmacamp.hiltautomobile.data.model.Engine
import com.enigmacamp.hiltautomobile.data.model.GasolineEngine
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import javax.inject.Named

/*
 Setiap module di install dalam sebuah Hilt Component melalu anotasi @InstallIn
 Hal ini dimaksudkan untuk menjaga salah injection
 */
@Module
@InstallIn(ActivityComponent::class)
abstract class AutomobileModule {
    @Binds
    @Named("Gas")
    abstract fun bindEngine(gasolineEngine: GasolineEngine): Engine

    @Binds
    @Named("Diesel")
    abstract fun bindDieselEngine(dieselEngine: DieselEngine): Engine
}