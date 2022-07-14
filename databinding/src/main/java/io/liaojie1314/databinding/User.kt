package io.liaojie1314.databinding

import androidx.databinding.ObservableField

class User(
    var name:String
){
    val _name = ObservableField<String>()
    init {
        _name.set(name)
    }
}
