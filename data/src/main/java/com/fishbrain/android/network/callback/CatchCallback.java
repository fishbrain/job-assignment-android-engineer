package com.fishbrain.android.network.callback;

import com.fishbrain.android.domain.Catch;
import com.fishbrain.android.event.CatchEvent;

import de.greenrobot.event.EventBus;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 *
 * This {@link Callback} is used in order to get response from Retrofir framework whether the request for a single catch was successful or
 * not
 * and the corresponding data
 *
 * Created by dimitris.lachanas on 23/08/15.
 */
public class CatchCallback implements Callback<Catch> {
    @Override
    public void success(Catch c, Response response) {
        EventBus.getDefault().post(new CatchEvent(c));
    }

    @Override
    public void failure(RetrofitError error) {
        EventBus.getDefault().post(new CatchEvent());
    }
}
