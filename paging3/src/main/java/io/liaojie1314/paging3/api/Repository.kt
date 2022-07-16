package io.liaojie1314.paging3.api

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import io.liaojie1314.paging3.bean.Item
import io.liaojie1314.paging3.paging.RepoPagingSource
import kotlinx.coroutines.flow.Flow

object Repository {
    private const val PAGE_SIZE = 50
    private val githubService = GithubServiceApi.create()

    fun getPagingData(): Flow<PagingData<Item>> {
        return Pager(config = PagingConfig(PAGE_SIZE), pagingSourceFactory = {
            RepoPagingSource(
                githubService
            )
        }).flow
    }
}