package io.liaojie1314.databinding.adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import androidx.databinding.DataBindingUtil
import io.liaojie1314.databinding.R
import io.liaojie1314.databinding.databinding.ActivityAdapterBinding

class AdapterActivity : AppCompatActivity() {
    private val myImage =
        Image("https://img0.baidu.com/it/u=3251374899,4135284692&fm=253&fmt=auto&app=120&f=JPEG?w=1187&h=800")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataBinding =
            DataBindingUtil.setContentView<ActivityAdapterBinding>(this, R.layout.activity_adapter)
        dataBinding.image = myImage
//        dataBinding.btnChangeImage.setOnClickListener {
//            myImage._image
//                .set(
//                    "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F2018-10-24%2F5bd01a786733c.jpg&refer=http%3A%2F%2Fpic1.win4000.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=auto?sec=1660395113&t=e4fe0034627ebaf14903aaa9d8a9511e"
//                )
//        }
    }
}