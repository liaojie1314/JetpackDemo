package io.liaojie1314.jetpackdemo

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        //ProcessLifecycleOwner.get().lifecycle.addObserver(MyLifeCycleTest())//已过时
        ProcessLifecycleOwner.get().lifecycle.addObserver(MyDefaultLifecycleObserver())
    }
}