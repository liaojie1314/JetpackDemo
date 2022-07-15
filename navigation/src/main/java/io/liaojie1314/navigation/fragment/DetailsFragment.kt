package io.liaojie1314.navigation.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.findViewTreeViewModelStoreOwner
import androidx.navigation.findNavController
import io.liaojie1314.navigation.R

private const val TAG = "DetailsFragment"
class DetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_details, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btn_back_home).apply {
            setOnClickListener {
                val navController = it.findNavController()
                navController.navigate(R.id.action_detailsFragment_to_homeFragment)
            }
        }
        arguments?.let {
            val name = it.getString("name")
            Log.d(TAG, "onViewCreated: $name")
        }
    }
}