package io.liaojie1314.viewmodel.viewModelAndFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.ViewModelProvider
import io.liaojie1314.viewmodel.R

class LeftFragment : Fragment() {

    private val viewModel:BlankViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_left, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvLeft = view.findViewById<TextView>(R.id.tv_left)
        view.findViewById<Button>(R.id.btn_left).apply {
            setOnClickListener {
                viewModel.addOne()
            }
        }
        activity?.let { it ->
            viewModel.getLiveData().observe(it) {
                tvLeft.text = it.toString()
            }
        }
    }
}