package io.liaojie1314.viewmodel.viewModelAndFragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class BlankViewModel : ViewModel() {
    private var i = 1
    private val testLiveData = MutableLiveData<Int>()

    fun getLiveData(): LiveData<Int> {
        return testLiveData
    }

    fun addOne() {
        i++
        testLiveData.value = i
    }
}