package com.fishbrain.android.domain;


import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by dimitris.lachanas on 22/08/15.
 */
public class Avatar {

    @SerializedName("sizes")
    private List<ImageSize> mSizes;

    public List<ImageSize> getSizes() {
        return mSizes;
    }

    public Avatar(List<ImageSize> mSizes) {
        this.mSizes = mSizes;
    }
}
