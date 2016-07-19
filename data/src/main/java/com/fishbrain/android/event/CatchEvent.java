package com.fishbrain.android.event;

import com.fishbrain.android.domain.Catch;

/**
 * This event is used for broadcasting the outcome of the network call for a single catch to the classes are interested
 *
 * Created by dimitris.lachanas on 23/08/15.
 */
public class CatchEvent {
    private Catch mCatch;

    public CatchEvent() {
        // here we have a failure
    }


    public Catch getCatch() {
        return mCatch;
    }

    public void setCatch(Catch c) {
        this.mCatch = c;
    }

    public CatchEvent(Catch mCatch) {
        this.mCatch = mCatch;
    }
}
