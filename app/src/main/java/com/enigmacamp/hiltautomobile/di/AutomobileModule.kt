package com.enigmacamp.hiltautomobile.di

import com.enigmacamp.hiltautomobile.data.model.DieselEngine
import com.enigmacamp.hiltautomobile.data.model.Engine
import com.enigmacamp.hiltautomobile.data.model.GasolineEngine
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

/*
 Setiap module di install dalam sebuah Hilt Component melalu anotasi @InstallIn
 Hal ini dimaksudkan untuk menjaga salah injection
 */
@Module
// Life span dependency per activity
//@InstallIn(ActivityComponent::class)

@InstallIn(SingletonComponent::class)
abstract class AutomobileModule {
    @Binds
    @Named("Gas")
    abstract fun bindEngine(gasolineEngine: GasolineEngine): Engine

    @Singleton
    @Binds
    @Named("Diesel")
    abstract fun bindDieselEngine(dieselEngine: DieselEngine): Engine
}