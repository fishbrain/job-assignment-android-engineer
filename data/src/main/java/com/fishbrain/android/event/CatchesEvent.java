package com.fishbrain.android.event;

import com.fishbrain.android.domain.Catch;

import java.util.List;

/**
 * This event is used for broadcasting the outcome of the network call for catches to the classes are interested
 *
 * Created by dimitris.lachanas on 22/08/15.
 */
public class CatchesEvent {

    List<Catch> mCatches;

    public CatchesEvent(List<Catch> catches) {
        mCatches = catches;
    }

    public CatchesEvent() {
        // here we have a failure
    }

    public List<Catch> getCatches() {
        return mCatches;
    }
}
