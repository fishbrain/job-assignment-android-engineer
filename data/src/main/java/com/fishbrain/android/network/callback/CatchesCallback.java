package com.fishbrain.android.network.callback;

import com.fishbrain.android.domain.Catch;
import com.fishbrain.android.event.CatchesEvent;

import java.util.List;

import de.greenrobot.event.EventBus;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * This {@link Callback} is used in order to get response from Retrofir framework whether the request for catches was successful or not
 * and the corresponding data
 *
 * Created by dimitris.lachanas on 22/08/15.
 */
public class CatchesCallback implements Callback<List<Catch>>  {
    @Override
    public void success(List<Catch> catches, Response response) {
        EventBus.getDefault().post(new CatchesEvent(catches));
    }

    @Override
    public void failure(RetrofitError error) {
        EventBus.getDefault().post(new CatchesEvent());
    }
}
