package com.fishbrain.android.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by dimitris.lachanas on 22/08/15.
 */
public class ImageSize {

    @SerializedName("geometry")
    private String mGeometry;

    @SerializedName("url")
    private String mUrl;

    @SerializedName("name")
    private String mName;

    @SerializedName("width")
    private String mWidth;

    @SerializedName("height")
    private String mHeight;

    public ImageSize(String mGeometry, String mUrl, String mName, String mWidth, String mHeight) {
        this.mGeometry = mGeometry;
        this.mUrl = mUrl;
        this.mName = mName;
        this.mWidth = mWidth;
        this.mHeight = mHeight;
    }

    public String getGeometry() {
        return mGeometry;
    }

    public String getUrl() {
        return mUrl;
    }

    public String getName() {
        return mName;
    }

    public String getWidth() {
        return mWidth;
    }

    public String getHeight() {
        return mHeight;
    }
}
