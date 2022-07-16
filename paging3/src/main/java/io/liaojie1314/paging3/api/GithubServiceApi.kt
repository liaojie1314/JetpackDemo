package io.liaojie1314.paging3.api

import io.liaojie1314.paging3.bean.RepoResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface GithubServiceApi {

    @GET("search/repositories?sort=stars&q=Android")
    suspend fun getGithubServerData(
        @Query("page") page: Int, @Query("per_page") perPage: Int
    ): RepoResponse

    companion object {
        private const val BASE_URL = "https://api.github.com/"
        fun create(): GithubServiceApi {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(GithubServiceApi::class.java)
        }
    }
}