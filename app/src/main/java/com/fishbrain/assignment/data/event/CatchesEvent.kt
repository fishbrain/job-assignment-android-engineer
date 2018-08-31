package com.fishbrain.assignment.data.event

import com.fishbrain.assignment.data.domain.Catch
import com.fishbrain.assignment.data.exception.CatchesException

/**
 * This event is used for broadcasting the outcome of the network call for catches to the classes are interested
 *
 *
 * Created by dimitris.lachanas on 22/08/15.
 */
class CatchesEvent : BaseNetworkEvent<List<Catch>> {

    constructor(catches: List<Catch>) : super(catches) {}

    constructor(catchesException: CatchesException) : super(catchesException) {}// here we have a failure
}
