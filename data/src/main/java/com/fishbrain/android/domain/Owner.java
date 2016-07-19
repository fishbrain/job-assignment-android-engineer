package com.fishbrain.android.domain;

import com.google.gson.annotations.SerializedName;

import java.util.Calendar;

/**
 * This is the POJO for Owners
 *
 * Created by dimitris.lachanas on 22/08/15.
 */
public class Owner {

    @SerializedName("nickname")
    private String mNickName;

    @SerializedName("first_name")
    private String mFirstName;

    @SerializedName("last_name")
    private String mLastName;

    @SerializedName("country_code")
    private String mCountryCode;

    @SerializedName("created_at")
    private Calendar mDateCreated;

    @SerializedName("featured")
    private boolean mFeatured;

    @SerializedName("is_premium")
    private boolean mIsPremium;

    @SerializedName("avatar")
    private Avatar mAvatar;

    public String getNickName() {
        return mNickName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }

    public String getCountryCode() {
        return mCountryCode;
    }

    public Calendar getDateCreated() {
        return mDateCreated;
    }

    public boolean isFeatured() {
        return mFeatured;
    }

    public boolean isIsPremium() {
        return mIsPremium;
    }

    public Avatar getAvatar() {
        return mAvatar;
    }

    public Owner(String mNickName, String mFirstName, String mLastName, String mCountryCode, Calendar mDateCreated, boolean mFeatured, boolean mIsPremium, Avatar mAvatar) {
        this.mNickName = mNickName;
        this.mFirstName = mFirstName;
        this.mLastName = mLastName;
        this.mCountryCode = mCountryCode;
        this.mDateCreated = mDateCreated;
        this.mFeatured = mFeatured;
        this.mIsPremium = mIsPremium;
        this.mAvatar = mAvatar;
    }
}
