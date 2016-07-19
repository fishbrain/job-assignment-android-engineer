package com.fishbrain.android.domain;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * This is the POJO for photos
 *
 * Created by dimitris.lachanas on 22/08/15.
 */
public class Photo {

    @SerializedName("sizes")
    private List<ImageSize> mSizes;

    @SerializedName("max_weight")
    private String mMaxWeight;

    public Photo(List<ImageSize> mSizes, String mMaxWeight) {
        this.mSizes = mSizes;
        this.mMaxWeight = mMaxWeight;
    }

    public List<ImageSize> getSizes() {
        return mSizes;
    }

    public String getMaxWeight() {
        return mMaxWeight;
    }
}
