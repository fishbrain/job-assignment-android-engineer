package com.fishbrain.android.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dimitris.lachanas on 23/08/15.
 */
public class Method {

    @SerializedName("id")
    private int mId;

    @SerializedName("type")
    private String mType;

    @SerializedName("localized_name")
    private String mLocalizedName;

    public Method(int id, String type, String localizedName) {
        this.mId = id;
        this.mType = type;
        this.mLocalizedName = localizedName;
    }

    public int getId() {
        return mId;
    }

    public String getType() {
        return mType;
    }

    public String getLocalizedName() {
        return mLocalizedName;
    }
}
