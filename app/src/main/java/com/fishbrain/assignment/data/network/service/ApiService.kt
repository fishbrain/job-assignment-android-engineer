package com.fishbrain.assignment.data.network.service

import com.fishbrain.assignment.BuildConfig
import com.fishbrain.assignment.data.domain.Catch

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query


/**
 * The RetrofitInstance service with the two available requests
 *
 *
 * Created by dimitris.lachanas on 22/08/15.
 */
interface ApiService {

    @GET(BuildConfig.CATCHES_URL)
    fun getCatches(@Query(BuildConfig.PAGE_URL) pageId: String, @Query(BuildConfig.VERBOSITY_URL) verbosity: String): Call<List<Catch>>

    @GET(BuildConfig.CATCHES_URL + "/{catchId}" + BuildConfig.VERBOSITY_URL)
    fun getCatch(@Path("catchId") catchId: String, @Query(BuildConfig.VERBOSITY_URL) verbosity: Int): Call<Catch>

}