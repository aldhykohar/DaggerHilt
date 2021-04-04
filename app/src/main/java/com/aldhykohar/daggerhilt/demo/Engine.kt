package com.aldhykohar.daggerhilt.demo

import android.util.Log
import javax.inject.Inject


/**
 * Created by aldhykohar on 4/4/2021.
 */
class Engine {

    @Inject
    constructor()
    fun getEngine(){
        Log.e("main", "engine started.. " )
    }
}