package com.fishbrain.assignment.presentation


import android.os.Bundle
import android.widget.Toast
import com.fishbrain.assignment.data.network.RetrofitInstance
import com.fishbrain.assignment.data.network.interactor.CatchesInteractorImpl
import com.fishbrain.assignment.data.network.service.ApiService
import com.fishbrain.assignment.R
import com.fishbrain.assignment.presentation.base.BaseActivity
import java.io.IOException

/**
 * Created by dimitris on 19/07/16.
 */

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main)
        val catchesInteractor = CatchesInteractorImpl(RetrofitInstance.instance.create(ApiService::class.java))
        try {
            catchesInteractor.fetchCatches("1")
        } catch (e: IOException) {
            e.printStackTrace()
        }


    }

}
