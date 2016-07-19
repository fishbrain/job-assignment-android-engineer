package com.fishbrain.android.domain;

import com.google.gson.annotations.SerializedName;

/**
 * This is the POJO for PhotoContainers
 *
 * Created by dimitris.lachanas on 22/08/15.
 */
public class PhotoContainer {

    @SerializedName("photo")
    Photo mPhoto;

    public PhotoContainer(Photo mPhoto) {
        this.mPhoto = mPhoto;
    }

    public Photo getPhoto() {
        return mPhoto;
    }
}
