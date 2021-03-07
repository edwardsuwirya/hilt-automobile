package com.enigmacamp.hiltautomobile.data.model

import javax.inject.Inject

class GasolineEngine @Inject constructor() : Engine {
    override var engineFuel = "Gasoline"

    override fun start() = "Engine $engineFuel is starting"

    override fun stop() = "Engine $engineFuel is stop"
}