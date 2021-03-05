package com.enigmacamp.hiltautomobile.data.model

class GasolineEngine : Engine {
    override var engineFuel: String
        get() = "Gasoline"
        set(value) {}

    override fun start() = "Engine $engineFuel is starting"

    override fun stop() = "Engine $engineFuel is stop"
}