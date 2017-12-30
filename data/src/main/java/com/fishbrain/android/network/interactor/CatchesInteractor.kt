package com.fishbrain.android.network.interactor

import java.io.IOException

/**
 * This is an interactor used for triggering the network calls in order to fetch the catch(es)
 * Created by dimitris.lachanas on 22/08/15.
 */
interface CatchesInteractor {

    /**
     * This method is used for fetching the catches from the API
     *
     * @param pageId    the pageId that we want to fetch from the API
     */
    @Throws(IOException::class)
    fun fetchCatches(pageId: String)

}
