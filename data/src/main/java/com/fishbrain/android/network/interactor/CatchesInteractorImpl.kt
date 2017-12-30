package com.fishbrain.android.network.interactor

import com.fishbrain.android.domain.Catch
import com.fishbrain.android.event.CatchesEvent
import com.fishbrain.android.exception.CatchesException
import com.fishbrain.android.network.service.ApiService
import com.fishbrain.android.network.utils.Verbosity

import org.greenrobot.eventbus.EventBus

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
private val VERBOSITY = "2"

class CatchesInteractorImpl(internal var mApiService: ApiService) : CatchesInteractor {

    @Throws(IOException::class)
    override fun fetchCatches(pageId: String) {
        val catchesCall = mApiService.getCatches(pageId, VERBOSITY)
        catchesCall.enqueue(object : Callback<List<Catch>> {
            override fun onResponse(call: Call<List<Catch>>, response: Response<List<Catch>>) {
                val catches = response.body()
                EventBus.getDefault().post(CatchesEvent(catches))
            }

            override fun onFailure(call: Call<List<Catch>>, t: Throwable) {
                // Log error here since request failed
                EventBus.getDefault().post(CatchesEvent(CatchesException()))
            }
        })

    }


}
