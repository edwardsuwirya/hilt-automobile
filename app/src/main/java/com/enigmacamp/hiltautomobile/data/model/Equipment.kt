package com.enigmacamp.hiltautomobile.data.model

interface Equipment {
    var equipmentType: String?

    fun turnOn(): String

    fun turnOff(): String
}