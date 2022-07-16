package io.liaojie1314.paging3.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import io.liaojie1314.paging3.api.GithubServiceApi
import io.liaojie1314.paging3.bean.Item

class RepoPagingSource(private val githubServiceApi: GithubServiceApi) : PagingSource<Int, Item>() {
    override fun getRefreshKey(state: PagingState<Int, Item>): Int? = null

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Item> {
        return try {
            val key = params.key ?: 1
            val loadSize = params.loadSize
            val githubServerData = githubServiceApi.getGithubServerData(key, loadSize)
            val items = githubServerData.items
            val prevKey = if (key > 1) key - 1 else null
            val nextKey = if (items.isNotEmpty()) key + 1 else null
            LoadResult.Page(items, prevKey, nextKey)
        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }
}