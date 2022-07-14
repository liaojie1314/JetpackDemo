package io.liaojie1314.databinding.adapter

import android.view.View
import androidx.databinding.ObservableField

class Image(
    var image:String
) {
    val _image = ObservableField<String>()
    init {
        _image.set(image)
    }
    fun changeImageClick(view:View){
        _image.set("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F2018-10-24%2F5bd01a786733c.jpg&refer=http%3A%2F%2Fpic1.win4000.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1660395113&t=e4fe0034627ebaf14903aaa9d8a9511e")
    }
}