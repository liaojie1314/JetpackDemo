package io.liaojie1314.databinding.recyclerview.bean

import androidx.databinding.ObservableField

class DataBindingData(var content:String) {
    val _conntent=ObservableField<String>()
    init {
        _conntent.set(content)
    }
}