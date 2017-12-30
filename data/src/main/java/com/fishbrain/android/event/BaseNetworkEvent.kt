package com.fishbrain.android.event

import com.fishbrain.android.exception.NetworkException

/**
 * Base Event to use when interacting with the backend
 *
 * Created by dimitris on 20/07/16.
 */
open class BaseNetworkEvent<D> {

    val isFailure: Boolean;
    var data: D? = null;
    var networkException: NetworkException? = null;

    constructor(data: D) {
        this.data = data
        isFailure = false
    }

    constructor(networkException: NetworkException) {
        this.networkException = networkException
        isFailure = true
    }
}
