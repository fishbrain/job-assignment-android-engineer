package com.fishbrain.android.network.interactor;

import com.fishbrain.android.network.callback.CatchCallback;
import com.fishbrain.android.network.callback.CatchesCallback;
import com.fishbrain.android.network.service.ApiService;
import com.fishbrain.android.network.utils.Verbosity;

import java.util.Map;

/**
 * The implementation of {@link CatchesInteractor}
 *
 * Created by dimitris.lachanas on 22/08/15.
 */
public class CatchesInteractorImpl implements CatchesInteractor {

    ApiService mApiService;
    private String sVerbosity = "3";

    public CatchesInteractorImpl(ApiService mApiService) {
        this.mApiService = mApiService;
    }

    @Override
    public void fetchCatches(String pageId, Map filters) {
        mApiService.getCatches(pageId, sVerbosity, filters, new CatchesCallback());
    }

    @Override
    public void fetchCatch(String catchId) {
        mApiService.getCatch(catchId, Verbosity.LARGE.getValue(), new CatchCallback());
    }
}
