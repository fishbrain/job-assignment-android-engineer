package com.fishbrain.android.domain;

import com.google.gson.annotations.SerializedName;

/**
 * This is the POJO for species
 *
 * Created by dimitris.lachanas on 22/08/15.
 */
public class Species {
    @SerializedName("id")
    private String mId;

    @SerializedName("name")
    private String mName;

    @SerializedName("species")
    private String mSpecies;

    @SerializedName("status")
    private String mStatus;

    @SerializedName("image")
    private String mImage;

    @SerializedName("photo")
    private Photo mPhoto;

    public Species(String mId, String mName, String mSpecies, String mStatus, String mImage, Photo photo) {
        this.mId = mId;
        this.mName = mName;
        this.mSpecies = mSpecies;
        this.mStatus = mStatus;
        this.mImage = mImage;
        this.mPhoto = photo;
    }

    public String getId() {
        return mId;
    }

    public String getName() {
        return mName;
    }

    public String getSpecies() {
        return mSpecies;
    }

    public String getStatus() {
        return mStatus;
    }

    public String getImage() {
        return mImage;
    }

    public Photo getPhoto() {
        return mPhoto;
    }
}
