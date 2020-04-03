package com.subhipandey.lifecycleaware

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG, "Observer ON_CREATE")
        lifecycle.addObserver(MainActivityObserver())
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "Observer ON_CREATE")

    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "Observer ON_CREATE")


    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "Observer ON_CREATE")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "Observer ON_CREATE")


    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "Observer ON_CREATE")


    }

    companion object {
        private val TAG: String = MainActivityObserver::class.java.simpleName
    }
}
