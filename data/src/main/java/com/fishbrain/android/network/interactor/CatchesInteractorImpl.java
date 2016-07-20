package com.fishbrain.android.network.interactor;

import com.fishbrain.android.domain.Catch;
import com.fishbrain.android.event.CatchesEvent;
import com.fishbrain.android.exception.CatchesException;
import com.fishbrain.android.network.service.ApiService;
import com.fishbrain.android.network.utils.Verbosity;

import org.greenrobot.eventbus.EventBus;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * The implementation of {@link CatchesInteractor}
 * <p>
 * Created by dimitris.lachanas on 22/08/15.
 */
public class CatchesInteractorImpl implements CatchesInteractor {

	ApiService mApiService;
	private final static String VERBOSITY = "2";

	public CatchesInteractorImpl(ApiService mApiService) {
		this.mApiService = mApiService;
	}

	@Override
	public void fetchCatches(String pageId) throws IOException {
		Call<List<Catch>> catchesCall = mApiService.getCatches(pageId, VERBOSITY);
		catchesCall.enqueue(new Callback<List<Catch>>() {
			@Override
			public void onResponse(Call<List<Catch>> call, Response<List<Catch>> response) {
				List<Catch> catches = response.body();
				EventBus.getDefault().post(new CatchesEvent(catches));
			}

			@Override
			public void onFailure(Call<List<Catch>> call, Throwable t) {
				// Log error here since request failed
				EventBus.getDefault().post(new CatchesEvent(new CatchesException()));
			}
		});

	}

}
