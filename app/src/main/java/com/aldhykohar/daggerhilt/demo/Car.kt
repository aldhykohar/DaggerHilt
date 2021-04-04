package com.aldhykohar.daggerhilt.demo

import android.util.Log
import javax.inject.Inject


/**
 * Created by aldhykohar on 4/4/2021.
 */
class Car @Inject constructor(private val engine: Engine,private val wheel: Wheel) {

    fun getCar(){
        engine.getEngine()
        wheel.getWheel()
        Log.e("main", "car is runnning")
    }
}