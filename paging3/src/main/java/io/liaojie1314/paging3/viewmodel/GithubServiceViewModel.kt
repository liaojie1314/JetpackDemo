package io.liaojie1314.paging3.viewmodel

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import io.liaojie1314.paging3.api.Repository
import io.liaojie1314.paging3.bean.Item
import kotlinx.coroutines.flow.Flow

class GithubServiceViewModel : ViewModel() {
    fun getGithubData(): Flow<PagingData<Item>> {
        return Repository.getPagingData()
    }
}