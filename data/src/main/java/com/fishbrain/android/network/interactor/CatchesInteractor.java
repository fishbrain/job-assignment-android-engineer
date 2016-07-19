package com.fishbrain.android.network.interactor;

import java.util.Map;

/**
 * This is an interactor used for triggering the network calls in order to fetch the catch(es)
 * Created by dimitris.lachanas on 22/08/15.
 */
public interface CatchesInteractor {

    /**
     * This method is used for fetching the catches from the API
     *
     * @param pageId    the pageId that we want to fetch from the API
     * @param filters   the filters {@link Map} that contains the filters the user applied
     */
    void fetchCatches(String pageId, Map filters);

    /**
     * This method is used for fetching the details of a single catch from the API
     *
     * @param catchId   the id of the catch
     */
    void fetchCatch(String catchId);
}
