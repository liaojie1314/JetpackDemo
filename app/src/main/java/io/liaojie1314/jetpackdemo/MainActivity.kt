package io.liaojie1314.jetpackdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

//private const val TAG = "MainActivity"
//
//internal class MyLifeCycle(context: Context) {
//    fun resume() {
//        Log.d(TAG, "resume: ")
//    }
//
//    fun destroy() {
//        Log.d(TAG, "destroy: ")
//    }
//}

class MainActivity : AppCompatActivity() {
    //private val myLifeCycle by lazy { MyLifeCycle(this) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //lifecycle.addObserver(MyLifeCycleTest())//已过时
        //lifecycle.addObserver(MyDefaultLifecycleObserver())
    }

//    override fun onResume() {
//        super.onResume()
//        myLifeCycle.resume()
//    }
//    override fun onDestroy() {
//        super.onDestroy()
//        myLifeCycle.destroy()
//    }
}