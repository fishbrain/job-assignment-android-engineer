package com.fishbrain.android.event;

import java.util.Map;

/**
 * Created by dimitris.lachanas on 23/08/15.
 */
public class FiltersEvent {
    private final Map mFilters;

    public FiltersEvent(Map filters) {
        mFilters = filters;
    }

    public Map getFilters() {
        return mFilters;
    }
}
