package com.fishbrain.assignment.data.network.interactor

import android.util.Log
import android.widget.Toast
import com.fishbrain.assignment.data.domain.Catch
import com.fishbrain.assignment.data.event.CatchesEvent
import com.fishbrain.assignment.data.exception.CatchesException
import com.fishbrain.assignment.data.network.service.ApiService


import java.io.IOException

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * The implementation of [CatchesInteractor]
 *
 *
 * Created by dimitris.lachanas on 22/08/15.
 */
private const val VERBOSITY = "2"

class CatchesInteractorImpl(private var mApiService: ApiService) : CatchesInteractor {

    private val tag: String = "CatchesInteractorImpl"

    @Throws(IOException::class)
    override fun fetchCatches(pageId: String) {
        val catchesCall = mApiService.getCatches(pageId, VERBOSITY)
        catchesCall.enqueue(object : Callback<List<Catch>> {
            override fun onResponse(call: Call<List<Catch>>, response: Response<List<Catch>>) {
                val catches = response.body()
                // return here the catches, the way you want
                Log.d(tag,  "Great! " + catches?.size + " catches fetched!")
            }

            override fun onFailure(call: Call<List<Catch>>, t: Throwable) {
                // Log error here since request failed
            }
        })

    }


}
