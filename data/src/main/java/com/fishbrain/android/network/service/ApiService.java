package com.fishbrain.android.network.service;

import com.fishbrain.android.BuildConfig;
import com.fishbrain.android.network.callback.CatchCallback;
import com.fishbrain.android.network.callback.CatchesCallback;

import java.util.Map;

import retrofit.http.GET;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.QueryMap;

/**
 * The Retrofit service with the two available requests
 * <p/>
 * Created by dimitris.lachanas on 22/08/15.
 */
public interface ApiService {

    @GET(BuildConfig.CATCHES_URL)
    void getCatches(@Query(BuildConfig.PAGE_URL)String pageId, @Query(BuildConfig.VERBOSITY_URL)String verbosity, @QueryMap Map<String,
                String> filters, CatchesCallback callback);

    @GET(BuildConfig.CATCHES_URL + "/{catchId}" + BuildConfig.VERBOSITY_URL)
    void getCatch(@Path("catchId")String catchId, @Query(BuildConfig.VERBOSITY_URL)int verbosity, CatchCallback callback);

}