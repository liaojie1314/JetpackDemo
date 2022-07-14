package io.liaojie1314.databinding.recyclerview.adapter

import android.os.Parcel
import android.os.Parcelable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import io.liaojie1314.databinding.R
import io.liaojie1314.databinding.databinding.ItemDatabindingBinding
import io.liaojie1314.databinding.recyclerview.bean.DataBindingData

class MyAdapter() : RecyclerView.Adapter<MyAdapter.TestHolder>() {

    private val testData = ArrayList<DataBindingData>()

    init {
        for (i in 0..1000) {
            testData.add(DataBindingData("第${i}条数据"))
        }
    }

    inner class TestHolder(var dataBinding: ItemDatabindingBinding) :
        RecyclerView.ViewHolder(dataBinding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestHolder {
        val dataBinding = DataBindingUtil.inflate<ItemDatabindingBinding>(
            LayoutInflater.from(parent.context),
            R.layout.item_databinding,
            parent,
            false
        )
        return TestHolder(dataBinding)
    }

    override fun onBindViewHolder(holder: TestHolder, position: Int) {
        holder.dataBinding.testContent = testData[position]
    }

    override fun getItemCount(): Int = testData.size

}