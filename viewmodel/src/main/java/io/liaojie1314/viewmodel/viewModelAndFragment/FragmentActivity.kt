package io.liaojie1314.viewmodel.viewModelAndFragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import io.liaojie1314.viewmodel.R

class FragmentActivity : AppCompatActivity() {
//    private val viewModel by lazy {
//        ViewModelProvider(this).get(BlankViewModel::class.java)
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)
    }

//    fun addOne(view: View) {
//        viewModel.addOne()
//    }
}