package com.enigmacamp.hiltautomobile.di

import com.enigmacamp.hiltautomobile.data.model.*
import dagger.Binds
import dagger.Module
import dagger.Provides
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

//    Tidak bisa karena private constructor menggunakan builder pattern
//    @Binds
//    abstract fun bindsAudio(stereoAudio: StereoAudio): Equipment

    companion object {
        @Singleton
        @Provides
        fun provideAudio(): Equipment =
            StereoAudio.Builder().model("Stereo Hifi Entertainment").build()
    }
}