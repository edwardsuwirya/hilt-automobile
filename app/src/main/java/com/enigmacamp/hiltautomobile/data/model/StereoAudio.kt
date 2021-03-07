package com.enigmacamp.hiltautomobile.data.model

class StereoAudio private constructor(override var equipmentType: String? = "") : Equipment {

    override fun turnOn() = "Playing $equipmentType"

    override fun turnOff() = "Stop $equipmentType"

    class Builder {
        private var model: String? = null

        fun model(model: String) = apply {
            this.model = model
        }

        fun build() = StereoAudio(model)
    }
}