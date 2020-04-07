package com.subhipandey.viewmodeldemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var model: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        model = MainActivityViewModel()

        model= ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        val myRandomNumber = model.getNumber()
        tvNumber.text = myRandomNumber
        Log.i(TAG, "Random Number Set")
    }

    companion object {
        private val TAG = MainActivity::class.simpleName
    }
}
