package com.fishbrain.android.network.service;

import com.fishbrain.android.BuildConfig;
import com.fishbrain.android.domain.Catch;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;


/**
 * The RetrofitInstance service with the two available requests
 * <p/>
 * Created by dimitris.lachanas on 22/08/15.
 */
public interface ApiService {

	@GET(BuildConfig.CATCHES_URL)
	Call<List<Catch>> getCatches(@Query(BuildConfig.PAGE_URL) String pageId, @Query(BuildConfig.VERBOSITY_URL) String verbosity);

	@GET(BuildConfig.CATCHES_URL + "/{catchId}" + BuildConfig.VERBOSITY_URL)
	Call<Catch> getCatch(@Path("catchId") String catchId, @Query(BuildConfig.VERBOSITY_URL) int verbosity);

}