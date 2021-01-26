package ru.ustyuzhinskiydev.a232_screencast1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import timber.log.Timber


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Timber.d("onCreate")
//        finish()
    }

    override fun onStart(){
        super.onStart()

        Timber.d("onStart")
    }

    override fun onResume(){
        super.onResume()

        Timber.d("onResume")
    }

    override fun onPause(){
        super.onPause()

        Timber.d("onPause")
    }

    override fun onStop(){
        super.onStop()

        Timber.d("onStop")
    }

    override fun onDestroy(){
        super.onDestroy()

        Timber.d("onDestroy")

    }
}