package com.enigmacamp.hiltautomobile.data.model

interface Engine {
    var engineFuel: String

    fun start(): String

    fun stop(): String
}