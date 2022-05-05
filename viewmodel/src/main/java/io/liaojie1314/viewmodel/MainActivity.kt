package io.liaojie1314.viewmodel

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {
    //ViewModel数据保持(存储大量数据) onSavedInstanceState(存储少量数据)
    private val myViewModel by lazy {
        ViewModelProvider(this).get(MyViewModel::class.java)
    }
    private lateinit var tvTest: TextView

    //private var i = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvTest = findViewById(R.id.tv_test)
        myViewModel.getTestNum().observe(this) {
            tvTest.text = it.toString()
        }
    }

    fun addOneClick(view: View) {
        //i++
        //tvTest.text = i.toString()
        myViewModel.addOne()
    }
}