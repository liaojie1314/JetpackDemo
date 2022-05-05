package io.liaojie1314.viewmodel.viewModelAndFragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import io.liaojie1314.viewmodel.R

class RightFragment : Fragment() {

    private val viewModel: BlankViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_right, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val tvRight = view.findViewById<TextView>(R.id.tv_right)
        view.findViewById<Button>(R.id.btn_right).apply {
            setOnClickListener {
                viewModel.addOne()
            }
        }
        activity?.let { it ->
            viewModel.getLiveData().observe(it) {
                tvRight.text = it.toString()
            }
        }
    }
}