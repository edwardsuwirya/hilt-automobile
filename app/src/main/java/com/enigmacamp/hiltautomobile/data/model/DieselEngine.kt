package com.enigmacamp.hiltautomobile.data.model

import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {
    override var engineFuel = "Diesel"

    override fun start() = "Engine $engineFuel is starting with loud sound"

    override fun stop() = "Engine $engineFuel is stop"
}