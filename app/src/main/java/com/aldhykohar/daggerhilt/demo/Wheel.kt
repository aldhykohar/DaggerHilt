package com.aldhykohar.daggerhilt.demo

import android.util.Log
import javax.inject.Inject


/**
 * Created by aldhykohar on 4/4/2021.
 */
class Wheel {

    @Inject
    constructor()
    fun getWheel(){
        Log.e("main", "wheel started.. " )
    }
}