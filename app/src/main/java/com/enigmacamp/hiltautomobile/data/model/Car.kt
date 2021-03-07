package com.enigmacamp.hiltautomobile.data.model

class Car(private val engine: Engine, private val equipment: Equipment) {
    /*
       apa perbedaan dengan
       class Car(){
         private val engine = GasolineEngine()
         ...
       }
     */
    fun onCarStart(): String {
        val info = engine.start()
        return info
    }

    fun onCarStop(): String {
        val info = engine.stop()
        return info
    }

    fun onRefillFuel(): String {
        return "Your fuel is ${engine.engineFuel.toString()}"
    }
}