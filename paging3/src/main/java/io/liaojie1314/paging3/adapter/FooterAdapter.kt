package io.liaojie1314.paging3.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ProgressBar
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter
import androidx.recyclerview.widget.RecyclerView
import io.liaojie1314.paging3.R

class FooterAdapter(val retry: () -> Unit) : LoadStateAdapter<FooterAdapter.FooterHolder>() {
    class FooterHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val progressBar: ProgressBar = itemView.findViewById(R.id.footer_progress_bar)
        val retryButton: Button = itemView.findViewById(R.id.btn_retry)
    }

    override fun onBindViewHolder(holder: FooterHolder, loadState: LoadState) {
        holder.progressBar.isVisible = loadState is LoadState.Loading
        holder.retryButton.isVisible = loadState is LoadState.Error
    }

    override fun onCreateViewHolder(parent: ViewGroup, loadState: LoadState): FooterHolder {
        val footerHolder = FooterHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.footer_item,
                parent,
                false
            )
        )
        footerHolder.retryButton.setOnClickListener {
            retry()
        }
        return footerHolder
    }
}