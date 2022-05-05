package io.liaojie1314.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MyViewModel : ViewModel() {
    //如果需要持有Context需继承AndroidViewModel(application)
    private var i = 0
    private val testNum = MutableLiveData<Int>()

    fun getTestNum(): MutableLiveData<Int> {
        return testNum
    }

    fun addOne() {
        i++
        testNum.value = i
    }
}