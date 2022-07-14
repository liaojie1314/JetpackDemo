package io.liaojie1314.databinding.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import io.liaojie1314.databinding.R
import io.liaojie1314.databinding.databinding.ActivityRecyclerViewBinding
import io.liaojie1314.databinding.recyclerview.adapter.MyAdapter

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val dataBinging = DataBindingUtil.setContentView<ActivityRecyclerViewBinding>(
            this,
            R.layout.activity_recycler_view
        )
        dataBinging.rvTest.adapter = MyAdapter()
    }
}