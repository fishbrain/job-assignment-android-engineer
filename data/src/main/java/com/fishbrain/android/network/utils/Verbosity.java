package com.fishbrain.android.network.utils;

/**
 * This enum is used for defining the verbosity of the results of the request calls to the API. {@link #SMALL} is the least verbosity and
 * {@link #LARGE} the biggest
 *
 * Created by dimitris.lachanas on 23/08/15.
 */
public enum Verbosity {
    SMALL(1), MEDIUM(2), LARGE(3);

    private final int mValue;

    Verbosity(int value) {
        mValue = value;
    }

    public int getValue() {
        return mValue;
    }
}
