package io.liaojie1314.viewmodel.viewModelAndFragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import io.liaojie1314.viewmodel.R
import io.liaojie1314.viewmodel.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {
    private val viewModel by lazy {
        ViewModelProvider(this)[BlankViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_fragment)
        val viewBinding = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        viewBinding.btnAddOne.setOnClickListener {
            viewModel.addOne()
        }
    }

//    fun addOne(view: View) {
//        viewModel.addOne()
//    }
}