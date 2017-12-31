package com.fishbrain.assignment

import android.os.Bundle
import android.widget.Toast

import com.fishbrain.android.event.CatchesEvent
import com.fishbrain.android.network.RetrofitInstance
import com.fishbrain.android.network.interactor.CatchesInteractor
import com.fishbrain.android.network.interactor.CatchesInteractorImpl
import com.fishbrain.android.network.service.ApiService
import com.fishbrain.assignment.base.BaseActivity

import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe

import java.io.IOException

/**
 * Created by dimitris on 19/07/16.
 */

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        EventBus.getDefault().register(this)
        val catchesInteractor = CatchesInteractorImpl(RetrofitInstance.instance.create(ApiService::class.java))
        try {
            catchesInteractor.fetchCatches("1")
        } catch (e: IOException) {
            e.printStackTrace()
        }

    }

    override fun onDestroy() {
        EventBus.getDefault().unregister(this)
        super.onDestroy()
    }

    @Subscribe
    fun onEvent(event: CatchesEvent) {
        val numOfCatches = event.data?.size ?: 0
        Toast.makeText(this@MainActivity,  "Great! " + numOfCatches + " catches fetched!", Toast.LENGTH_LONG).show()
    }
}
